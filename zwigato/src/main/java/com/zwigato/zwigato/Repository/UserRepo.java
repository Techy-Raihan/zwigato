package com.zwigato.zwigato.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zwigato.zwigato.Entity.User;

public interface UserRepo extends JpaRepository<User, Long> {
    
}
