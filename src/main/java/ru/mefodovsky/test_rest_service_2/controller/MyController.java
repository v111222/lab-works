package ru.mefodovsky.test_rest_service_2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.mefodovsky.test_rest_service_2.model.Request;

@Slf4j
@RestController
public class MyController {
    @PostMapping(value = "/logging")
    public ResponseEntity<?> log(@RequestBody Request request) {
        log.info("Получен request: " + request);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
