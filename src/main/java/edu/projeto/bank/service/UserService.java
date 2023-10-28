package edu.projeto.bank.service;
import edu.projeto.bank.domain.model.User;
import edu.projeto.bank.domain.repository.*;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    UserRepository userRepository;

     public User findById(String id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account number already exists.");
        }
        return userRepository.save(userToCreate);
    }
}
