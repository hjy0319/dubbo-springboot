package com.springboot.dubbo.dubboprovider.service.impl;

import com.hujy.dubbo.service.ISayHelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * Description
 *
 * @Author hujy
 * @Date Created in 2019-08-03 11:48
 * @Version 1.0
 */
@Service
public class SayHelloServiceImpl implements ISayHelloService {
    @Override
    public String sayHello() {
        return "hello dubbo";
    }
}
