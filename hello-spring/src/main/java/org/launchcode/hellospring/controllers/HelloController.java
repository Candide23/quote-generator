package org.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

    //Handles request path
   /* @GetMapping("hello")
    @ResponseBody
    public String hello() {
        return "Hello, Spring!";
    }*/

    //Handles request path
    @GetMapping("goodbye")
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    // Handler request of the form/ hello?name=LaunchCode

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value="hello")
    @GetMapping("hello")
    @PostMapping("hello")
    public String helloWithQueryParam(@RequestParam String name) {

        return "Hello, " + name + "!";
    }

    // Handles request of the form /hello/launchCode

    @GetMapping("hello/{name}")
    public String helloWithPathParam(@PathVariable String name) {

        return "Hello, " + name + "!";
    }

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
