package com.example.account_service.models;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "auth-service", url = "http://localhost:8082/api")
public interface IAuthServiceClient {
    @GetMapping("/auth")
    String getAuthInfo();
}
