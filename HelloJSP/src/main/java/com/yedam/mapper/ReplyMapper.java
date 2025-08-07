package com.yedam.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.vo.EventVO;
import com.yedam.vo.ReplyVO;

public interface ReplyMapper {
	List<ReplyVO> replyList(@Param("boardNo") int boardNo, @Param("page") int page);	//목록.
	int deleteReply(int replyNo); // 삭제.
	int insertReply(ReplyVO reply); // 등록.
	int selectCount(int boardNo); //댓글 건수 계산.
	// 목록, 추가, 삭제. -> mapper.xml 에 추가.
	int insertEvent(EventVO event);
	int deleteEvent(int eventId);
	List<EventVO> eventList();
}
