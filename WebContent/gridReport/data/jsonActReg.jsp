﻿<%@page import="com.model.QxUsers"%>
<%@page import="org.apache.struts2.ServletActionContext"%>
<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file = "GenXmlData.jsp" %>
<%

String regBillNo = request.getParameter("regBillNo");

 
String QuerySQL = "select a.*, u.UserName from ActReg as a left outer join qx_Users as u on u.UserID = a.UserID where a.RegBillNO = '"+regBillNo+"' and isGetMoney = 1";


XML_GenDetailData(response, QuerySQL);
%> 