package com.find.vo;

import java.io.Serializable;

/**
 *
 * @author jay
 * @date Jan 22, 2016
 *
 */
public class LoginVo implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 账号 */
	private String username;

	/** 密码 */
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
