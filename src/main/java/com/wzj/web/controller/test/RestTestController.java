package com.wzj.web.controller.test;

import com.wzj.web.service.EhcacheTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wzj
 * @create 2018-07-14 16:13
 **/
@Controller
public class RestTestController
{
    /**
     * 注入服务
     */
    @Autowired
    private EhcacheTestService ehcacheTestService;

    /**
     * 返回数据
     * @return 返回数据
     */
    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello()
    {
        System.out.println("---------RestTestController hello executed--------");
        return "hello welcome";
    }

    /**
     * 返回数据
     * @return 返回数据
     */
    @RequestMapping(value = "/ehcache")
    @ResponseBody
    public String ehcache()
    {
        System.out.println("---------RestTestController ehcache executed--------");
        return ehcacheTestService.getTimestamp();
    }
}
