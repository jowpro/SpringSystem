package com.jluisweb.SpringSystem.Service;

import com.jluisweb.SpringSystem.DAO.DatabaseDao;
import com.jluisweb.SpringSystem.Model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@Service
public class UsersService {

    @Autowired
    //inyecion de dependencia
    private DatabaseDao databaseDao;


    public void insertar(@RequestBody Users users)
    {
        databaseDao.insertar(users);
    }

    public List<Users> findAll()
    {
        return databaseDao.findAll();
    }

    public void delete(@PathVariable("id") Long id)
    {
        databaseDao.delete(id);
    }

    public Users actualizar(Users users)
    {
    return databaseDao.actualizar(users);
    }

    public Users findByid(Long id)
    {
        return databaseDao.findByid(id);
    }


}
