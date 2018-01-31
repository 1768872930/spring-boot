package com.liyimaster.entity.instrument;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
/**
 * 公共返回
 * @author hand
 *
 */
public class ResponseResult {

	public static ResponseEntity<ResponseError> requestError(String message, int code) {
		ResponseError error = new ResponseError();
		error.errorMessage(message, code);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
	}

	public static ResponseEntity<?> requestok(BaseResult body) {
		BaseResult result = new BaseResult();
		result.setBody(body);
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
}
