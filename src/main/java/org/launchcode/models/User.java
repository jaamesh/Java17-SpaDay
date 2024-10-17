package org.launchcode.models;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class User {

    @NotNull
    @Size(min = 4, max = 100)
    private String userName = null;

    @NotNull
    @Size(min = 7, max = 100)
    private String email = null;

    @NotNull
    @Size(min = 8, max = 100)
    private String password = null;

    public User() {}

    public @NotNull @Size(min = 4, max = 100) String getUserName() {
        return userName;
    }

    public void setUserName(@NotNull @Size(min = 4, max = 100) String userName) {
        this.userName = userName;
    }

    public @NotNull @Size(min = 7, max = 100) String getEmail() {
        return email;
    }

    public void setEmail(@NotNull @Size(min = 7, max = 100) String email) {
        this.email = email;
    }

    public @NotNull @Size(min = 8, max = 100) String getPassword() {
        return password;
    }

    public void setPassword(@NotNull @Size(min = 8, max = 100) String password) {
        this.password = password;
    }
}
