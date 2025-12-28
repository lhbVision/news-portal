package com.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    
    @GetMapping("/test")
    public Response test() {
        Response response = new Response();
        response.setCode(200);
        response.setMessage("API测试成功");
        return response;
    }
    
    @PostMapping("/login")
    public Response login(@RequestBody LoginRequest request) {
        System.out.println("收到登录请求 - 用户名: " + request.getUsername());
        
        Response response = new Response();
        
        if ("admin".equals(request.getUsername()) && "123456".equals(request.getPassword())) {
            response.setCode(200);
            response.setMessage("登录成功");
        } else {
            response.setCode(401);
            response.setMessage("用户名或密码错误");
        }
        
        return response;
    }
    
    // 手动写getter/setter的请求类
    public static class LoginRequest {
        private String username;
        private String password;
        
        public String getUsername() {
            return username;
        }
        
        public void setUsername(String username) {
            this.username = username;
        }
        
        public String getPassword() {
            return password;
        }
        
        public void setPassword(String password) {
            this.password = password;
        }
    }
    
    // 手动写getter/setter的响应类
    public static class Response {
        private int code;
        private String message;
        private Object data;
        
        public int getCode() {
            return code;
        }
        
        public void setCode(int code) {
            this.code = code;
        }
        
        public String getMessage() {
            return message;
        }
        
        public void setMessage(String message) {
            this.message = message;
        }
        
        public Object getData() {
            return data;
        }
        
        public void setData(Object data) {
            this.data = data;
        }
    }
}
