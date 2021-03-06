package com.jxh.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fg.ligerui.ConstantUtils;
import com.fg.ligerui.LigerUITools;
import com.fg.servlet.FGServlet;
import com.fg.utils.PageUtils;
import com.fg.utils.ToolsUtils;
import com.jxh.biz.CustomerBiz;
import com.jxh.dao.ActivityRecordDao;
import com.jxh.dao.ActivityRecordNewDao;
import com.jxh.dao.CSSADao;
import com.jxh.dao.CustomerDao;
import com.jxh.dao.RetardedDao;
import com.jxh.dao.SocialWorkDao;
import com.jxh.dao.SpecialAllowanceDao;
import com.jxh.pojo.ActivityRecordNewPojo;
import com.jxh.pojo.CustCasePojo;
import com.jxh.pojo.Customer;
import com.jxh.pojo.VoluntaryPojo;
import com.jxh.utils.Constants;
import com.jxh.vo.ActivityRecord;
import com.jxh.vo.ActivityRecordNew;
import com.jxh.vo.BCustomer;
import com.jxh.vo.CSSA;
import com.jxh.vo.Retarded;
import com.jxh.vo.SocialWork;
import com.jxh.vo.SpecialAllowance;

import net.sf.json.JSONArray;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/Customer/*")
public class CustomerServlet extends FGServlet {
	private static final long serialVersionUID = 1L;

	private CustomerBiz customerBiz = new CustomerBiz();
	private CustomerDao customerDao = new CustomerDao();
	private RetardedDao retardedDao = new RetardedDao();
	private CSSADao cssaDao = new CSSADao();
	private SpecialAllowanceDao specialAllowanceDao = new SpecialAllowanceDao();
	private ActivityRecordNewDao activityRecordNewDao = new ActivityRecordNewDao();
	private SocialWorkDao socialWorkDao = new SocialWorkDao();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CustomerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(request, response);
		
	}

	
	/**
	 * 特津記錄
	 * @param request
	 * @param response
	 * @throws SQLException
	 * @throws IOException
	 */
	private void getSpecialAllowance(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		// TODO Auto-generated method stub
		String custId = this.getParameterByName(request, "CUSTID");
		PageUtils<SpecialAllowance> page = this.getPage(request);
		String condition = " and SpecialAllowanceCustID = ? ";
		specialAllowanceDao.getSpecialAllowanceByCondition(page, condition, custId);
		LigerUITools.writeGridJson(page, response);
	}
	
	
	/**
	 * 参加活动记录
	 * @param request
	 * @param response
	 * @throws SQLException
	 * @throws IOException
	 */
	private void getActivityRecordPojo(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		// TODO Auto-generated method stub
		String custId = this.getParameterByName(request, "CUSTID");
		PageUtils<ActivityRecordNewPojo> page = this.getPage(request);
		String condition = " and ActivityRecordNew.CustID = ? ";
		activityRecordNewDao.getActivityRecordNewPojoByCondition(page, condition, custId);
		LigerUITools.writeGridJson(page, response);
	}

	/**
	 * 获取CSSA
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws SQLException 
	 */
	private void getCSSA(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		// TODO Auto-generated method stub
		String custId = this.getParameterByName(request, "CUSTID");
		PageUtils<CSSA> page = this.getPage(request);
		String condition = " and CSSACustID = ? ";
		cssaDao.getCSSAByCondition(page, condition, custId);
		
		LigerUITools.writeGridJson(page, response);
	}

	/**
	 * 新增家庭成员
	 * @param request
	 * @param response
	 * @throws ParseException 
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void addFamily(HttpServletRequest request, HttpServletResponse response) throws ParseException, ServletException, IOException {
		// TODO Auto-generated method stub
		BCustomer cust = new BCustomer();
		Date now = new Date();
		cust.setRegDate(now);
		cust.setValidDate(now);
		cust.setCustType2("2");


		request.setAttribute("cust", cust);

		forwardDispatcher("../jsp/customer/edit_family.jsp", request, response);
	}

	/**
	 * 修改家庭成员
	 * @param request
	 * @param response
	 */
	private void editFamily(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		try {
			BCustomer cust = customerDao.getCustomerByCondition(" and custId = ? ",
					this.getParameterByName(request, "CUSTID"));
			
			
			request.setAttribute("cust", cust);

			forwardDispatcher("../jsp/customer/edit_family.jsp", request, response);

		} catch (IOException | SQLException | ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 获取家庭人员信息
	 * @param request
	 * @param response
	 * @throws SQLException 
	 * @throws IOException 
	 */
	private void getFamily(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
		// TODO Auto-generated method stub
		String custId = request.getParameter("CUSTID");
		
		PageUtils<Customer> page = getPage(request);
		
		String condition = " and custType2 = 2 and guardianCustID = ?";
		page = customerDao.getCustomerList(page, condition, custId);
		
		LigerUITools.writeGridJson(page, response);
		
	}

	/**
	 * 获取智障登記信息
	 * 
	 * @param request
	 * @param response
	 */
	private void getRetarded(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String custId = request.getParameter("CUSTID");
		try {

			PageUtils<Retarded> page = getPage(request);

			PageUtils<Retarded> retardeds = retardedDao.getRetardedByCondition(page, " and CustId = ? ", custId);

			LigerUITools.writeGridJson(retardeds, response);

		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				LigerUITools.writeGridJson(null, response);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	/**
	 * 进入修改页面
	 * 
	 * @param request
	 * @param response
	 */
	private void edit(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		try {
			BCustomer cust = customerDao.getCustomerByCondition(" and custID = ? ",
					this.getParameterByName(request, "CUSTID"));
			request.setAttribute("cust", cust);

			forwardDispatcher("../jsp/customer/edit.jsp", request, response);

		} catch (IOException | SQLException | ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

	/**
	 * 进入新增页面
	 * 
	 * @param request
	 * @param response
	 * @throws SQLException 
	 */
	private void add(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		// TODO Auto-generated method stub

		try {

			BCustomer cust = new BCustomer();
			Date now = new Date();
			Timestamp time = Timestamp.valueOf(ToolsUtils.getDateStringByFormat(now, null, null));
			String ts= (time+"").replace("-", "");
			String custCode = "P"+ts.substring(0,8)+customerDao.getCUSTCODE(Constants.NO);
			cust.setRegDate(time);
			cust.setValidDate(time);
			cust.setCustType2("1");
			cust.setCustType("1");
			cust.setCustCode(custCode);

			request.setAttribute("cust", cust);
			request.setAttribute(JSPTYPE, ConstantUtils.FORMJSP);

			forwardDispatcher("../jsp/customer/edit.jsp", request, response);

		} catch (ServletException | IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 提交会员资料信息
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	private void submit(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

		List<Retarded> retardedAdds = getGridListByParamerName(Retarded.class, request, "retardedAdds");
		List<Retarded> retardedUpdates = getGridListByParamerName(Retarded.class, request, "retardedUpdates");
		List<Retarded> retardedDeletes = getGridListByParamerName(Retarded.class, request, "retardedDeletes");
		
		
		List<BCustomer>  familyAdds = getGridListByParamerName(BCustomer.class, request, "familyAdds");
		List<BCustomer>  familyUpdates = getGridListByParamerName(BCustomer.class, request, "familyUpdates");
		List<BCustomer>  familyDeletes = getGridListByParamerName(BCustomer.class, request, "familyDeletes");
		
		
		List<CSSA>  CSSAAdds = getGridListByParamerName(CSSA.class, request, "CSSAAdds");
		List<CSSA>  CSSAUpdates = getGridListByParamerName(CSSA.class, request, "CSSAUpdates");
		List<CSSA>  CSSADeletes = getGridListByParamerName(CSSA.class, request, "CSSADeletes");
		
		
		List<SpecialAllowance>  SpecialAllowanceAdds = getGridListByParamerName(SpecialAllowance.class, request, "SpecialAllowanceAdds");
		List<SpecialAllowance>  SpecialAllowanceUpdates = getGridListByParamerName(SpecialAllowance.class, request, "SpecialAllowanceUpdates");
		List<SpecialAllowance>  SpecialAllowanceDeletes = getGridListByParamerName(SpecialAllowance.class, request, "SpecialAllowanceDeletes");
		List<SocialWork>  SocialWorkAdds = getGridListByParamerName(SocialWork.class, request, "SocialWorkAdds");
		List<SocialWork>  SocialWorkUpdates = getGridListByParamerName(SocialWork.class, request, "SocialWorkUpdates");
		List<SocialWork>  SocialWorkDeletes = getGridListByParamerName(SocialWork.class, request, "SocialWorkDeletes");
		
		List<ActivityRecordNew>  ActivityRecordNewAdds = getGridListByParamerName(ActivityRecordNew.class, request, "ActivityRecordNewAdds");
		List<ActivityRecordNew>  ActivityRecordNewUpdates = getGridListByParamerName(ActivityRecordNew.class, request, "ActivityRecordNewUpdates");
		List<ActivityRecordNew>  ActivityRecordNewDeletes = getGridListByParamerName(ActivityRecordNew.class, request, "ActivityRecordNewDeletes");
		
		
		BCustomer cust = this.getObjectByParameter(request, BCustomer.class);

		String message = "";
		if (cust.getCustID() != null && !"".equals(cust.getCustID())) {
			message = customerBiz.updateCustomer(cust, retardedAdds,retardedUpdates,retardedDeletes,familyAdds,familyUpdates,familyDeletes,CSSAAdds,CSSAUpdates,CSSADeletes,SpecialAllowanceAdds,SpecialAllowanceUpdates,SpecialAllowanceDeletes,SocialWorkAdds,SocialWorkUpdates,SocialWorkDeletes,ActivityRecordNewAdds,ActivityRecordNewUpdates,ActivityRecordNewDeletes);
		} else {
			message = customerBiz.insertCustomer(cust, retardedAdds,familyAdds,CSSAAdds,SpecialAllowanceAdds,SocialWorkAdds,ActivityRecordNewAdds);
		}

		// 设置为表单jsp
		request.setAttribute(JSPTYPE, ConstantUtils.FORMJSP);
		request.setAttribute("msg", message);

		if (message.indexOf("成功") > 0) {
			sendRedirect("../jsp/customer/list.jsp", response);
		} else {
			request.setAttribute("cust", cust);
			forwardDispatcher("../jsp/customer/edit.jsp", request, response);
		}

	}

	/**
	 * 获取所有会员
	 * 
	 * @param request
	 * @param response
	 */
	private void list(HttpServletRequest request, HttpServletResponse response) {
		String type = request.getParameter("type");
		try {
			PageUtils<Customer> page = getPage(request);
			String condition = " and CustType2 != 2 and CustType2 != 3 ";//and custid = ?
			if("1".equals(type)){
				condition = " and CustType2 != 2 and CustType2 != 3 and custType != 0 ";
			}else if("0".equals(type)){
				condition = " and CustType2 != 2 and CustType2 != 3 and custType = 0 ";
			}
			customerDao.getCustomerList(page, condition);
			LigerUITools.writeGridJson(page, response);
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	private void getCustomerByCondition(HttpServletRequest request, HttpServletResponse response) {
		String guardianCustID = request.getParameter("guardianCustID");
		try {
			PageUtils<Customer> page = getPage(request);
			String condition = " and guardianCustID='"+guardianCustID +"' ";
			System.out.println(condition);
			customerDao.getCustomerList(page, condition);
			LigerUITools.writeGridJson(page, response);
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * 根据条件获取会员资料
	 * @param request
	 * @param response
	 */
	private void custDataList(HttpServletRequest request, HttpServletResponse response) {
		String custType = request.getParameter("custType");
		System.out.println("cus="+custType);
		try {
			PageUtils<Customer> page = getPage(request);
			String condition = null;
			if("0".equals(custType)){
				condition = " and custType = '0' ";
				System.out.println("if"+custType);
			}else if("1".equals(custType) || "2".equals(custType)){
				System.out.println("else"+custType);
				condition = " and custType != '0' ";
			}
			customerDao.getCustomerList(page, condition);
			LigerUITools.writeGridJson(page, response);
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * 獲取會員信息
	 * @param request
	 * @param response
	 */
	private void custData(HttpServletRequest request, HttpServletResponse response) {
		String custID = request.getParameter("custID");
		try {
			//PageUtils<Customer> page = getPage(request);
			String condition = " and bCustomer.custID ='"+custID+"'";//and custID = ?
			BCustomer customer = customerDao.getCustomerByCondition(condition);
			 PrintWriter out = response.getWriter();  
		     out.write(JSONArray.fromObject(customer).toString());  
			//LigerUITools.writeGridJson(page, response);
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private void getVoluntary(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException{
		String custID = this.getParameterByName(request, "custID");
		System.out.println("custID="+custID);
		PageUtils<VoluntaryPojo> page = this.getPage(request);
		String condition = " and SocialWork.custID = ? ";
		socialWorkDao.getVoluntaryPojo(page, condition, custID);
		LigerUITools.writeGridJson(page, response);
	}
	
	private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException{
		boolean flag=false;
		String custID = request.getParameter("custID");
		if (custID != null && !"".equals(custID)) {
			try {
				flag = customerBiz.deleteCustomer(custID);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} 
		response.getWriter().print(flag);
	}

}
