package com.bcubbo.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class characterEncodingFilter
 */
public class characterEncodingFilter implements Filter {
	public int requestCount,requestShutdownCount,responseCount,responseShutdownCount,
	chainCount,chainShutdownCount = 0;
    public characterEncodingFilter() {
    	
    	
    }

	public void destroy() {
		
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("request过滤器被调用>>>>>>>>>>>>>>>>>:<"+requestCount+">");
		request.setCharacterEncoding("utf8");
		System.out.println("request过滤器被终止>>>>>>>>>>>>>>>>>:<"+requestShutdownCount+">");
		System.out.println("response过滤器被调用>>>>>>>>>>>>>>>>>:<"+responseCount+">");
		response.setCharacterEncoding("utf8");
		System.out.println("response过滤器被终止>>>>>>>>>>>>>>>>>:<"+responseShutdownCount+"<");
		System.out.println("doFilter方法被调用执行过滤器链开始>>>>>>>>>>>>>>>>>:<"+chainCount+">");
		chain.doFilter(request, response);
		System.out.println("doFilter方法被终止执行过滤器链结束>>>>>>>>>>>>>>>>>:<"+chainShutdownCount+">");
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
		
		
	}

}
