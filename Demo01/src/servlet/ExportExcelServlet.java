package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.DBHelperMysql;

public class ExportExcelServlet extends HttpServlet {

	public ExportExcelServlet() {
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

		// 是否打印
		String isPrint = request.getParameter("isPrint");
		String saveUrl = request.getParameter("saveUrl");
		String saveName = request.getParameter("saveName");


		System.out
				.println("-------------------------------isPrint----------------------------------------------------"
						+ isPrint);
		System.out
				.println("-------------------------------saveUrl----------------------------------------------------"
						+ saveUrl);
		System.out
				.println("-------------------------------saveName----------------------------------------------------"
						+ saveName);
		if (saveName != null) {
			saveName = new String(request.getParameter("saveName").getBytes(
					"iso-8859-1"), "UTF-8");

			System.out.println("------saveName解码后------>:" + saveName);

		}
		if (saveUrl != null) {
			saveUrl = new String(request.getParameter("saveUrl").getBytes(
					"iso-8859-1"), "UTF-8");

			System.out.println("------saveUrl解码后------>:" + saveUrl);

		}



			String results = "";

			// 导出excel
			DBHelperMysql dbh=new DBHelperMysql();
			results = dbh.exportExcel(isPrint, request, response, out,
					saveUrl, saveName);


		out.flush();
		out.close();
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
