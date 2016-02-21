package com.jxh.vo;


import java.io.Serializable;
import java.util.Date;
import java.math.*;


/** TreatmentTrainingPlanRecord
	RECORDID	INT(10)
	WORKID	VARCHAR(20)
	BILLDATE	DATETIME(23,3)
	CONTENT	VARCHAR(128)
	PERFORMANCE	VARCHAR(128)
	NOTE	VARCHAR(128)

recordID,workID,billDate,content,performance,note
?,?,?,?,?,?

treatmentTrainingPlanRecord.recordID,treatmentTrainingPlanRecord.workID,treatmentTrainingPlanRecord.billDate,treatmentTrainingPlanRecord.content,treatmentTrainingPlanRecord.performance,treatmentTrainingPlanRecord.note

recordID=?,workID=?,billDate=?,content=?,performance=?,note=?
*/
public class TreatmentTrainingPlanRecord implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordID;
	private String workID;
	private Date billDate;
	private String content;
	private String performance;
	private String note;

	public TreatmentTrainingPlanRecord(){
		super();
	}
	public TreatmentTrainingPlanRecord(int recordID, String workID, Date billDate, String content, String performance, String note ){
		super();
		this.recordID=recordID;
		this.workID=workID;
		this.billDate=billDate;
		this.content=content;
		this.performance=performance;
		this.note=note;
	}
	public void setRecordID(int recordID){
		this.recordID=recordID;
	}
	public int getRecordID(){
		return recordID;
	}
	public void setWorkID(String workID){
		this.workID=workID;
	}
	public String getWorkID(){
		return workID;
	}
	public void setBillDate(Date billDate){
		this.billDate=billDate;
	}
	public Date getBillDate(){
		return billDate;
	}
	public void setContent(String content){
		this.content=content;
	}
	public String getContent(){
		return content;
	}
	public void setPerformance(String performance){
		this.performance=performance;
	}
	public String getPerformance(){
		return performance;
	}
	public void setNote(String note){
		this.note=note;
	}
	public String getNote(){
		return note;
	}
	@Override
	public String toString(){
		return "TreatmentTrainingPlanRecord [recordID="+recordID+",workID="+workID+",billDate="+billDate+",content="+content+",performance="+performance+",note="+note+"]";
	}
}
