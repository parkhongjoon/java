package com.Secondweb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description="두번째 서블릿" , urlPatterns={"/sservlet", "/ssv"})
public class SecondServlet extends HttpServlet {
	
	public void init() throws ServletException {
		System.out.println("init 메소드 실행됨");
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
					throws ServletException, IOException{
		System.out.println("doGet 메소드 실행");
	}
}


