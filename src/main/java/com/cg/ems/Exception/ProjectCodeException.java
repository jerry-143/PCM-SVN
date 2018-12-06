package com.cg.ems.Exception;

public class ProjectCodeException extends RuntimeException {

	String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public ProjectCodeException(String msg) {
		super(msg);
		msg=this.msg;
	}
	
	
	
	
	


}
