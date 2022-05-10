package cj.springmvc.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping(value = "/")
    public String toPage1(){
        return "page1";
    }
    @RequestMapping(value = "/target")
    public String toPage2(){
        return "page2";
    }
}
