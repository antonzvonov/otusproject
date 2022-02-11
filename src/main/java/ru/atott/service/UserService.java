package ru.atott.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.atott.model.User;
import ru.atott.repository.UserRepository;
import ru.atott.request.UpdateUserRequest;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> list() {
        return userRepository.findAll();
    }

    public User getUser(Long userId) {
        return userRepository.getById(userId);
    }

    public User createUser(UpdateUserRequest createUserRequest) {
        User user = new User();
        user.setEmail(createUserRequest.getEmail());
        user.setFirstName(createUserRequest.getFirstName());
        user.setLastName(createUserRequest.getLastName());
        user.setPhone(createUserRequest.getPhone());
        user.setUsername(createUserRequest.getUsername());

        return userRepository.save(user);
    }

    public User updateUser(Long userId, UpdateUserRequest updateUserRequest) {
        User user = new User();
        user.setId(userId);
        user.setEmail(updateUserRequest.getEmail());
        user.setFirstName(updateUserRequest.getFirstName());
        user.setLastName(updateUserRequest.getLastName());
        user.setPhone(updateUserRequest.getPhone());
        user.setUsername(updateUserRequest.getUsername());
        return userRepository.save(user);
    }

    public void delete(Long userId) {
        userRepository.deleteById(userId);
    }
}
