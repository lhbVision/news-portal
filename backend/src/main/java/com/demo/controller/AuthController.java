package com.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    
    @PostMapping("/login")
    public Response login(@RequestBody LoginRequest request) {
        return Response.success("登录成功");
    }
    
    @Data
    static class LoginRequest {
        private String username;
        private String password;
    }
    
    @Data
    static class Response {
        private int code;
        private String message;
        private Object data;
        
        public static Response success(String message) {
            Response response = new Response();
            response.code = 200;
            response.message = message;
            return response;
        }
    }
}
