package com.example.auth_service.auth;

import com.example.auth_service.auth.LoginRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")  // Đảm bảo rằng path này phù hợp với cấu hình của Gateway
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        // Xử lý logic đăng nhập tại đây
        return "Login successful";
    }

    @GetMapping("/info")
    public String getAuthInfo() {
        return "Auth Service Info";
    }
}
