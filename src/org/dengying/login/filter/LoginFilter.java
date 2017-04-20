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
		// ��������������Ҫ�õ�request,response,session����
		//int i=0;
		HttpServletRequest servletRequest = (HttpServletRequest) request;
		HttpServletResponse servletResponse = (HttpServletResponse) response;
		HttpSession session = servletRequest.getSession();
		// ����û������URI
		String path = servletRequest.getRequestURI();
		if(session.getAttribute("username") == null){
		String username = request.getParameter("username");
		session.setAttribute("username", username);
		}
		String actor = (String)session.getAttribute("username");
		//����ǵ�¼�ж�ҳ�棬���ý��й��˼��
			if ("/CPMS/".equals(path)){
				chain.doFilter(request, response);
			}
			else if (path.indexOf(".jpg")>0||path.indexOf(".bmp")>0||path.indexOf(".css")>0||path.indexOf(".js")>0||path.indexOf("login.jsp")>0) {
				chain.doFilter(request, response);
			}
				else {
					//�ж��û��Ƿ�����˵�¼����������˵�¼���ܼ���������������ת����¼ҳ��
					if (actor == null  || "".equals(actor)) {
						//request.getRequestDispatcher("/login/login").forward(request, response);
						servletResponse.sendRedirect("/CPMS/");
		//				System.out.println("���¼");
					 } 
					else {
						// �Ѿ���½,�����˴�����
						chain.doFilter(request, response);
			     		}	
					}
	}
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}
}