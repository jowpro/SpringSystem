package com.jluisweb.SpringSystem.DAO;

import com.jluisweb.SpringSystem.Model.Users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository <Users , Long > {


}
