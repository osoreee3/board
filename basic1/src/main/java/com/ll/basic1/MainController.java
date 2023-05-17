package com.ll.basic1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class MainController
{
    @GetMapping("/") // /붙인곳으로 찾아감

    public String index(){
        return "redirect:/question/list";
    }
}
