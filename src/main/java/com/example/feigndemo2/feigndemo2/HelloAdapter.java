package com.example.feigndemo2.feigndemo2;

import feign.HeaderMap;
import feign.Headers;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient(name="LocalHelloService",value="LocalHelloService",url = "http://localhost:8081")
public interface HelloAdapter {

    @RequestMapping(method = RequestMethod.GET,value = "/quote")
    String getMessage() throws Exception;

    @RequestMapping(method = RequestMethod.POST,value = "/form")
    @Headers("Content-Type: application/x-www-form-urlencoded")
    String getFormData(@Param("email") String emailValue,@Param("user") String userValue) throws Exception;
}
