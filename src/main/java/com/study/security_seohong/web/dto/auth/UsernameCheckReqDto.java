package com.study.security_seohong.web.dto.auth;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class UsernameCheckReqDto {
	@NotBlank
	@Size(max = 12, min = 4 /* , message ="4자 이상 12자 이하로 입력하세요." */)
	private String username;
}
