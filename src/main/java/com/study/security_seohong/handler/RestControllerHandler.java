package com.study.security_seohong.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.study.security_seohong.handler.exception.CustomValidationApiException;
import com.study.security_seohong.web.dto.CMRespDto;

@RestController
@ControllerAdvice
public class RestControllerHandler {
	
	@ExceptionHandler(CustomValidationApiException.class)
	public ResponseEntity<?> validationApiException(CustomValidationApiException e){
		return ResponseEntity.badRequest().body(new CMRespDto<>(-1, e.getMessage(), e.getErrorMap()));
	}

}
