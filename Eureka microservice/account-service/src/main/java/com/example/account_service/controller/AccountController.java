package com.example.account_service.controller;

import com.example.account_service.models.IAuthServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AccountController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private IAuthServiceClient serviceClient;
    @GetMapping("/call-auth-service")
    public String callAuthService() {
        return serviceClient.getAuthInfo();
    }
}
