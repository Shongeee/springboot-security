package com.study.security_seohong.service.notice;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.study.security_seohong.web.dto.notice.AddNoticeReqDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class NoticeServiceImpl implements NoticeService {
	
	@Value("${file.path}")
	private String filePath;
	
	@Override
	public int addNotice(AddNoticeReqDto addNoticeReqDto) throws Exception {
		String originalFileName = addNoticeReqDto.getFile().get(0).getOriginalFilename();
		
		if(originalFileName.isBlank()) {
			
		}else {
			String tempFilename = UUID.randomUUID().toString().replaceAll("-","") + "_" + originalFileName;
			log.info(tempFilename);
		}
		
		return 0;
	}

}
