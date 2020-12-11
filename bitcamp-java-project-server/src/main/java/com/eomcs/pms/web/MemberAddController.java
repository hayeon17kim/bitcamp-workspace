package com.eomcs.pms.web;

import java.util.UUID;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.service.MemberService;
import net.coobird.thumbnailator.ThumbnailParameter;
import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;
import net.coobird.thumbnailator.name.Rename;

@MultipartConfig(maxFileSize = 1024 * 1024 * 10)
@Controller
public class MemberAddController{
  MemberService memberService;
  public MemberAddController(MemberService memberService) {
    this.memberService = memberService;
    // TODO Auto-generated constructor stub
  }

  @RequestMapping("/member/add")
  public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

    Member member = new Member();
    member.setName(request.getParameter("name"));
    member.setEmail(request.getParameter("email"));
    member.setPassword(request.getParameter("password"));
    member.setTel(request.getParameter("tel"));

    // <input type="file"...> 입력 값 꺼내기
    Part photoPart = request.getPart("photo");

    // 회원 사진을 저장할 위치를 알아낸다.
    // => 컨텍스트루트/upload/파일
    // => 파일을 저장할 때 사용할 파일명을 준비한다.
    String filename = UUID.randomUUID().toString();
    String saveFilePath = request.getServletContext().getRealPath("/upload/" + filename);

    // 해당 위치에 업로드된 사진 파일을 저장한다.
    photoPart.write(saveFilePath);

    // DB에 사진 파일 이름을 저장하기 위해 객체에 보관한다.
    member.setPhoto(filename);

    // 회원 사진의 썸네일 이미지 파일 생성하기
    generatePhotoThumbnail(saveFilePath);

    memberService.add(member);
    return "redirect:list";
  }

  private void generatePhotoThumbnail(String saveFilePath) {
    try {
      Thumbnails.of(saveFilePath)
      .size(30, 30)
      .outputFormat("jpg")
      .crop(Positions.CENTER)
      .toFiles(new Rename() {
        @Override
        public String apply(String name, ThumbnailParameter param) {
          return name + "_30x30";
        }
      });

      Thumbnails.of(saveFilePath)
      .size(120, 120)
      .outputFormat("jpg")
      .crop(Positions.CENTER)
      .toFiles(new Rename() {
        @Override
        public String apply(String name, ThumbnailParameter param) {
          return name + "_120x120";
        }
      });
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
