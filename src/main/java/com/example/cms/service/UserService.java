//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.cms.service;

import com.example.cms.domain.user.User;
import com.example.cms.domain.user.UserRepository;
import com.example.cms.domain.user.UserRequsetDto;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public User createUser(UserRequsetDto userRequsetDto) {
        User user = new User(userRequsetDto);
        return userRepository.save(user);
    }

    @Transactional
    public User updateUser(UserRequsetDto userRequsetDto, String newPassword) {
        String username = userRequsetDto.getUsername();
        String password = userRequsetDto.getPassword();
        User user = userRepository.findByUsernameAndPassword(username, password);
        userRequsetDto.setPassword(newPassword);
        user.update(userRequsetDto);
        return user;
    }

    @Transactional
    public void deleteUser(UserRequsetDto userRequsetDto) {
        String username = userRequsetDto.getUsername();
        String password = userRequsetDto.getPassword();
        User user = userRepository.findByUsernameAndPassword(username, password);
        int id = user.getId();
        userRepository.deleteById(id);
    }

    public UserService(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
