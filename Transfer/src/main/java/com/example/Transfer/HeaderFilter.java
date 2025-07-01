package com.example.Transfer;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.Filter;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Enumeration;


@Component
public class HeaderFilter implements Filter {
    @Override
   public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
       throws IOException, ServletException {
       HttpServletRequest httpServletRequest = (HttpServletRequest)  request;
        Enumeration<String> headers = httpServletRequest.getHeaderNames();
        while(headers.hasMoreElements()){
            String header = headers.nextElement();
            String value = httpServletRequest.getHeader(header);
            System.out.println(header + " : "+ value);
        }

        chain.doFilter(request, response);

   }
}
