package com.asiainfo.baas.paas.vote.model;

import java.io.Serializable;

/**
 * ѡ����Ϣ
 */
public class Option implements Serializable{

	private static final long serialVersionUID = 1L;
	/**
	 * ѡ����
	 */
	private int id;
	/**
	 * ѡ��
	 */
	private String content;
	/**
	 * �ID
	 */
	private int activeId;
	/**
	 * ѡ��˳��
	 */
	private int sno;
	/**
	 * 0��Ч 1��Ч
	 */
	private int status;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getActiveId() {
		return this.activeId;
	}

	public void setActiveId(int activeId) {
		this.activeId = activeId;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}