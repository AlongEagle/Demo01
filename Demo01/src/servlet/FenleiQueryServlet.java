package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.DBHelperMysql;

public class FenleiQueryServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public FenleiQueryServlet() {
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

		String random = request.getParameter("random");

		String ziduan = request.getParameter("ziduan");
		String keys = request.getParameter("keys");

		String page = request.getParameter("page");
		String rows = request.getParameter("rows");
		// String s_town = request.getParameter("s_town");
		// String s_idcardnum = request.getParameter("s_idcardnum");

		if (ziduan != null) {

			ziduan = new String(request.getParameter("ziduan").getBytes(
					"iso-8859-1"), "UTF-8");
		}
		//
		if (keys != null) {

			keys = new String(request.getParameter("keys").getBytes(
					"iso-8859-1"), "UTF-8");
		}
		
		
		
		
		//模糊查询
		
		if ("模糊查询".equals(ziduan)) {

			ziduan = "detail";
			keys = keys;

		}	
		
		
		
		//待遇类---------------------------------
		
		if ("待遇类".equals(ziduan)) {

			ziduan = "dangantype";
			keys = "DY";

		}

		if ("待遇核定类".equals(ziduan)) {

			ziduan = "dangantype";
			keys = "DY1";

		}
		if ("待遇支付类".equals(ziduan)) {
			
			ziduan = "dangantype";
			keys = "DY2";
			
		}
		if ("待遇领取资格认证类".equals(ziduan)) {
			
			ziduan = "dangantype";
			keys = "DY3";
			
		}
		if ("待遇停止支付类".equals(ziduan)) {
			
			ziduan = "dangantype";
			keys = "DY4";
			
		}
		if ("待遇恢复支付类".equals(ziduan)) {
			
			ziduan = "dangantype";
			keys = "DY5";
			
		}
		if ("待遇调整类".equals(ziduan)) {
			
			ziduan = "dangantype";
			keys = "DY6";
			
		}
		if ("关系终止类".equals(ziduan)) {
			
			ziduan = "dangantype";
			keys = "DY7";
			
		}
		if ("基金支出支付年度表类".equals(ziduan)) {
			
			ziduan = "dangantype";
			keys = "DY8";
			
		}
		
//		管理类-------------------------------------
		
		if ("管理类".equals(ziduan)) {

			ziduan = "dangantype";
			keys = "GL";

		}
		if ("参保登记类".equals(ziduan)) {

			ziduan = "dangantype";
			keys = "GL1";

		}
		if ("信息变更类".equals(ziduan)) {
			
			ziduan = "dangantype";
			keys = "GL2";
			
		}
		if ("关系转移接续类".equals(ziduan)) {
			
			ziduan = "dangantype";
			keys = "GL3";
			
		}
		if ("社会保险卡管理类".equals(ziduan)) {
			
			ziduan = "dangantype";
			keys = "GL4";
			
		}
		if ("服务协议管理类".equals(ziduan)) {
			
			ziduan = "dangantype";
			keys = "GL5";
			
		}
		if ("其他类".equals(ziduan)) {
			
			ziduan = "dangantype";
			keys = "GL6";
			
		}
		if ("关系终止类".equals(ziduan)) {

			ziduan = "dangantype";
			keys = "DY7";

		}
		

		System.out.println("-----------------查询条件为------------------------");
		System.out.println("ziduan=" + ziduan);
		System.out.println("random=" + random);
		System.out.println("ziduan=" + ziduan);
		System.out.println("keys=" + keys);

		DBHelperMysql dbh = new DBHelperMysql();
		
		dbh.choiceDanganType(rows, page, ziduan, keys, response, request, out);

		out.flush();
		out.close();
	}

	public void init() throws ServletException {
		// Put your code here
	}

}