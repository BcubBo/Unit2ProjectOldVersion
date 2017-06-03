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

    public characterEncodingFilter() {
    	
    	
    }

	public void destroy() {
		
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		request.setCharacterEncoding("utf8");
		System.out.println("过滤器被调用>>>>>>>>>>>>>>>>>");
		response.setCharacterEncoding("utf8");
		
		
		
		chain.doFilter(request, response);
		
		System.out.println("过滤器调用结束>>>>>>>>>>>>>>>>>");
		
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
		
		
	}

}
