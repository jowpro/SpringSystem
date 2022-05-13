package com.jluisweb.SpringSystem.DAO;

import com.jluisweb.SpringSystem.Model.Users;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DatabaseDao implements DAO {

    public final JdbcTemplate jdbcTemplate;

    public DatabaseDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public void insertar(Users users) {
        jdbcTemplate.update(
                "INSERT INTO USERS"
                        + " (id,name,password,email,time_to_create) VALUES "
                        + "(?,?,?,?,?)",
                users.getId(), users.getName(), users.getPassword(), users.getEmail(), users.getTime_to_create());
    }


    @Override
    public Users actualizar(Users users) {
        jdbcTemplate.update(
                "UPDATE USERS SET name =? WHERE id=?" ,users.getName(),users.getId());
        return  users;
    }

    @Override
    public void delete(Long id) {

        jdbcTemplate.update("delete from Users where id = ?", Long.valueOf(id));

    }

    @Override
    public List<Users> findAll() {

        return jdbcTemplate.query(
                "select * from USERS",
                (rs, rowNum) ->
                        new Users
                                (
                                        rs.getLong("id"),
                                        rs.getString("name"),
                                        rs.getString("password"),
                                        rs.getString("email"),
                                        rs.getDate("time_to_create")

                                ));


    }

    @Override
    public Users findByid(Long id) {
        String sql = "SELECT * FROM USERS WHERE ID = ?";

        return jdbcTemplate.queryForObject(sql, new Object[]{id}, (rs, rowNum) ->
                new Users(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getString("password"),
                        rs.getString("email"),
                        rs.getDate("time_to_create")
                ));
    }


}
