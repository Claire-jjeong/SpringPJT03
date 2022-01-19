package kr.smhrd.web;



import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import kr.board.domain.Member;

@Controller //전처리 하기 위한 표현
public class BoardController { 
	
	//1. 게시판 리스트를 보여달라는 요청을 받아서 DB에서 가져오는 일
	//HandlerMapping
	@RequestMapping("/") //첫페이지 
	public String main() {
		return "basic";
	}
	@RequestMapping("/login.do")
	public String login(Member vo) { //memId,memPass
		//로그인 처리
		return "redirect:/";
	}

}
