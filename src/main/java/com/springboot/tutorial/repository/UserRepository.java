package com.springboot.tutorial.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.tutorial.modal.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String email);
}