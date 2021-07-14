package com.example.graph.api.sample;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/")
@CrossOrigin
public class TeamsController {

    @GetMapping
    public String sayHello() {
        return "Hello";
    }

    @PostMapping
    public String replyToken(HttpServletRequest request) {
        String jsonString = request.getParameter("validationToken");
        System.out.println(jsonString);
        return jsonString;
    }
}
