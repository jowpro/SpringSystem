package com.jluisweb.SpringSystem.Controller;


import com.jluisweb.SpringSystem.Model.Users;
import com.jluisweb.SpringSystem.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("system")
public class UserController {

    @Autowired
    //inyecion de dependencia
    private UsersService usersService;

    @PostMapping("/insertar_api")
    public void insertar(@RequestBody Users users)
    {
       usersService.insertar(users);
    }

    @GetMapping("/obtener/{id}")
    public Users find(@PathVariable("id")Long id)
    {
        return usersService.findByid(id);
    }

    @GetMapping("/obtenertodos")

    public List<Users> findAll()
    {
        return usersService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id)
    {

        usersService.delete(id);
    }

    @PutMapping ("/actualizar")
    public Users actualizar(@RequestBody Users users)
    {

      return   usersService.actualizar(users);
    }
}