package com.pollhub.polls.repository;

import com.pollhub.polls.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserName(String userName);
    Optional<User> findByEmail(String email);
    Optional<User> findByUserNameOrEmail(String userName, String email);
    List<User> findByIdIn(List<Long> ids);
    Boolean existsByUserName(String userName);
    Boolean existsByEmail(String email);
}
