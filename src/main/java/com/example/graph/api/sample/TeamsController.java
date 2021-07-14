package com.example.graph.api.sample;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/")
public class TeamsController {

    @PostMapping
    public String replyToken(HttpServletRequest request) {
        String jsonString = request.getParameter("validationToken");
        System.out.println(jsonString);
        return jsonString;
    }
}
