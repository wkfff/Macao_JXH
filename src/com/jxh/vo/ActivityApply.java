package com.jxh.vo;

import java.io.Serializable;
import java.util.Date;
import java.math.*;

/**
 * ActivityApply
 * 
 * applyID,type,registerDate,custID,pCustID,parentsExpense,amentiaExpense,
 * family, ,fExpense,fNumber,note,actID,amentiaName,parentsName,tel,total
 * ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?
 * 
 * activityApply.applyID,activityApply.type,activityApply.registerDate,
 * activityApply.custID,activityApply.pCustID,activityApply.parentsExpense,
 * activityApply.amentiaExpense,activityApply.family,activityApply.fExpense,
 * activityApply.fNumber,activityApply.note,activityApply.actID,activityApply.
 * amentiaName,activityApply.parentsName,activityApply.tel,activityApply.total
 * 
 * applyID=?,type=?,registerDate=?,custID=?,pCustID=?,parentsExpense=?,
 * amentiaExpense=?,family=?,fExpense=?,fNumber=?,note=?,actID=?,amentiaName=?,
 * parentsName=?,tel=?,total=?
 */
public class ActivityApply implements Serializable {
	private static final long serialVersionUID = 1L;
	private String applyID;
	private int type;
	private Date registerDate;
	private String custID;
	private String pCustID;
	private BigDecimal parentsExpense;
	private BigDecimal amentiaExpense;
	private String family;
	private BigDecimal fExpense;
	private int fNumber;
	private String note;
	private String actID;
	private String amentiaName;
	private String parentName;
	private String tel;
	private int total;//總人數

	public ActivityApply() {
		super();
	}

	public ActivityApply(String applyID, int type, Date registerDate, String custID, String pCustID,
			BigDecimal parentsExpense, BigDecimal amentiaExpense, String family, BigDecimal fExpense, int fNumber,
			String note, String actID, String amentiaName, String parentName, String tel,int total) {
		super();
		this.applyID = applyID;
		this.type = type;
		this.registerDate = registerDate;
		this.custID = custID;
		this.pCustID = pCustID;
		this.parentsExpense = parentsExpense;
		this.amentiaExpense = amentiaExpense;
		this.family = family;
		this.fExpense = fExpense;
		this.fNumber = fNumber;
		this.note = note;
		this.actID = actID;
		this.amentiaName = amentiaName;
		this.parentName = parentName;
		this.tel = tel;
		this.total=total;
	}

	public String getAmentiaName() {
		return amentiaName;
	}

	public void setAmentiaName(String amentiaName) {
		this.amentiaName = amentiaName;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public void setApplyID(String applyID) {
		this.applyID = applyID;
	}

	public String getApplyID() {
		return applyID;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getType() {
		return type;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setCustID(String custID) {
		this.custID = custID;
	}

	public String getCustID() {
		return custID;
	}

	public void setParentsExpense(BigDecimal parentsExpense) {
		this.parentsExpense = parentsExpense;
	}

	public BigDecimal getParentsExpense() {
		return parentsExpense;
	}

	public void setAmentiaExpense(BigDecimal amentiaExpense) {
		this.amentiaExpense = amentiaExpense;
	}

	public BigDecimal getAmentiaExpense() {
		return amentiaExpense;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getFamily() {
		return family;
	}


	public void setNote(String note) {
		this.note = note;
	}

	public String getNote() {
		return note;
	}

	public String getpCustID() {
		return pCustID;
	}

	public void setpCustID(String pCustID) {
		this.pCustID = pCustID;
	}

	public BigDecimal getfExpense() {
		return fExpense;
	}

	public void setfExpense(BigDecimal fExpense) {
		this.fExpense = fExpense;
	}

	public int getfNumber() {
		return fNumber;
	}

	public void setfNumber(int fNumber) {
		this.fNumber = fNumber;
	}

	public String getActID() {
		return actID;
	}

	public void setActID(String actID) {
		this.actID = actID;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "ActivityApply [applyID=" + applyID + ",type=" + type + ",registerDate=" + registerDate + ",custID="
				+ custID + ",pCustID=" + pCustID + ",parentsExpense=" + parentsExpense + ",amentiaExpense="
				+ amentiaExpense + ",family=" + family + ",fExpense=" + fExpense + ",fNumber=" + fNumber + ",note="
				+ note + ",actID=" + actID + ",amentiaName=" + amentiaName + ",parentName=" + parentName + ",tel="
				+ tel + ",total="+total+ "]";
	}
}
