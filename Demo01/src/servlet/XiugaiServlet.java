package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.DBHelperMysql;

public class XiugaiServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public XiugaiServlet() {
		super();
	}

	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();


		String onlyid = request.getParameter("onlyid");

		String page = request.getParameter("page");
		String rows = request.getParameter("rows");
		String detail = request.getParameter("detail1");
		String danghao = request.getParameter("danghao1");
		String code = request.getParameter("code1");
		String onlyid1 = request.getParameter("onlyid1");
		String isDelete = request.getParameter("isDelete");
		
		String data=request.getParameter("data");
		System.out.println("data----------"+data);
		
		
		// String s_town = request.getParameter("s_town");
		// String s_idcardnum = request.getParameter("s_idcardnum");
		
		System.out.println("xiugaishuju----------------------------->jinlaile");

		if (onlyid != null) {

			onlyid = new String(request.getParameter("onlyid").getBytes(
					"iso-8859-1"), "UTF-8");
		}
		//
		if (detail != null) {

			detail = new String(request.getParameter("detail1").getBytes(
					"iso-8859-1"), "UTF-8");
		}
		
		if (danghao != null) {

			danghao = new String(request.getParameter("danghao1").getBytes(
					"iso-8859-1"), "UTF-8");
		}
		
		if (code != null) {

			code = new String(request.getParameter("code1").getBytes(
					"iso-8859-1"), "UTF-8");
		}
		
		if (onlyid1 != null) {
			
			onlyid1 = new String(request.getParameter("onlyid1").getBytes(
					"iso-8859-1"), "UTF-8");
		}
		if (isDelete != null) {
			
			isDelete = new String(request.getParameter("isDelete").getBytes(
					"iso-8859-1"), "UTF-8");
		}
		System.out.println("detail:"+detail+"|danghao"+danghao+"|code:"+code+"|onlyid1:"+onlyid1);
	/*	
		if (danganbianhao != null) {

			danganbianhao = new String(request.getParameter("danganbianhao").getBytes(
					"iso-8859-1"), "UTF-8");
		}*/
		
		
		System.out.println("onlyid------------>:"+onlyid);
		
		
		DBHelperMysql dbh = new DBHelperMysql();
		
		if("isDelete".equals(isDelete)){
			
			dbh.deleteInfo(onlyid1,out);
		}else{
			dbh.update(detail, code, danghao, onlyid1, response, request, out);
		}
		
		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
