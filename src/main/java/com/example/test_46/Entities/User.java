package Entities;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String ID;
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false, unique = true)
    private String email;
    private String password;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;


    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role roles;


}