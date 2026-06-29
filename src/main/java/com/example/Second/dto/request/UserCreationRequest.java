package com.example.Second.dto.request;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;

public class UserCreationRequest {
    @Size(min = 3, message = "Password must be at least 3 characters")
    private String username;
    @Size(min = 8, message = "Password must be at least 8 characters")
    private String password;
    private String fullName;
    private LocalDate dateOfBirth;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
