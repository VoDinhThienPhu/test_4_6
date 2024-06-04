package com.example.test_46.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String role_id;
    @Column(unique=false)
    private String role_name;

    @OneToMany(mappedBy = "role")
    private List<User> users;
}
