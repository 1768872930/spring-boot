package com.liyimaster.entity.instrument;

public class ResponseError {
	public ResponseError errorMessage(String message, int code) {
		ResponseError error = new ResponseError();
		error.getError().setMessage(message);
		error.getError().setType("ERROR");
		error.getError().setCode(code);
		return error;
	}

	private Error error = new Error();

	public Error getError() {
		return error;
	}

	public class Error {
		private String message;

		private String type;

		private int code;

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public int getCode() {
			return code;
		}

		public void setCode(int code) {
			this.code = code;
		}
	}

}
