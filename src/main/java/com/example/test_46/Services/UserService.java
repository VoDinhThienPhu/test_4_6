package com.example.test_46.Services;

import com.example.test_46.Entities.User;
import com.example.test_46.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public List<User> GetAllUser() {
        return userRepository.findAll();
    }
    public User GetUserById(String id) {
        return userRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Khong tim thay ID")
        );
    }
    public User createUser(User user) {
/*        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        user.setBirthday(dateFormat.();*/
        return userRepository.save(user);
    }
}
