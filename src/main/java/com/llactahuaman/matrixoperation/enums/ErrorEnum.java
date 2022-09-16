package com.llactahuaman.matrixoperation.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorEnum {

	WRONG_VALUE("ER001", "Wrong value", "Wrong value, enter only numeric values"),
	DIFFERENT_SIZE_LISTS("ER002", "Different size lists", "Lists are not the same size,must be an NxN matrix");

	private String code;
	private String title;
	private String detail;

}
