package org.launchcode.hellospring;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@RequestMapping("hello")
@Controller
public class exercises {

    @GetMapping("form")
    public String helloForm() {
        return "<html>"+
                "<body>"+
                "<form action='hello' method='post'>"+
                "<input type='text' name='name'>"+
                "<input type='submit' value='Greet me!'>"+
                "</form"+
                "</body>"+
                "</html>";
    }
}
