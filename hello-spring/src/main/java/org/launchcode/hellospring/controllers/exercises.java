package org.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@RequestMapping()
@Controller
public class exercises {

    @GetMapping("form")
    public String helloForm() {
        return "<html>"+
                "<body>"+
                "<form action='hello' method='post'>"+
                "<input type='text' name='name'>"+
                "<select type='text' name='name>" +
                "  <option value='French'>French</option>" +
                "  <option value='English'>English </option>" +
                "  <option value='Italian'>Italian </option>" +
                "</select>"+
                "<input type='submit' value='Greet me!'>"+
                "</form"+
                "</body>"+
                "</html>";
    }
}
