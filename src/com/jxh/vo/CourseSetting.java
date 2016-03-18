package com.jxh.vo;


import java.io.Serializable;
import java.util.Date;

import com.fg.utils.ToolsUtils;

import java.math.*;
import java.text.ParseException;


/** CourseSetting

courseID,courseNO,courseName,beginDate,endDate,courseDate,place,leader,assistant,pay,qty,note,classHour,classNote
?,?,?,?,?,?,?,?,?,?,?,?,?,?

courseSetting.courseID,courseSetting.courseNO,courseSetting.courseName,courseSetting.beginDate,courseSetting.endDate,courseSetting.courseDate,courseSetting.place,courseSetting.leader,courseSetting.assistant,courseSetting.pay,courseSetting.qty,courseSetting.note,courseSetting.classHour,courseSetting.classNote

courseID=?,courseNO=?,courseName=?,beginDate=?,endDate=?,courseDate=?,place=?,leader=?,assistant=?,pay=?,qty=?,note=?,classHour=?,classNote=?
*/
public class CourseSetting implements Serializable {
	private static final long serialVersionUID = 1L;
	private String courseID;
	private String courseNO;
	private String courseName;
	private Date beginDate;
	private Date endDate;
	private Date courseDate;
	private String place;
	private String leader;
	private String assistant;
	private BigDecimal pay;
	private int qty;
	private String note;
	private String classHour;
	private String classNote;
	
	private String beginDate_str;
	private String endDate_str;
	private String courseDate_str;

	public CourseSetting(){
		super();
	}
	public CourseSetting(String courseID, String courseNO, String courseName, Date beginDate, Date endDate, Date courseDate, String place, String leader, String assistant, BigDecimal pay, int qty, String note, String classHour, String classNote,
						String beginDate_str,String endDate_str,String courseDate_str){
		super();
		this.courseID=courseID;
		this.courseNO=courseNO;
		this.courseName=courseName;
		this.beginDate=beginDate;
		this.endDate=endDate;
		this.courseDate=courseDate;
		this.place=place;
		this.leader=leader;
		this.assistant=assistant;
		this.pay=pay;
		this.qty=qty;
		this.note=note;
		this.classHour=classHour;
		this.classNote=classNote;
		this.beginDate_str=beginDate_str;
		this.endDate_str=endDate_str;
		this.courseDate_str=courseDate_str;
	}
	public void setCourseID(String courseID){
		this.courseID=courseID;
	}
	public String getCourseID(){
		return courseID;
	}
	public void setCourseNO(String courseNO){
		this.courseNO=courseNO;
	}
	public String getCourseNO(){
		return courseNO;
	}
	public void setCourseName(String courseName){
		this.courseName=courseName;
	}
	public String getCourseName(){
		return courseName;
	}
	public void setBeginDate(Date beginDate){
		this.beginDate=beginDate;
	}
	public Date getBeginDate(){
		return beginDate;
	}
	public void setEndDate(Date endDate){
		this.endDate=endDate;
	}
	public Date getEndDate(){
		return endDate;
	}
	public void setCourseDate(Date courseDate){
		this.courseDate=courseDate;
	}
	public Date getCourseDate(){
		return courseDate;
	}
	public void setPlace(String place){
		this.place=place;
	}
	public String getPlace(){
		return place;
	}
	public void setLeader(String leader){
		this.leader=leader;
	}
	public String getLeader(){
		return leader;
	}
	public void setAssistant(String assistant){
		this.assistant=assistant;
	}
	public String getAssistant(){
		return assistant;
	}
	public void setPay(BigDecimal pay){
		this.pay=pay;
	}
	public BigDecimal getPay(){
		return pay;
	}
	public void setQty(int qty){
		this.qty=qty;
	}
	public int getQty(){
		return qty;
	}
	public void setNote(String note){
		this.note=note;
	}
	public String getNote(){
		return note;
	}
	public void setClassHour(String classHour){
		this.classHour=classHour;
	}
	public String getClassHour(){
		return classHour;
	}
	public void setClassNote(String classNote){
		this.classNote=classNote;
	}
	public String getClassNote(){
		return classNote;
	}
	public String getBeginDate_str() {
		try {
			return beginDate == null || "".equals(beginDate) ? ""
					: ToolsUtils.getDateStringByFormat(beginDate, null, "yyyy-MM-dd");
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	public void setBeginDate_str(String beginDate_str) {
		this.beginDate_str = beginDate_str;
	}
	public String getEndDate_str() {
		try {
			return endDate == null || "".equals(endDate) ? ""
					: ToolsUtils.getDateStringByFormat(endDate, null, "yyyy-MM-dd");
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	public void setEndDate_str(String endDate_str) {
		this.endDate_str = endDate_str;
	}
	public String getCourseDate_str() {
		try {
			return courseDate == null || "".equals(courseDate) ? ""
					: ToolsUtils.getDateStringByFormat(courseDate, null, "yyyy-MM-dd");
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	public void setCourseDate_str(String courseDate_str) {
		this.courseDate_str = courseDate_str;
	}
	@Override
	public String toString(){
		return "CourseSetting [courseID="+courseID+",courseNO="+courseNO+",courseName="+courseName+",beginDate="+beginDate+",endDate="+endDate+",courseDate="+courseDate+",place="+place+",leader="+leader+",assistant="+assistant+",pay="+pay+",qty="+qty+",note="+note+",classHour="+classHour+",classNote="+classNote+
							",beginDate_str="+beginDate_str+",endDate_str="+endDate_str+",courseDate_str="+courseDate_str+"]";
	}
}
