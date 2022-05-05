package com.jluisweb.SpringSystem.Controller;


import com.jluisweb.SpringSystem.DAO.UsersRepository;
import com.jluisweb.SpringSystem.Model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("system")
public class UserController {

    @Autowired
    //inyecion de dependencia
    private UsersRepository usersRepository;

    @PostMapping("/guardar")
    public void guardar(@RequestBody Users users) {

        usersRepository.save(users);

    }

    @GetMapping("/obtener")
    public List<Users> obtener() {
        return usersRepository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {

        usersRepository.deleteById(id);
    }

    @PutMapping ("/actualizar")
    public void actualizar(@RequestBody Users users) {

        usersRepository.save(users);
    }
}