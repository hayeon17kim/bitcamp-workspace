package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
<<<<<<< HEAD
import com.eomcs.pms.service.BoardService;
import com.eomcs.util.Prompt;

=======
import java.util.List;
import java.util.Map;
import com.eomcs.pms.domain.Board;
import com.eomcs.pms.service.BoardService;
import com.eomcs.util.Prompt;
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
@CommandAnno("/board/delete")
public class BoardDeleteCommand implements Command {

  BoardService boardService;

  public BoardDeleteCommand(BoardService boardService) {
    this.boardService = boardService;
  }
  
  @Override
  public void execute(Request request) {
    PrintWriter out = request.getWriter();
    BufferedReader in = request.getReader();
<<<<<<< HEAD

=======
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
    try {
      out.println("[게시물 삭제]");
      int no = Prompt.inputInt("번호? ", out, in);

      String response = Prompt.inputString("정말 삭제하시겠습니까?(y/N) ", out, in);
      if (!response.equalsIgnoreCase("y")) {
        out.println("게시글 삭제를 취소하였습니다.");
        return;
      }
<<<<<<< HEAD

      if (boardService.delete(no) == 0) {
        out.println("해당 번호의 게시글이 없습니다.");
        return;
      }
      out.println("게시글을 삭제하였습니다.");

    } catch (Exception e) {
      out.printf("작업 처리 중 오류 발생! - %s\n", e.getMessage());
      e.printStackTrace();
    }
  }
=======
      
      int count = boardService.delete(no);
     if (count == 0) {
       out.println("해당 번호의 게시물이 존재하지 않습니다.");
     } else {
       out.println("게시글을 삭제하였습니다.");
     }


    } catch (Exception e) {
      out.printf("작업 처리 중 오류 발생! - %s\n", e.getMessage());
    }
  }

>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
}
