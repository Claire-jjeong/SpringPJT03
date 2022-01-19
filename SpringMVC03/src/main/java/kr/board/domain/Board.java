package kr.board.domain;

import lombok.Data;

@Data //lombok(롬복)API
public class Board { 
	//property(프로퍼티, 속성)
	private int idx; //번호 
	private String memId;
	private String title;//제목 
	private String contents; //내용 
	private String writer; //작성자 
	private String indate; //작성일 
	private int count; //조회수
	//디폴트 생성자가 만들어져있지 않기 때문에 Parameter수집 시 Controller에서 vo호출 시 에러 발생
	
	
}
