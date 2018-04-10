package com.example.myapp.Users.Repository.Entity;

public class UserEntity {

    private final long id;
    private final String login;
    private final String email;
    private final String password;

    public UserEntity(long id, String login, String email, String password) {
        this.id = id;
        this.login = login;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}

