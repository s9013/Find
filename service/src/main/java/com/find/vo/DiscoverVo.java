package com.find.vo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author jay
 * @date Jan 22, 2016
 *
 */
public class DiscoverVo implements Serializable {

	private static final long serialVersionUID = 1L;

	/** id */
	private String id;
	
	/** 标题 */
	private String title;

	/** 时间 */
	private Date date;

	
	
	public DiscoverVo(String title, Date date) {
		super();
		this.title = title;
		this.date = date;
	}

	public DiscoverVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public DiscoverVo(String id, String title, Date date) {
		super();
		this.id = id;
		this.title = title;
		this.date = date;
	}

}
