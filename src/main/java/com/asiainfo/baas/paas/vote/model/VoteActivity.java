package com.asiainfo.baas.paas.vote.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * ���Ϣ��
 */
public class VoteActivity implements Serializable{

	private static final long serialVersionUID = 1L;
	/**
	 * �ID
	 */
	private int id;
	/**
	 * �����
	 */
	private String title;
	/**
	 * ����ͣ���ѡ����ѡ��
	 */
	private String type;
	private Date expireDate;
	private Date createDate;
	/**
	 * ͶƱ�������ƣ�0������ ��
	 */
	private int amoutLimit;
	/**
	 * ״̬��1���� 2�رգ�
	 */
	private String status;
	/**
	 * ������
	 */
	private String ip;
	private List<Option> attribute;
	private List<Option> options;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getExpireDate() {
		return this.expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getAmoutLimit() {
		return this.amoutLimit;
	}

	public void setAmoutLimit(int amoutLimit) {
		this.amoutLimit = amoutLimit;
	}

	public List<Option> getAttribute() {
		return this.attribute;
	}

	public void setAttribute(List<Option> options) {
		this.attribute = options;
	}

	public List<Option> getOptions() {
		return this.options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}

}