package com.example.springbootserver.controller;

import com.example.springbootserver.service.InterpolationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final InterpolationService interpolationService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/interpolation")
    public String interpolation() {
        return "interpolation";
    }
}
