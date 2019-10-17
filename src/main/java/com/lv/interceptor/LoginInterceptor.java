package com.lv.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import com.lv.po.Admin;

public class LoginInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		String url=request.getRequestURI();
		if(url.indexOf("login")>=0){
			System.out.println("·����ȷ������ִ��");
			return true;
		}
		HttpSession session=request.getSession();
		Admin adminLogin = (Admin) session.getAttribute("adminLogin");
		if(adminLogin!=null){
			System.out.println("���ڹ���Ա��Ϣ������ִ��");
			return true;
		}
		request.setAttribute("msg", "�㻹δ��¼�����ȵ�¼��");
		request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
		return false;
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
