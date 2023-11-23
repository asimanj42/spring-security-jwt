package az.company.springsecurity6jwt.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
@RequiredArgsConstructor
@Slf4j
public class TestController {

    @GetMapping
    public ResponseEntity<String> sayHello() {
        log.info("1");
        log.info("2");
        log.info("Test controller.................");
        return ResponseEntity.ok("Hello from secured endpoint");
    }
}
