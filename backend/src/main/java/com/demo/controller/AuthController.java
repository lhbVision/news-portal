@RestController
@RequestMapping("/api/auth")
public class AuthController {
    
    @PostMapping("/login")
    public Response login(@RequestBody LoginRequest request) {
        return Response.success("登录成功");
    }
    
    // 不使用Lombok，手动写getter/setter
    static class LoginRequest {
        private String username;
        private String password;
        
        // 手动添加getter/setter
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
    
    static class Response {
        private int code;
        private String message;
        private Object data;
        
        public int getCode() { return code; }
        public void setCode(int code) { this.code = code; }
        public String getMessage() { return message; }
        public void setMessage(String message) { this.message = message; }
        public Object getData() { return data; }
        public void setData(Object data) { this.data = data; }
        
        public static Response success(String message) {
            Response response = new Response();
            response.setCode(200);
            response.setMessage(message);
            return response;
        }
    }
}
