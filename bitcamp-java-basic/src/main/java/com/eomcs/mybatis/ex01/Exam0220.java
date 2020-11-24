// Mybatis - 클래스 별명 지정하기
package com.eomcs.mybatis.ex01;

import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// mybatis 설정 파일에서 fully-qualified class name 을 사용하는 대신에
// 짧은 이름으로 대체할 수 있다.
// <typeAliases>
// <typeAlias type="com.eomcs.mybatis.ex01.Board" alias="abc"/>
// </typeAliases>
//
// 그러면 이 별명을 어디에 사용하는가?
// => SQL 맵퍼 파일에서 클래스를 지정할 때 사용한다.
// <select id="selectBoard2" resultType="abc">
// select
// board_id as no,
// title,
// contents as content,
// created_date registeredDate,
// view_count viewCount
// from x_board
// </select>
//

// 참고!
// -> 자바 primitive type고 wrapper 클래스, String 클래스
// 일부 유틸리티 클래스 등에 대해서는 mybatis가 일부 이름을 지정해놓았다. 
public class Exam0220 {

  public static void main(String[] args) throws Exception {
    InputStream inputStream = Resources.getResourceAsStream( //
        "com/eomcs/mybatis/ex01/mybatis-config03.xml");
    SqlSessionFactory factory = //
        new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession sqlSession = factory.openSession();

    List<Board> list = sqlSession.selectList("BoardMapper.selectBoard");

    for (Board board : list) {
      System.out.printf("%d, %s, %s, %s, %d\n", //
          board.getNo(), //
          board.getTitle(), //
          board.getContent(), //
          board.getRegisteredDate(), //
          board.getViewCount());
    }

    sqlSession.close();
  }

}


