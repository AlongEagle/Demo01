package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.DBHelperMysql;

public class SearchByXiangZhengAndNianfen extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public SearchByXiangZhengAndNianfen() {
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

		String danganbianhao = request.getParameter("danganbianhao");
		String nianfen = request.getParameter("nianfen");
		String xiangzhen = request.getParameter("xiangzhen");
		String shifouquecailiao = request.getParameter("shifouquecailiao");

		String page = request.getParameter("page");
		String rows = request.getParameter("rows");
		// String s_town = request.getParameter("s_town");
		// String s_idcardnum = request.getParameter("s_idcardnum");

		if (danganbianhao != null) {

			danganbianhao = new String(request.getParameter("danganbianhao").getBytes(
					"iso-8859-1"), "UTF-8");
		}
		//
		if (xiangzhen != null) {

			xiangzhen = new String(request.getParameter("xiangzhen").getBytes(
					"iso-8859-1"), "UTF-8");
		}
		
		if (nianfen != null) {

			nianfen = new String(request.getParameter("nianfen").getBytes(
					"iso-8859-1"), "UTF-8");
		}
		
		if (shifouquecailiao != null) {

			shifouquecailiao = new String(request.getParameter("shifouquecailiao").getBytes(
					"iso-8859-1"), "UTF-8");
		}
		
	/*	
		if (danganbianhao != null) {

			danganbianhao = new String(request.getParameter("danganbianhao").getBytes(
					"iso-8859-1"), "UTF-8");
		}*/
		
		
		System.out.println("danganbianhao------------>:"+danganbianhao+"|xiangzheng----->:"+xiangzhen+"|nianfen----------->:"+nianfen);
		
		
		DBHelperMysql dbh = new DBHelperMysql();
		
		dbh.SearchByXiangzhenAndNianfen(rows, page, xiangzhen, nianfen, shifouquecailiao, danganbianhao,response, request, out);
		
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
