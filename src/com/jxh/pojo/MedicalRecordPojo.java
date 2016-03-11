package com.jxh.pojo;

import java.io.Serializable;

public class MedicalRecordPojo implements Serializable {
	private static final long serialVersionUID = 1L;
	private String recordID;
	private String custID;
	private String history;
	private String genetic;
	private String hobby;
	private String hobbyNote;
	private String medicineNote;
	private String foodNote;
	private String geneticOther;
	
	private String fullName;
	private String isMember;
	private String custNO;
	private String custNewNO;

	public MedicalRecordPojo(){
		super();
	}
	public MedicalRecordPojo(String recordID, String custID, String history, String genetic, String hobby, String hobbyNote, String medicineNote, String foodNote,
							String geneticOther,String fullName,String isMember,String custNO,String custNewNO){
		super();
		this.recordID=recordID;
		this.custID=custID;
		this.history=history;
		this.genetic=genetic;
		this.hobby=hobby;
		this.hobbyNote=hobbyNote;
		this.medicineNote=medicineNote;
		this.foodNote=foodNote;
		this.geneticOther=geneticOther;
		this.fullName=fullName;
		this.isMember=isMember;
		this.custNO=custNO;
		this.custNewNO=custNewNO;
	}
	public void setRecordID(String recordID){
		this.recordID=recordID;
	}
	public String getRecordID(){
		return recordID;
	}
	public void setCustID(String custID){
		this.custID=custID;
	}
	public String getCustID(){
		return custID;
	}
	public void setHistory(String history){
		this.history=history;
	}
	public String getHistory(){
		return history;
	}
	public void setGenetic(String genetic){
		this.genetic=genetic;
	}
	public String getGenetic(){
		return genetic;
	}
	public void setHobby(String hobby){
		this.hobby=hobby;
	}
	public String getHobby(){
		return hobby;
	}
	public void setHobbyNote(String hobbyNote){
		this.hobbyNote=hobbyNote;
	}
	public String getHobbyNote(){
		return hobbyNote;
	}
	public void setMedicineNote(String medicineNote){
		this.medicineNote=medicineNote;
	}
	public String getMedicineNote(){
		return medicineNote;
	}
	public void setFoodNote(String foodNote){
		this.foodNote=foodNote;
	}
	public String getFoodNote(){
		return foodNote;
	}
	public String getGeneticOther() {
		return geneticOther;
	}
	public void setGeneticOther(String geneticOther) {
		this.geneticOther = geneticOther;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getIsMember() {
		return isMember;
	}
	public void setIsMember(String isMember) {
		this.isMember = isMember;
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
	@Override
	public String toString(){
		return "MedicalRecord [recordID="+recordID+",custID="+custID+",history="+history+",genetic="+genetic+",hobby="+hobby+",hobbyNote="+hobbyNote+",medicineNote="+medicineNote+",foodNote="+foodNote+
							",geneticOther="+geneticOther+",fullName="+fullName+",isMember="+isMember+",custNO="+custNO+",custNewNO="+custNewNO+"]";
	}
}

