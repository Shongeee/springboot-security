package com.study.security_seohong.service.notice;

import com.study.security_seohong.web.dto.notice.AddNoticeReqDto;

public interface NoticeService {
	public int addNotice(AddNoticeReqDto addNoticeReqDto) throws Exception;
}
