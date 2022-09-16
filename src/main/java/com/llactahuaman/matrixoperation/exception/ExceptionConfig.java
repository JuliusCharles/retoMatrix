package com.llactahuaman.matrixoperation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.llactahuaman.matrixoperation.enums.ErrorEnum;
import com.llactahuaman.matrixoperation.model.ResponseException;

@RestControllerAdvice
public class ExceptionConfig {

	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ResponseEntity<Object> errorBadRequest1(Exception ex) {
		return new ResponseEntity<>(this.getMensajeError(ErrorEnum.WRONG_VALUE, HttpStatus.BAD_REQUEST),
				HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler({ IndexOutOfBoundsException.class })
	public ResponseEntity<Object> errorBadRequest2(Exception ex) {		
		return new ResponseEntity<>(this.getMensajeError(ErrorEnum.DIFFERENT_SIZE_LISTS, HttpStatus.BAD_REQUEST),
				HttpStatus.BAD_REQUEST);
	}

	private ResponseException getMensajeError(ErrorEnum errorEnum, HttpStatus httpStatus) {
		return ResponseException.builder().httpStatus(httpStatus).code(errorEnum.getCode()).title(errorEnum.getTitle())
				.detail(errorEnum.getDetail()).build();
	}
}
