package com.example.undead.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author WeiYangDong.
 * @Description Index
 * @data 2018/1/27
 */
@Controller
public class IndexController {

    @ResponseBody
    @RequestMapping(value = "/index")
    public String index(){
        return "Hello";
    }
}

