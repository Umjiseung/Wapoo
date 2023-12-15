package com.example.wapoo.data.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "wapoo")
public class Wapoo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wapoo_id")
    private Long id;

    @Column(name = "wapoo_state", nullable = false)
    private Integer state;

    @Enumerated(EnumType.STRING)
    @Column(name = "wapoo_location",nullable = false)
    private Location location;

    @Enumerated(EnumType.STRING)
    @Column(name = "wapoo_floor",nullable = false)
    private Floor floor;


    @Enumerated(EnumType.STRING)
    @Column(name = "wapoo_gender", nullable = false)
    private Gender gender;
}
