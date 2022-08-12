package com.study.security_seohong.service.auth;

import org.springframework.stereotype.Service;

import com.study.security_seohong.domain.user.UserRepository;
import com.study.security_seohong.handler.aop.annotation.Log;
import com.study.security_seohong.web.dto.auth.UsernameCheckReqDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
	
	private final UserRepository userRepository;
	
	@Log
	@Override
	public boolean checkUsername(UsernameCheckReqDto usernameCheckReqDto) throws Exception {
		
		return userRepository.findUserByUsername(usernameCheckReqDto.getUsername()) == null;
	}
	
	@Log
	@Override
	public boolean signup() {
		
		return false;
	}

}
