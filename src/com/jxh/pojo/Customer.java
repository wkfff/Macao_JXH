package com.jxh.pojo;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;

import com.fg.utils.ToolsUtils;

public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String custID;
	private String custCode;
	private String fullName;
	private String fullNameEng;
	private String sex;
	private String custType;
	private int cardStatus;
	private Date regDate;
	private Date validDate;
	private String cardType;
	private String cardNo;
	private String telNo;
	private String mobileTelNO;
	private String relationship;
	private String job;
	private String isSociaWork;

	private String custNO;
	private String custNewNO;

	private String amentiaName;// 活動
	private String regDate_str;
	private String validDate_str;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String custID, String custCode, String fullName, String fullNameEng, String sex, String custType,
			int cardStatus, Date regDate, Date validDate, String cardType, String cardNo, String telNo,
			String mobileTelNO, String relationship, String custNO, String custNewNO, String job, String isSociaWork,
			String amentiaName, String regDate_str, String validDate_str) {
		super();
		this.custID = custID;
		this.custCode = custCode;
		this.fullName = fullName;
		this.fullNameEng = fullNameEng;
		this.sex = sex;
		this.custType = custType;
		this.cardStatus = cardStatus;
		this.regDate = regDate;
		this.validDate = validDate;
		this.cardType = cardType;
		this.cardNo = cardNo;
		this.telNo = telNo;
		this.mobileTelNO = mobileTelNO;
		this.relationship = relationship;
		this.custNO = custNO;
		this.custNewNO = custNewNO;
		this.job = job;
		this.isSociaWork = isSociaWork;
		this.amentiaName = amentiaName;
		this.regDate_str = regDate_str;
		this.validDate_str = validDate_str;
	}

	public String getCustID() {
		return custID;
	}

	public void setCustID(String custID) {
		this.custID = custID;
	}

	public String getCustCode() {
		return custCode;
	}

	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getFullNameEng() {
		return fullNameEng;
	}

	public void setFullNameEng(String fullNameEng) {
		this.fullNameEng = fullNameEng;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCustType() {
		return custType;
	}

	public void setCustType(String custType) {
		this.custType = custType;
	}

	public int getCardStatus() {
		return cardStatus;
	}

	public void setCardStatus(int cardStatus) {
		this.cardStatus = cardStatus;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getValidDate() {
		return validDate;
	}

	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public String getMobileTelNO() {
		return mobileTelNO;
	}

	public void setMobileTelNO(String mobileTelNO) {
		this.mobileTelNO = mobileTelNO;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public String getCustNO() {
		if ("0".equals(custType)) {
			custNO = "";
		} else if ("1".equals(custType) || "2".equals(custType)) {
			custNO = custCode;
		}
		return custNO;
	}

	public void setCustNO(String custNO) {
		if ("1".equals(custType) || "2".equals(custType)) {
			this.custCode = custNO;
		}
		this.custNO = custNO;
	}

	public String getCustNewNO() {
		if ("0".equals(custType)) {
			custNewNO = custCode;
		} else if ("1".equals(custType) || "2".equals(custType)) {
			custNewNO = "";
		}
		return custNewNO;
	}

	public void setCustNewNO(String custNewNO) {
		if ("0".equals(custType)) {
			this.custCode = custNewNO;
		}
		this.custNewNO = custNewNO;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getIsSociaWork() {
		return isSociaWork;
	}

	public void setIsSociaWork(String isSociaWork) {
		this.isSociaWork = isSociaWork;
	}

	public String getAmentiaName() {
		// amentiaName = fullName;
		return fullName;
	}

	public void setAmentiaName(String amentiaName) {
		this.amentiaName = amentiaName;
	}

	public String getRegDate_str() {
		try {
			return regDate == null || "".equals(regDate) ? ""
					: ToolsUtils.getDateStringByFormat(regDate, null, "yyyy-MM-dd");
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	public void setRegDate_str(String regDate_str) {
		this.regDate_str = regDate_str;
	}

	public String getValidDate_str() {
		try {
			return validDate == null || "".equals(validDate) ? ""
					: ToolsUtils.getDateStringByFormat(validDate, null, "yyyy-MM-dd");
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	public void setValidDate_str(String validDate_str) {
		this.validDate_str = validDate_str;
	}

	@Override
	public String toString() {
		return "Customer [custID=" + custID + ", custCode=" + custCode + ", fullName=" + fullName + ", fullNameEng="
				+ fullNameEng + ", sex=" + sex + ", custType=" + custType + ", cardStatus=" + cardStatus + ", regDate="
				+ regDate + ", validDate=" + validDate + ", cardType=" + cardType + ", cardNo=" + cardNo + ", telNo="
				+ telNo + ", mobileTelNO=" + mobileTelNO + ", relationship=" + relationship + ",custNO=" + custNO
				+ ",custNewNO=" + custNewNO + ",job=" + job + ",isSociaWork=" + isSociaWork + ",amentiaName="
				+ amentiaName + ",regDate_str=" + regDate_str + ",validDate_str=" + validDate_str + "]";
	}

}
