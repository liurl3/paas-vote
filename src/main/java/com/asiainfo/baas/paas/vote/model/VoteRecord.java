package com.asiainfo.baas.paas.vote.model;

import java.util.Date;

/**
 * ͶƱ��־
 */
public class VoteRecord {

	/**
	 * ͶƱ��־ID
	 */
	private int id;
	/**
	 * ip
	 */
	private String ip;
	/**
	 * �Id
	 */
	private int activeId;
	/**
	 * ѡ��Id
	 */
	private int optionId;
	/**
	 * ͶƱʱ��
	 */
	private Date voteDate;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getActiveId() {
		return this.activeId;
	}

	public void setActiveId(int activeId) {
		this.activeId = activeId;
	}

	public int getOptionId() {
		return this.optionId;
	}

	public void setOptionId(int optionId) {
		this.optionId = optionId;
	}

	public Date getVoteDate() {
		return this.voteDate;
	}

	public void setVoteDate(Date voteDate) {
		this.voteDate = voteDate;
	}

}