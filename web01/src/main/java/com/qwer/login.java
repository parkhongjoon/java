package com.qwer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class login extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      
		//브라우저에게 html이 utf-8형식이라고 전달
	       response.setContentType("text/html;charset=UTF-8");
	       PrintWriter out = response.getWriter(); 
	       //서블릿에서 만드는 html파일의 인코딩이 utf-8
	       response.setCharacterEncoding("utf-8");
	       request.setCharacterEncoding("utf-8");
	       String id = request.getParameter("id");
	       String pass = request.getParameter("pass");
	       
	       if(id.equals("홍길동") && pass.equals("123456")) {
	    	   
	       out.println("<html>");
	       out.println("<meta charset='utf-8'>");
	       out.println("<head><title>크론테스트</title></head>");
	       out.println("<body>");
	       out.println("<h1>환영합니다.</h1>");
	       out.println("<p>아이디 : " +id+"</p>");
	       out.println("</body>");
	       out.println("</html>");
	       }else {
	    	   out.println("<html>");
		       out.println("<meta charset='utf-8'>");
		       out.println("<head><title>크론테스트</title></head>");
		       out.println("<body>");
		       out.println("<h1>로그인실패</h1>");
		       out.println("</body>");
		       out.println("</html>");
		}
	       
	   }
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
