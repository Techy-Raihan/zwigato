package com.zwigato.zwigato.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "password", length = 16)
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "name", length = 16)
    private String name;

    @Column(name = "city", length = 16)
    private String city;


    // Generated parameterized constructor
    public User(String username, String password, String email, String name, String city) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
        this.city = city;
    }
    public User() {
        }
        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }

        // Generated getters and setters
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
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getCity() {
            return city;
        }
        public void setCity(String city) {
            this.city = city;
        } 
}
