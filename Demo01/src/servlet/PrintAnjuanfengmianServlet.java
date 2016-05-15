package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.po.Dyhdl;
import com.util.DBHelperMysql;

public class PrintAnjuanfengmianServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public PrintAnjuanfengmianServlet() {
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


		String danghao = request.getParameter("danghao");

		System.out.println("data----------"+danghao);
		
		

		if (danghao != null) {
			danghao = new String(request.getParameter("danghao").getBytes(
					"iso-8859-1"), "UTF-8");
		}
		//
		
		
		
		DBHelperMysql dbh = new DBHelperMysql();
		
		Dyhdl dyhdl=null;
				
		dbh.queryByDangHaoToPrintAnjuanfengmian(danghao, response, request, out);
		
				
		
		
		
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