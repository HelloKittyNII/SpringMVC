package com.wzj.web.fitler;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wzj
 * @create 2018-07-15 14:21
 **/
public class TestFilter2 extends OncePerRequestFilter
{
    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest,
                                    HttpServletResponse httpServletResponse,
                                    FilterChain filterChain) throws ServletException, IOException
    {
        System.out.println("############TestFilter2 doFilterInterna2 executed############");
        filterChain.doFilter(httpServletRequest, httpServletResponse);

        //在视图页面返回给客户端之前执行，但是执行顺序在Interceptor之后
        System.out.println("############TestFilter2 doFilter after############");
    }
}
