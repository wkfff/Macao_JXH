package com.jxh.vo;


import java.io.Serializable;
import java.util.Date;

import com.fg.utils.ToolsUtils;

import java.math.*;
import java.text.ParseException;


/** SmsSendDetail
	BILLDETAILID	VARCHAR(20)
	BILLMASTERID	VARCHAR(20)
	TELNO	VARCHAR(16)
	TELNAME	VARCHAR(32)
	FETIONNO	VARCHAR(16)
	STATE	INT(10)
	SENDDATETIME	DATETIME(23,3)
	RECMANID	VARCHAR(16)
	RECMANTYPE	VARCHAR(16)
	TRYTIMES	INT(10)
	SMSCENTERSN	VARCHAR(128)

billDetailID,billMasterID,telNO,telName,fetionNO,state,sendDateTime,recManID,recManType,tryTimes,sMSCenterSN
?,?,?,?,?,?,?,?,?,?,?

smsSendDetail.billDetailID,smsSendDetail.billMasterID,smsSendDetail.telNO,smsSendDetail.telName,smsSendDetail.fetionNO,smsSendDetail.state,smsSendDetail.sendDateTime,smsSendDetail.recManID,smsSendDetail.recManType,smsSendDetail.tryTimes,smsSendDetail.sMSCenterSN

billDetailID=?,billMasterID=?,telNO=?,telName=?,fetionNO=?,state=?,sendDateTime=?,recManID=?,recManType=?,tryTimes=?,sMSCenterSN=?
*/
public class SmsSendDetail implements Serializable {
	private static final long serialVersionUID = 1L;
	private String billDetailID;
	private String billMasterID;
	private String telNO;
	private String telName;
	private String fetionNO;
	private int state;
	private Date sendDateTime;
	private String recManID;
	private String recManType;
	private Integer tryTimes;
	private String sMSCenterSN;
	
	private String sendDateTime_str;

	public SmsSendDetail(){
		super();
	}
	public SmsSendDetail(String billDetailID, String billMasterID, String telNO, String telName, String fetionNO, int state, Date sendDateTime, String recManID, String recManType, Integer tryTimes, String sMSCenterSN,String sendDateTime_str ){
		super();
		this.billDetailID=billDetailID;
		this.billMasterID=billMasterID;
		this.telNO=telNO;
		this.telName=telName;
		this.fetionNO=fetionNO;
		this.state=state;
		this.sendDateTime=sendDateTime;
		this.recManID=recManID;
		this.recManType=recManType;
		this.tryTimes=tryTimes;
		this.sMSCenterSN=sMSCenterSN;
		this.sendDateTime_str=sendDateTime_str;
	}
	public void setBillDetailID(String billDetailID){
		this.billDetailID=billDetailID;
	}
	public String getBillDetailID(){
		return billDetailID;
	}
	public void setBillMasterID(String billMasterID){
		this.billMasterID=billMasterID;
	}
	public String getBillMasterID(){
		return billMasterID;
	}
	public void setTelNO(String telNO){
		this.telNO=telNO;
	}
	public String getTelNO(){
		return telNO;
	}
	public void setTelName(String telName){
		this.telName=telName;
	}
	public String getTelName(){
		return telName;
	}
	public void setFetionNO(String fetionNO){
		this.fetionNO=fetionNO;
	}
	public String getFetionNO(){
		return fetionNO;
	}
	public void setState(int state){
		this.state=state;
	}
	public int getState(){
		return state;
	}
	public void setSendDateTime(Date sendDateTime){
		this.sendDateTime=sendDateTime;
	}
	public Date getSendDateTime(){
		return sendDateTime;
	}
	public void setRecManID(String recManID){
		this.recManID=recManID;
	}
	public String getRecManID(){
		return recManID;
	}
	public void setRecManType(String recManType){
		this.recManType=recManType;
	}
	public String getRecManType(){
		return recManType;
	}
	public void setTryTimes(Integer tryTimes){
		this.tryTimes=tryTimes;
	}
	public Integer getTryTimes(){
		return tryTimes;
	}
	public void setSMSCenterSN(String sMSCenterSN){
		this.sMSCenterSN=sMSCenterSN;
	}
	public String getSMSCenterSN(){
		return sMSCenterSN;
	}
	
	public String getsMSCenterSN() {
		return sMSCenterSN;
	}
	public void setsMSCenterSN(String sMSCenterSN) {
		this.sMSCenterSN = sMSCenterSN;
	}
	public String getSendDateTime_str() {
		try {
			return sendDateTime == null || "".equals(sendDateTime) ? ""
					: ToolsUtils.getDateStringByFormat(sendDateTime, null, "yyyy-MM-dd");
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	public void setSendDateTime_str(String sendDateTime_str) {
		this.sendDateTime_str = sendDateTime_str;
	}
	@Override
	public String toString(){
		return "SmsSendDetail [billDetailID="+billDetailID+",billMasterID="+billMasterID+",telNO="+telNO+",telName="+telName+",fetionNO="+fetionNO+",state="+state+",sendDateTime="+sendDateTime+",recManID="+recManID+",recManType="+recManType+",tryTimes="+tryTimes+",sMSCenterSN="+sMSCenterSN+",sendDateTime_str="+sendDateTime_str+"]";
	}
}

