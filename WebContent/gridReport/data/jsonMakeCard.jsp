﻿<%@page import="com.model.QxUsers"%>
<%@page import="org.apache.struts2.ServletActionContext"%>
<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file = "GenXmlData.jsp" %>
<%

String custIds = request.getParameter("custIds");


String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";


String QuerySQL = "select *,(case sex when 2 then '女' else '男' end) Sex,YEAR(isNull(StartDate,getDate())) CurrentYear,'"+basePath+"'+imgUrl as imgPath from bCustomer where CustID in ("+custIds+")";

System.out.print(QuerySQL);

XML_GenDetailData(response, QuerySQL);
%> 