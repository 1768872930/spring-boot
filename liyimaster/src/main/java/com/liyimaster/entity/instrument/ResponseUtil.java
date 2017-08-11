package com.liyimaster.entity.instrument;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseUtil {

	public static ResponseEntity<ResponseError> RequestError(String message, int code) {
		ResponseError error = new ResponseError();
		error.errorMessage(message, code);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
	}

	public static ResponseEntity<Object> requestok(Object result) {
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
}
