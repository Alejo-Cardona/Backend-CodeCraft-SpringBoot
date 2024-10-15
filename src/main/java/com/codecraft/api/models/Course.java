package com.codecraft.api.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "COURSES")
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private UUID id;
    @Getter @Setter
    private String title;
    @Getter @Setter
    private double price;
    @Getter @Setter
    private String description;
}
