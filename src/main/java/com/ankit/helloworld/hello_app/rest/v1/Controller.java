package com.ankit.helloworld.hello_app.rest.v1;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class Controller {

    private static final String template = "Hello, %s!";

    @GetMapping("/greeting")
    public ResponseEntity<String> getName(@RequestParam(defaultValue = "World") String value) {
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_TYPE, "application/json; charset=UTF-8")
                .body(template.formatted(value));
    }
}
