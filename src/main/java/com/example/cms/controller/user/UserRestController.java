//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.cms.controller.user;

import com.example.cms.domain.user.User;
import com.example.cms.domain.user.UserRepository;
import com.example.cms.domain.user.UserRequsetDto;
import com.example.cms.service.UserService;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping({"/v1/user"})
@RestController
public class UserRestController {
    private final UserRepository userRepository;
    private final UserService userService;

    @GetMapping({"/search"})
    public User getUserByUsername(@RequestParam String username) {
        User user = null;
        user = this.userRepository.findByUsername(username);
        return user;
    }

    @GetMapping({"/search/{id}"})
    public User getUserById(@PathVariable int id) {
        User user = null;
        user = (User)this.userRepository.findById(id).orElseThrow(() -> {
            return new IllegalArgumentException("존재하지 않는 아이디 입니다.");
        });
        return user;
    }

    @PostMapping({"/search"})
    public User getUserByUsernamePassword(@RequestBody UserRequsetDto userRequsetDto) {
        User user = null;
        String username = userRequsetDto.getUsername();
        String password = userRequsetDto.getPassword();
        user = this.userRepository.findByUsernameAndPassword(username, password);
        return user;
    }

    @GetMapping({"/list"})
    public List<User> getUserAll() {
        return this.userRepository.findAll();
    }

    @PostMapping({"/join"})
    public User joinUser(@RequestBody UserRequsetDto userRequsetDto) {
        return userService.createUser(userRequsetDto);
    }

    @PutMapping({"/edit"})
    public User editUser(@RequestBody UserRequsetDto userRequsetDto, @RequestParam String newPassword) {
        return userService.updateUser(userRequsetDto, newPassword);
    }

    @DeleteMapping({"/leave"})
    public void leaveUSer(@RequestBody UserRequsetDto userRequsetDto) {
        this.userService.deleteUser(userRequsetDto);
    }

    public UserRestController(final UserRepository userRepository, final UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }
}
