package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.DBHelperMysql;

public class CharuChayueServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public CharuChayueServlet() {
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
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		



		String chayueshijian = request.getParameter("chayueshijian");
		String chayuezhe = request.getParameter("chayuezhe");
		String chayueneirong = request.getParameter("chayueneirong");
		String beizhu = request.getParameter("beizhu");
		
		

		if (chayueshijian != null) {

			chayueshijian = new String(request.getParameter("chayueshijian").getBytes(
					"iso-8859-1"), "UTF-8");
		}
		//
		if (chayuezhe != null) {

			chayuezhe = new String(request.getParameter("chayuezhe").getBytes(
					"iso-8859-1"), "UTF-8");
		}
		
		if (chayueneirong != null) {

			chayueneirong = new String(request.getParameter("chayueneirong").getBytes(
					"iso-8859-1"), "UTF-8");
		}
		
		if (beizhu != null) {

			beizhu = new String(request.getParameter("beizhu").getBytes(
					"iso-8859-1"), "UTF-8");
		}
		
		
		
		DBHelperMysql dbh = new DBHelperMysql();
		dbh.InsertChayueXinxi(chayueshijian, chayuezhe, chayueneirong, beizhu,response, request, out);
		 
		
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