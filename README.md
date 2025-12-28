# 网讯国产化改造（CTP6）（前端Vue3+后端SpringBoot）

## 常用启动指令（运行NewsApplication.java成功之后）
## （无需停止运行直接启动以下操作）
1.cd frontend or cd news-portal-main/frontend
2.npm install
3.npm run dev

## 启动（供参考）
1. 前端: `npm run dev:front`
2. 后端: `mvn spring-boot:run` 或 `npm run dev:back`

## 访问
- 前端: http://localhost:3000
- 后端API: http://localhost:8080/api  

## 登入
- 账号：admin
- 密码：123456

## 项目状态总结：
- 后端SpringBoot：http://localhost:8080/api/auth/test （API正常）
- 前端Vue3：http://localhost:3000 （页面正常）
- 路由功能：首页和登录页面切换正常
- 登录按钮：可以点击并调用后端API
- 完整框架：Vue3 + SpringBoot基础框架完成
