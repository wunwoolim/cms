//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.cms.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    public UserController() {
    }

    @GetMapping({"/join"})
    public String joinForm() {
        return "user/joinForm";
    }

    @GetMapping({"/login"})
    public String loginForm() {
        return "user/loginForm";
    }

    @GetMapping({"/memberList"})
    public String memberList() {
        return "user/memberList";
    }

    @GetMapping({"/mypage"})
    public String mypage() {
        return "user/mypage";
    }
}
