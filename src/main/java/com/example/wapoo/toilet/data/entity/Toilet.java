package com.example.wapoo.toilet.data.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "toilet")
public class Toilet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "toilet_id")
    private Long id;

    @Column(name = "toilet_state", nullable = false)
    private Integer state;

    @Enumerated(EnumType.STRING)
    @Column(name = "toilet_location",nullable = false)
    private Location location;

    @Enumerated(EnumType.STRING)
    @Column(name = "toilet_floor",nullable = false)
    private Floor floor;


    @Enumerated(EnumType.STRING)
    @Column(name = "toilet_gender", nullable = false)
    private Gender gender;

    public void update(Integer state) {
        this.state = state;
    }
}
