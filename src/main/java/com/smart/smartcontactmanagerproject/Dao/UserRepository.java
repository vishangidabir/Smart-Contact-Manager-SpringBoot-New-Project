package com.smart.smartcontactmanagerproject.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.smartcontactmanagerproject.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
