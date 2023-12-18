package com.example.wapoo.toilet.data.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "wapoo")
public class Toilet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public void update(Integer state) {
        this.state = state;
    }
}
