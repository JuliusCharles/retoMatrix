package com.llactahuaman.matrixoperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.llactahuaman.matrixoperation.service.IMatrixOperationService;

@RestController
@RequestMapping("/matrixOperation")
public class MatrixOperationController {

	@Autowired
	private IMatrixOperationService matrixOperationService;

	@PostMapping(value = "/rotation", produces = "application/json", consumes = "application/json")
	public List<List<Integer>> matrixRotation(@RequestBody List<List<Integer>> matriz) {
		return matrixOperationService.getMatrixRotation(matriz);
	}

}
