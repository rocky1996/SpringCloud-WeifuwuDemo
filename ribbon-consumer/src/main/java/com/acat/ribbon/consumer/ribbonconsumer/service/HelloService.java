package com.acat.ribbon.consumer.ribbonconsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    public String sayHello(){
        //通过rest调用，调用provider
        return restTemplate.getForObject("http://ribbon-provider/hello?name=wujinfan",String.class);
    }

}
