package com.springsecurity.jpa.springsecurityjpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

public interface UserRepository extends JpaRepository<User,Integer> {


}
