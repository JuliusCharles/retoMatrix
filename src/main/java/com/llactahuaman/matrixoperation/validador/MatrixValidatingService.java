package com.llactahuaman.matrixoperation.validador;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class MatrixValidatingService {

	public void isMatrixValidate(List<List<Integer>> matrix) {

		boolean valid = matrix.isEmpty() ? Boolean.FALSE : Boolean.TRUE;

		if (valid) {
			List<Integer> sizeLists = matrix.stream().map(list -> list.size()).collect(Collectors.toList());
			Integer unico = sizeLists.stream().distinct().collect(Collectors.toList()).size();
			valid = (unico == 1 && sizeLists.size() == sizeLists.get(0)) ? Boolean.TRUE : Boolean.FALSE;
		}

		if (!valid) {
			throw new IndexOutOfBoundsException();
		}
	}

}
