package com.example.simplewebapplication1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Shalitha Anuradha <shalithaanuradha123@gmail.com>
 * @since : 2021-07-25
 **/
@RestController
public class SimpleController {
    @RequestMapping("/")
    public String index(){
        return "Hello World yeah";
    }
    @RequestMapping("/a")
    public String indexa(){
        return "Hello World A";
    }
}
//Git commit using SSH keys
