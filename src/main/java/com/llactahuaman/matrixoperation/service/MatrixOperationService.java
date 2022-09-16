package com.llactahuaman.matrixoperation.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.llactahuaman.matrixoperation.validador.MatrixValidatingService;

@Service
public class MatrixOperationService implements IMatrixOperationService {

	private final MatrixValidatingService matrixValidatingService;

	public MatrixOperationService(MatrixValidatingService matrixValidatingService) {
		this.matrixValidatingService = matrixValidatingService;
	}

	@Override
	public List<List<Integer>> getMatrixRotation(List<List<Integer>> matrixOriginal) {

		List<List<Integer>> matrixFinal = new ArrayList<>();
		Integer posicion;

		matrixValidatingService.isMatrixValidate(matrixOriginal);

		posicion = matrixOriginal.size() - 1;

		while (posicion >= 0) {
			matrixFinal.add(this.getNewRow(matrixOriginal, posicion));
			posicion--;
		}

		return matrixFinal;
	}

	private List<Integer> getNewRow(List<List<Integer>> matrixOriginal, Integer posicion) {
		return matrixOriginal.stream().map(list -> list.get(posicion)).collect(Collectors.toList());
	}
}
