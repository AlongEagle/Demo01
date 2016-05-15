package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.DBHelperMysql;

public class SearchInfo extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public SearchInfo() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
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
		PrintWriter out = response.getWriter();
		response.setCharacterEncoding("utf-8");

		String s_name = request.getParameter("s_name");
//		String s_town = request.getParameter("s_town");
//		String s_idcardnum = request.getParameter("s_idcardnum");

		if (s_name != null) {

			s_name = new String(request.getParameter("s_name").getBytes(
					"iso-8859-1"), "UTF-8");
		}

//		if (s_town != null) {
//
//			s_town = new String(request.getParameter("s_town").getBytes(
//					"iso-8859-1"), "UTF-8");
//		}
//
//		if (s_idcardnum != null) {
//
//			s_idcardnum = new String(request.getParameter("s_idcardnum").getBytes(
//					"iso-8859-1"), "UTF-8");
//		}
//		
		
		
		System.out.println("-----------------查询条件为------------------------");
		System.out.println("s_name="+s_name);

		DBHelperMysql dbh=new DBHelperMysql();
		dbh.queryInfo(s_name);
		out.flush();
		out.close();
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
