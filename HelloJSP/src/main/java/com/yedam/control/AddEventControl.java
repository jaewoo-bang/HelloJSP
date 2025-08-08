package com.yedam.control;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yedam.common.Control;
import com.yedam.service.ReplyService;
import com.yedam.service.ReplyServiceImpl;
import com.yedam.vo.EventVO;

public class AddEventControl implements Control {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("application/json;charset=utf-8");

		String title = req.getParameter("title");
		String sDate = req.getParameter("start");
		String eDate = req.getParameter("end");
		
		EventVO rvo = new EventVO();  //VO 객체에 파라미터로 받아온 값을 저장
		rvo.setTitle(title);
		rvo.setStart(sDate);
		rvo.setEnd(eDate);
		ReplyService svc = new ReplyServiceImpl();
		try {
			svc.addEvent(rvo);
			resp.getWriter().print("{\"retCode\":\"OK\"}"); // {"retcode"
		} catch (Exception e) {
			e.printStackTrace();
			resp.getWriter().print("{\"retCode\":\"NG\"}"); // {"retCode"
		}
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(rvo); // 자바객체 -> json문자열.
		resp.getWriter().print(json);
		
	}

}
