package kr.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.board.domain.Board;
import kr.board.domain.Member;
import kr.board.mapper.BoardMapper;

@Service
public class BoardService { //로직구현

	@Autowired
	private BoardMapper mapper; //db연동 역할 --> requestmapping 필요 없음 
	
	public List<Board> boardListAjax() {
		List<Board> list=mapper.boardList();
		return list;
	
	}

	public void boardInsertAjax(Board vo) {
		mapper.boardInsert(vo);
	}

	public void boardContentUpdateAjax(Board vo) {
			//요청이 왔던 곳으로 다시 응답이 가야하기 때문 (jsp가 아닌 ajax로 감)
		mapper.boardContentUpdateAjax(vo);
	}
	
	public void boardDeleteAjax(int idx) {
		mapper.boardDelete(idx);
	}
	
	public void boardTWUpdateAjax(Board vo) {
		mapper.boardTWUpdateAjax(vo);
	}
	public Member login(Member vo) {
		return mapper.login(vo);
	}


	public Board boardCountAjax(int idx) { 
		mapper.boardCountAjax(idx); //조회수 업데이트 
		// 다시 게시판 정보 가져오기
		Board vo = mapper.boardContent(idx);
		return vo;
	}


	
	
}
