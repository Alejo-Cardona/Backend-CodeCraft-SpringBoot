package com.codecraft.api.models;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "USERS")
@EqualsAndHashCode
@ToString(exclude = "password")
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private UUID id;
    @Getter @Setter
    private String firstName;
    @Getter @Setter
    private String lastName;
    @Getter @Setter
    private String dni;
    @Getter @Setter
    private String phoneNumber;
    @Getter @Setter
    private String email;
    @Getter @Setter
    private LocalDate birthdate;
    @Getter @Setter
    private String password;
    @Getter @Setter
    private byte role;
}
