package com.sergiomartinrubio;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

@Controller
public class UpperCaseController {

    @Get("/touppercase/{input}")
    public String toUpperCase(@PathVariable("input") String input) {
        return input.toUpperCase();
    }

}
