package com.Context;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletInfo")
public class ServletInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		ServletContext context = this.getServletContext();
		ServletContext sc = this.getServletContext();
		
		String list = "<li><label>서블릿 버전</label>" + sc.getMajorVersion() + "." + sc.getMinorVersion() + "</li>";
		list += "<li><label>서버 정보</label>" + sc.getServerInfo() + "</li>";
		list += "<li><label>애플리케이션 경로 :</label> " + sc.getContextPath() + "<li>";
		list += "<li><label>애플리케이션 이름 :</label> " + sc.getServletContextName() + "</li>";
		list += "<li><label>파일의 실제 경로 :</label> " + sc.getRealPath("/") + "</li>";
				
		out.println("<html>");
		out.println("<head>");
		out.println("<title>third</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<ol>");
		out.println(list);
		out.println("</ol>");
		out.println("</body>");
		out.println("</html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
