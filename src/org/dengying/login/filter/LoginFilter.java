package org.dengying.login.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebFilter(filterName="LoginFilter",urlPatterns="/*")
public class LoginFilter implements Filter{

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// 获得在下面代码中要用的request,response,session对象
		//int i=0;
		HttpServletRequest servletRequest = (HttpServletRequest) request;
		HttpServletResponse servletResponse = (HttpServletResponse) response;
		HttpSession session = servletRequest.getSession();
		// 获得用户请求的URI
		String path = servletRequest.getRequestURI();
		if(session.getAttribute("username") == null){
		String username = request.getParameter("username");
		session.setAttribute("username", username);
		}
		String actor = (String)session.getAttribute("username");
		//如果是登录判断页面，不用进行过滤检查
			if ("/CPMS/".equals(path)){
				chain.doFilter(request, response);
			}
			else if (path.indexOf(".jpg")>0||path.indexOf(".bmp")>0||path.indexOf(".css")>0||path.indexOf(".js")>0||path.indexOf("login.jsp")>0) {
				chain.doFilter(request, response);
			}
				else {
					//判断用户是否进行了登录，如果进行了登录才能继续操作，否则跳转到登录页面
					if (actor == null  || "".equals(actor)) {
						//request.getRequestDispatcher("/login/login").forward(request, response);
						servletResponse.sendRedirect("/CPMS/");
		//				System.out.println("请登录");
					 } 
					else {
						// 已经登陆,继续此次请求
						chain.doFilter(request, response);
			     		}	
					}
	}
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}
}