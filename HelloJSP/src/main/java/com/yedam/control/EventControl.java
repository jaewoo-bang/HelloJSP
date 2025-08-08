package com.yedam.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.yedam.common.Control;
import com.yedam.service.ReplyService;
import com.yedam.service.ReplyServiceImpl;
import com.yedam.vo.EventVO;

public class EventControl implements Control {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			//1. 서비스 호출
			EventVO event = new EventVO();
			ReplyService svc = new ReplyServiceImpl();
			List<EventVO> list = svc.eventList(event); //목록 가져오기
			//2. JSON으로 응답
			resp.setContentType("application/json;charset=UTF-8");
			Gson gson = new Gson();
			resp.getWriter().print(gson.toJson(list));
			
			
			
			
		
		}

	}
