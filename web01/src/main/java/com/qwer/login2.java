package com.qwer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login2")
public class login2 extends HttpServlet {

   protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
   
      req.setCharacterEncoding("utf-8");  //request로 받은 값을 utf8로 인코딩
       
       String userid = req.getParameter("userid");  //getParameter를 이용해 request 받음 
       String userpass = req.getParameter("userpass");
       
       System.out.println(userid + ", " + userpass);
       boolean flag = false;
       if(userid.equals("admin") && userpass.equals("123456")) {
          flag = true;
       }
       res.setContentType("text/html;charset=utf-8");
        PrintWriter out = res.getWriter();       
        out.println("<html><head><meta charset='utf-8'><title>로그인</title>");
        out.println("</head><body>");
        if(flag) {
           out.println("<h1>" + userid + "님, 로그인 되었습니다.</h1>");
        }else {
           out.println("<h1>너, 누구냐?</h1>");
        }
        out.println("</body></html>");
      
   }

   protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
      doGet(req, res);
   }

}