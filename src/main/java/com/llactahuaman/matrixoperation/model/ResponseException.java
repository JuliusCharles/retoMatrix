package com.llactahuaman.matrixoperation.model;

import org.springframework.http.HttpStatus;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ResponseException {

	private HttpStatus httpStatus;
	private String code;
	private String title;
	private String detail;
}
