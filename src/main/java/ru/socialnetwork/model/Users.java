package ru.socialnetwork.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "users")
public class Users {

    //PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "login")
    @NotNull
    private String login;
    @Column(name = "password")
    @NotNull
    private String password;
    @Column(name = "account_is_not_blocked")
    private Boolean accountIsNotBlocked;
    @Column(name = "account_is_not_expired")
    private Boolean accountIsNotExpired;

}
