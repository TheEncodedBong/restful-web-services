package com.teb.practice.restfulwebservices.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class BookNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3629865774018477189L;

	public BookNotFoundException(String message) {
		super(message.concat(", was not found."));
	}
}
