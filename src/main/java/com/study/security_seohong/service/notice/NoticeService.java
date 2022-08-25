package com.study.security_seohong.service.notice;

import java.util.List;

import com.study.security_seohong.web.dto.notice.AddNoticeReqDto;
import com.study.security_seohong.web.dto.notice.GetNoticeListRespDto;
import com.study.security_seohong.web.dto.notice.GetNoticeRespDto;

public interface NoticeService {
	public List<GetNoticeListRespDto> getNoticeList(int page, String searchFlag, String searchValue) throws Exception;
	public int addNotice(AddNoticeReqDto addNoticeReqDto) throws Exception;
	public GetNoticeRespDto getNotice(String flag, int noticeCode) throws Exception;
}
