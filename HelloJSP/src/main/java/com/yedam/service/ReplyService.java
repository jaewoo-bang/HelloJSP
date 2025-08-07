package com.yedam.service;

import java.util.List;

import com.yedam.vo.EventVO;
import com.yedam.vo.ReplyVO;

public interface ReplyService {
	List<ReplyVO> replyList(int boardNo, int page); //목록.
	boolean removeReply(int replyNo); //삭제.
	boolean addReply(ReplyVO reply); // 등록.
	int replyCount(int boardNo); //댓글 건수 계산
	//이벤트 목록, 추가, 삭제기능
	boolean addEvent(EventVO event);	//일정 등록
	boolean removeEvent(int eventId);	//일정 삭제
	List<EventVO> eventList();			//일정 목록
}
