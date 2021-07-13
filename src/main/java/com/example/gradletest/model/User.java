package com.example.gradletest.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "USER_TABLE")
public class User {

    // @Column(name = "USER_ID")
    @Id
    private String userId;
    private String userPw;
    private String userRole;

    public User(String userId, String userPw, String userRole) {
        this.userId = userId;
        this.userPw = userPw;
        this.userRole = userRole;
    }

}
