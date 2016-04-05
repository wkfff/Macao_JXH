package com.jxh.pojo;

import java.io.Serializable;
import java.util.Date;
import java.math.*;

public class FamilySupportApplyPojo implements Serializable {
	private static final long serialVersionUID = 1L;
	private int applyID;
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
	private String parentsName;
	private String actWork;
	private String tel;

	private String fullName;

	private String workName;
	private int sex;
	private String workID;
	private String work;
	private String phone;
	private String workNO;
	private String custNO;
	private String custNewNO;
	private int age;

	public FamilySupportApplyPojo() {
		super();
	}

	public FamilySupportApplyPojo(int applyID, int type, Date registerDate, String custID, String pCustID,
			BigDecimal parentsExpense, BigDecimal amentiaExpense, String family, BigDecimal fExpense, int fNumber,
			String note, String actID, String amentiaName, String parentsName, String workName, int sex, String workID,
			String work, String phone, String workNO, String custNO, String custNewNO, int age, String fullName,
			String actWork, String tel) {
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
		this.parentsName = parentsName;
		this.workName = workName;
		this.sex = sex;
		this.workID = workID;
		this.work = work;
		this.phone = phone;
		this.workNO = workNO;
		this.custNO = custNO;
		this.custNewNO = custNewNO;
		this.age = age;
		this.fullName = fullName;
		this.actWork = actWork;
		this.tel = tel;
	}

	public void setApplyID(int applyID) {
		this.applyID = applyID;
	}

	public int getApplyID() {
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

	public void setActID(String actID) {
		this.actID = actID;
	}

	public String getActID() {
		return actID;
	}

	public void setAmentiaName(String amentiaName) {
		this.amentiaName = amentiaName;
	}

	public String getAmentiaName() {
		return amentiaName;
	}

	public void setParentsName(String parentsName) {
		this.parentsName = parentsName;
	}

	public String getParentsName() {
		return parentsName;
	}

	public String getWorkName() {
		return workName;
	}

	public void setWorkName(String workName) {
		this.workName = workName;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getWorkID() {
		return workID;
	}

	public void setWorkID(String workID) {
		this.workID = workID;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWorkNO() {
		return workNO;
	}

	public void setWorkNO(String workNO) {
		this.workNO = workNO;
	}

	public String getCustNO() {
		return custNO;
	}

	public void setCustNO(String custNO) {
		this.custNO = custNO;
	}

	public String getCustNewNO() {
		return custNewNO;
	}

	public void setCustNewNO(String custNewNO) {
		this.custNewNO = custNewNO;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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

	public String getActWork() {
		return actWork;
	}

	public void setActWork(String actWork) {
		this.actWork = actWork;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "FamilySupportApply [applyID=" + applyID + ",type=" + type + ",registerDate=" + registerDate + ",custID="
				+ custID + ",pCustID=" + pCustID + ",parentsExpense=" + parentsExpense + ",amentiaExpense="
				+ amentiaExpense + ",family=" + family + ",fExpense=" + fExpense + ",fNumber=" + fNumber + ",note="
				+ note + ",actID=" + actID + ",amentiaName=" + amentiaName + ",parentsName=" + parentsName
				+ ",workName=" + workName + ",sex=" + sex + ",workID=" + workID + ",work=" + work + ",phone=" + phone
				+ ",workNO=" + workNO + ",custNO=" + custNO + ",custNewNO=" + custNewNO + ",age=" + age + ",fullName="
				+ fullName + ",actWork=" + actWork + ",tel=" + tel + "]";
	}
}