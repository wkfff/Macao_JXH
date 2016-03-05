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
import com.jxh.biz.DormitoryRecordBiz;
import com.jxh.dao.CustomerDao;
import com.jxh.dao.DormitoryRecordDao;
import com.jxh.pojo.DormitoryRecordPojo;
import com.jxh.vo.BCustomer;
import com.jxh.vo.DormitoryRecord;
import com.jxh.vo.DormitoryTrainingADPlan;
import com.jxh.vo.DormitoryTrainingADPlanDetail;
import com.jxh.vo.DormitoryTrainingPlan;
import com.jxh.vo.DormitoryTrainingRecord;
import com.jxh.vo.DormitoryTrainingRecordDetail;
import com.jxh.vo.DormitoryTrainingReview;
import com.jxh.vo.DormitoryTrainingReviewDetail;
import com.jxh.vo.DormitoryTrainingReviewFinance;
import com.jxh.vo.DormitoryTrainingReviewSettle;
import com.jxh.vo.DormitoryTrainingReviewTarget;

import net.sf.json.JSONArray;

/**
 * Servlet implementation class TreatmentSerlvet
 */
@WebServlet("/Dormitory/*")
public class DormitorySerlvet extends FGServlet {
	private static final long serialVersionUID = 1L;
    private DormitoryRecordDao dormitoryRecordDao = new DormitoryRecordDao();
    private CustomerDao customerDao = new CustomerDao();
    private DormitoryRecordBiz dormitoryRecordBiz = new DormitoryRecordBiz();
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DormitorySerlvet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(request, response);
	}
	
	private void list(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException{
		PageUtils<DormitoryRecordPojo> page = this.getPage(request);
		dormitoryRecordDao.getDormitoryRecordPojo(page,null);
		LigerUITools.writeGridJson(page, response);
	}
	
	private void add(HttpServletRequest request, HttpServletResponse response) {
		try {

			DormitoryRecord dormitoryRecord = new DormitoryRecord();

			request.setAttribute("dormitoryRecord", dormitoryRecord);
			forwardDispatcher("../jsp/manage/dormitory_edit.jsp", request, response);

		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}
	
	private void edit(HttpServletRequest request, HttpServletResponse response) {
		String treatmentType=request.getParameter("treatmentType");
		try {
			BCustomer customer = customerDao.getCustomerByCondition(" and custID = ? ",
					this.getParameterByName(request, "custID"));
			request.setAttribute("customer", customer);
			forwardDispatcher("../jsp/manage/dormitory_edit.jsp",request,response);

		} catch (IOException | SQLException | ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private void submit(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<DormitoryTrainingADPlanDetail>  dormitoryTrainingADPlanDetailAdds = getGridListByParamerName(DormitoryTrainingADPlanDetail.class, request, "dormitoryTrainingADPlanDetailAdds");
		List<DormitoryTrainingADPlanDetail>  dormitoryTrainingADPlanDetailUpdates = getGridListByParamerName(DormitoryTrainingADPlanDetail.class, request, "dormitoryTrainingADPlanDetailUpdates");
		List<DormitoryTrainingADPlanDetail>  dormitoryTrainingADPlanDetailDeletes = getGridListByParamerName(DormitoryTrainingADPlanDetail.class, request, "dormitoryTrainingADPlanDetailDeletes");
		
		List<DormitoryTrainingRecordDetail>  dormitoryTrainingRecordDetailAdds = getGridListByParamerName(DormitoryTrainingRecordDetail.class, request, "dormitoryTrainingRecordDetailAdds");
		List<DormitoryTrainingRecordDetail>  dormitoryTrainingRecordDetailUpdates = getGridListByParamerName(DormitoryTrainingRecordDetail.class, request, "dormitoryTrainingRecordDetailUpdates");
		List<DormitoryTrainingRecordDetail>  dormitoryTrainingRecordDetailDeletes = getGridListByParamerName(DormitoryTrainingRecordDetail.class, request, "dormitoryTrainingRecordDetailDeletes");

		List<DormitoryTrainingReviewTarget>  dormitoryTrainingReviewTargetAdds = getGridListByParamerName(DormitoryTrainingReviewTarget.class, request, "dormitoryTrainingReviewTargetAdds");
		List<DormitoryTrainingReviewTarget>  dormitoryTrainingReviewTargetUpdates = getGridListByParamerName(DormitoryTrainingReviewTarget.class, request, "dormitoryTrainingReviewTargetUpdates");
		List<DormitoryTrainingReviewTarget>  dormitoryTrainingReviewTargetDeletes = getGridListByParamerName(DormitoryTrainingReviewTarget.class, request, "dormitoryTrainingReviewTargetDeletes");
		
		List<DormitoryTrainingReviewFinance>  dormitoryTrainingReviewFinanceAdds = getGridListByParamerName(DormitoryTrainingReviewFinance.class, request, "dormitoryTrainingReviewFinanceAdds");
		List<DormitoryTrainingReviewFinance>  dormitoryTrainingReviewFinanceUpdates = getGridListByParamerName(DormitoryTrainingReviewFinance.class, request, "dormitoryTrainingReviewFinanceUpdates");
		List<DormitoryTrainingReviewFinance>  dormitoryTrainingReviewFinanceDeletes = getGridListByParamerName(DormitoryTrainingReviewFinance.class, request, "dormitoryTrainingReviewFinanceDeletes");
		
		List<DormitoryTrainingReviewSettle>  dormitoryTrainingReviewSettleAdds = getGridListByParamerName(DormitoryTrainingReviewSettle.class, request, "dormitoryTrainingReviewSettleAdds");
		List<DormitoryTrainingReviewSettle>  dormitoryTrainingReviewSettleUpdates = getGridListByParamerName(DormitoryTrainingReviewSettle.class, request, "dormitoryTrainingReviewSettleUpdates");
		List<DormitoryTrainingReviewSettle>  dormitoryTrainingReviewSettleDeletes = getGridListByParamerName(DormitoryTrainingReviewSettle.class, request, "dormitoryTrainingReviewSettleDeletes");
		
		
		//院舍記錄
		DormitoryRecord dormitoryRecord = this.getObjectByParameter(request, DormitoryRecord.class);
		//個別訓練策劃
		DormitoryTrainingPlan dormitoryTrainingPlan = this.getObjectByParameter(request, DormitoryTrainingPlan.class);
		//個別住客整日訓練流程
		DormitoryTrainingADPlan dormitoryTrainingADPlan = this.getObjectByParameter(request, DormitoryTrainingADPlan.class);
		//個別訓練記錄
		DormitoryTrainingRecord dormitoryTrainingRecord = this.getObjectByParameter(request, DormitoryTrainingRecord.class);
		//小組話個別訓練策劃及檢討
		DormitoryTrainingReview dormitoryTrainingReview = this.getObjectByParameter(request, DormitoryTrainingReview.class);
		

		String message = "";
		if (dormitoryRecord.getRecordID() != null && !"".equals(dormitoryRecord.getRecordID())) {
			message = dormitoryRecordBiz.updateDormitoryRecord(dormitoryRecord,dormitoryTrainingPlan,dormitoryTrainingADPlan,dormitoryTrainingRecord,dormitoryTrainingReview,dormitoryTrainingADPlanDetailAdds,dormitoryTrainingADPlanDetailUpdates,dormitoryTrainingADPlanDetailDeletes,dormitoryTrainingRecordDetailAdds,dormitoryTrainingRecordDetailUpdates,dormitoryTrainingRecordDetailDeletes,dormitoryTrainingReviewTargetAdds,dormitoryTrainingReviewTargetUpdates,dormitoryTrainingReviewTargetDeletes,dormitoryTrainingReviewFinanceAdds,dormitoryTrainingReviewFinanceUpdates,dormitoryTrainingReviewFinanceDeletes,dormitoryTrainingReviewSettleAdds,dormitoryTrainingReviewSettleUpdates,dormitoryTrainingReviewSettleDeletes);
		} else {
			message = dormitoryRecordBiz.insertDormitoryRecord(dormitoryRecord,dormitoryTrainingPlan,dormitoryTrainingADPlan,dormitoryTrainingRecord,dormitoryTrainingReview,dormitoryTrainingADPlanDetailAdds,dormitoryTrainingRecordDetailAdds,dormitoryTrainingReviewTargetAdds,dormitoryTrainingReviewFinanceAdds,dormitoryTrainingReviewSettleAdds);
		}

		// 设置为表单jsp
		request.setAttribute(JSPTYPE, ConstantUtils.FORMJSP);
		request.setAttribute("msg", message);

		if (message.indexOf("成功") > 0) {
			sendRedirect("../jsp/custCase/list.jsp", response);
		} else {
			request.setAttribute("bCustCase", bCustCase);
			forwardDispatcher("../jsp/custCase/edit.jsp", request, response);
		}

	}
	

}