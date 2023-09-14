package me.dio.santanderbootcamp.service.impl;

import me.dio.santanderbootcamp.domain.User;
import me.dio.santanderbootcamp.repository.UserRepository;
import me.dio.santanderbootcamp.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }
    @Override
    public User create(User userToCreate) {
        if(userToCreate.getId_user() != null && userRepository.existsById(userToCreate.getId_user())){
            throw new IllegalArgumentException("This user Id already exists");
        }
        return userRepository.save(userToCreate);
    }
}
