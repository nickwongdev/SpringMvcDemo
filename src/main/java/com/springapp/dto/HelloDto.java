package com.springapp.dto;

/**
 * User: nwong
 * Date: 8/30/13
 * Time: 11:28 AM
 */
public class HelloDto {

	private int helloId;
	private String message;

	public HelloDto() {
	}

	public HelloDto(final int helloId, final String message) {
		this.helloId = helloId;
		this.message = message;
	}

	public int getHelloId() {
		return helloId;
	}

	public void setHelloId(final int helloId) {
		this.helloId = helloId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(final String message) {
		this.message = message;
	}
}
