package com.komissarov.storeservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @RequestMapping("/showMessage")
    void showMessage() {
        System.out.println("=== store service message ===");
    }
}
