package com.jluisweb.SpringSystem.Model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  long id;
    @Column (name = "name",length = 50,nullable = false)
    private  String name;
    @Column (name = "password",length = 50,nullable = false)
    private  String password;
    @Column (name = "email",length = 50,nullable = false)
    private  String email;
    @Column (name = "time_to_create",length = 50,nullable = false)
    private Date time_to_create;

    public Users() {

    }

    public Users(long id, String name,  String password, String email,Date time_to_create) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getTime_to_create() {
        return time_to_create;
    }

    public void setTime_to_create(Date time_to_create) {
        this.time_to_create = time_to_create;
    }
}
