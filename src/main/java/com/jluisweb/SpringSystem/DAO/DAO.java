package com.jluisweb.SpringSystem.DAO;

import com.jluisweb.SpringSystem.Model.Users;

import java.util.List;

public interface DAO {

    void insertar(Users users);

    Users actualizar(Users users);

    void delete (Long id);

    List<Users> findAll();

    Users findByid (Long id);


}
