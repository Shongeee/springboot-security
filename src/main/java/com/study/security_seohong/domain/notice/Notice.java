package com.study.security_seohong.domain.notice;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Notice {
	private int notice_code;
	private String notice_title;
	private int user_code;
	private String notice_content;
	private int notice_count;
	private String file_name;
	private LocalDateTime create_date;
}
