package com.ddominguezh.spring.core.shared.domain.exception;

import org.springframework.http.HttpStatus;

import com.ddominguezh.spring.core.shared.domain.DomainError;

@SuppressWarnings("serial")
public class AuthorizationException extends DomainError {

	public AuthorizationException() {
		super(HttpStatus.UNAUTHORIZED.value()+"", "Authorization invalid");
	}

}
