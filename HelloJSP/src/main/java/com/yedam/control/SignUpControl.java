package com.yedam.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;
import com.yedam.service.MemberService;
import com.yedam.service.MemberServiceImpl;
import com.yedam.vo.MemberVO;

public class SignUpControl implements Control {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			req.setCharacterEncoding("utf-8");
			
			// param: id,psw,name
			String id = req.getParameter("id");
			String psw = req.getParameter("psw");
			String name = req.getParameter("name");
			
			//
			MemberVO param = new MemberVO();
			param.setMemberId(id);
			param.setMemberPw(psw);
			param.setMemberName(name);
			MemberService svc = new MemberServiceImpl(); //회원처리하는 클래스
			if(svc.addMember(param)) {//등록
				// 회원정보 등록 -> 게시글목록 페이지.
				resp.sendRedirect("boardList.do");
			} else {
				System.out.println("에러발생.");
			}
			
	}//end of execute.

}
