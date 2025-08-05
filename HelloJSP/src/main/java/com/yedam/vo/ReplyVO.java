package com.yedam.vo;

import java.util.Date;

import lombok.Data;

@Data
public class ReplyVO {
	private int replyno;
	private int boardno;
	private String reply;
	private String replyer;
	private Date replyDate;
}
