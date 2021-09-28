package com.cg.otms.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CentralizedExceptionHandler {
<<<<<<< HEAD

	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(AdminNotFoundException.class)
	public String handleAdminNotFound(AdminNotFoundException e) {
		return e.getMessage();
	}

=======
	
>>>>>>> ac8b7f09c35d4aaeb4816878ef7887f7d767836f
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(TestNotFoundException.class)
	public String handleTestNotFound(TestNotFoundException e) {
		return e.getMessage();
	}
<<<<<<< HEAD

=======
	
>>>>>>> ac8b7f09c35d4aaeb4816878ef7887f7d767836f
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(TestAlreadyExistsException.class)
	public String handleTestExists(TestAlreadyExistsException e) {
		return e.getMessage();
	}
<<<<<<< HEAD

=======
	
>>>>>>> ac8b7f09c35d4aaeb4816878ef7887f7d767836f
	@ResponseStatus(HttpStatus.EXPECTATION_FAILED)
	@ExceptionHandler(Exception.class)
	public String handleError(Exception e) {
		e.printStackTrace();
		return e.getMessage();
	}
}
