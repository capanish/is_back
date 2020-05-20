package com.irs.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

/**
 * Thrown in service classes
 */
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class ApiException extends Exception {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3408824331921937054L;

	/**
	 * The constructor.
	 */
	public ApiException() {

		super();
	}

	/**
	 * The constructor.
	 *
	 * @param cause The root cause of this exception.
	 */
	public ApiException(Throwable cause) {

		super(cause);
	}

	/**
	 * The constructor.
	 *
	 * @param message Exception text
	 * @param cause   The root cause of this exception.
	 */
	public ApiException(String message, Throwable cause) {

		super(message, cause);
	}

	/**
	 * The constructor.
	 *
	 * @param message Exception text
	 */
	public ApiException(String message) {

		super(message);
	}

}
