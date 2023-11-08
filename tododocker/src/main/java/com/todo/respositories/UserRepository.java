package com.todo.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
	
	UserEntity findByUsername(String username);

}
