package kr.smhrd.web;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import kr.board.domain.Member;
import kr.board.service.BoardService;

@Controller //전처리 하기 위한 표현
public class BoardController { 
	
	@Autowired
	BoardService service;
	//1. 게시판 리스트를 보여달라는 요청을 받아서 DB에서 가져오는 일
	//HandlerMapping
	@RequestMapping("/") //첫페이지 
	public String main() {
		return "basic";
	}
	@RequestMapping("/login.do")
	public String login(Member vo,HttpSession session) { //memId,memPass
		//로그인 처리
		Member mvo = service.login(vo);
		if (mvo!=null) { //로그인성공 -> 객체 바인딩 (HttpSession) / request 바인딩은1개의 jsp만 가능 
			session.setAttribute("mvo", mvo);
		}
		return "redirect:/";
	}

}
