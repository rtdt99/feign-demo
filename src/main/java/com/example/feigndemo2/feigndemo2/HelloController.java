package com.example.feigndemo2.feigndemo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @Autowired
    HelloAdapter helloAdapter;

    @RequestMapping(method = RequestMethod.GET,value = "/hello")
    public String getGreeting(){
        String res="";
        try {
            res = helloAdapter.getMessage();
        }catch (Exception ex){
            System.out.println("Exception caught");
            System.out.println(ex.getCause()+", Reason: "+ex.getMessage());

        }

        return res;
    }

}
