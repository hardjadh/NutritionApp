package com.app.nutritionapp.Exception;

public class DuplicateIdException extends Exception {
	public DuplicateIdException() {
		super();
	}
	public DuplicateIdException(String errMsg) {
		super(errMsg);
	}
}
