package com.wzj.web.service.impl;

import com.wzj.web.service.EhcacheTestService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author wzj
 * @create 2018-07-15 16:00
 **/
@Service
public class EhcacheTestServiceImpl implements EhcacheTestService
{
    /**
     * ehcache测试
     * @return
     */
    @Cacheable(value="cacheTest")
    @Override
    public String getTimestamp()
    {
        Long timestamp = System.currentTimeMillis();
        return timestamp.toString();
    }
}
