package edu.projeto.bank.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.projeto.bank.domain.model.User;

public interface UserRepository extends JpaRepository<User, String>{
    boolean existsByAccountNumber(String number);
}
