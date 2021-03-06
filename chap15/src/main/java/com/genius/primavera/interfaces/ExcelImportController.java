package com.genius.primavera.interfaces;

import com.genius.primavera.application.ExcelImportService;
import com.genius.primavera.domain.ExcelImportRequest;
import com.genius.primavera.domain.ExcelImportResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ExcelImportController {

	private final ExcelImportService excelImportService;

	@PostMapping("/save")
	public ResponseEntity<ExcelImportResponse> save(ExcelImportRequest excelRequest) throws IOException {
		return new ResponseEntity<>(excelImportService.excelImport(excelRequest), HttpStatus.CREATED);
	}
}