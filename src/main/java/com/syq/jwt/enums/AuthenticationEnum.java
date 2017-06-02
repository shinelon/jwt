package com.syq.jwt.enums;

public enum AuthenticationEnum {
	PERMISSION_DENIED("0","认证失败"),PERMISSION_OK("0","认证成功");
	
	public String value;
	public String msg;
	
	private AuthenticationEnum(String value,String msg){
		this.value=value;
		this.msg=msg;
	}
}
