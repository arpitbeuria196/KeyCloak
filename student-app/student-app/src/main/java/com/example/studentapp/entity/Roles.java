package com.example.studentapp.entity;

import javax.persistence.*;

@Table(name = "roles")
@Entity
public class Roles
{
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "role")
    private String role;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


}
