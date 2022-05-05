package com.jluisweb.SpringSystem.Model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private  String name;
    private  String email;
    private  String password;
    private Date time_to_create;

    public Users() {

    }

    public Users(long id, String name, String email, String password, Date time_to_create) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.time_to_create = time_to_create;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getTime_to_create() {
        return time_to_create;
    }

    public void setTime_to_create(Date time_to_create) {
        this.time_to_create = time_to_create;
    }


}
