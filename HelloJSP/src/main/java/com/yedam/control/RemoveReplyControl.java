package com.yedam.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;
import com.yedam.service.ReplyService;
import com.yedam.service.ReplyServiceImpl;

import oracle.jdbc.replay.driver.ReplayStatisticsImpl;

public class RemoveReplyControl implements Control {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 댓글번호 -> DB삭제 -> 처리결과 반환.
		String rno = req.getParameter("rno"); //URI에서 (rno의 값을 입력하면 (Parameter) 서버에서 값을 받아온후 DB에서 데이터처리 
		
		// 서비스호출.
		ReplyService svc = new ReplyServiceImpl();
		if(svc.removeReply(Integer.parseInt(rno))) {
			// {"retCode":"OK"}
			resp.getWriter().print("{\"retCode\":\"OK\"}");
		} else {
			// {"retCode":"NG"}
			resp.getWriter().print("{\"retCode\":\"NG\"}");
		}
	}

}
