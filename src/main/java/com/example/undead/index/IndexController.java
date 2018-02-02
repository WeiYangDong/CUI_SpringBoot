package com.example.undead.index;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WeiYangDong
 * @date 2018/1/29 10:54
 * @deprecated Index
 */
@RestController
public class IndexController {

    @RequestMapping(value = "/")
    public String index(){
        return "Hello,Wei";
    }
}
