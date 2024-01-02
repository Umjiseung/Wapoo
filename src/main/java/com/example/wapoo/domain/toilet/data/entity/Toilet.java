package com.example.wapoo.domain.toilet.data.entity;

import com.example.wapoo.domain.toilet.data.enums.Floor;
import com.example.wapoo.domain.toilet.data.enums.Gender;
import com.example.wapoo.domain.toilet.data.enums.Location;
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
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "toilet_location",nullable = false)
    private Location location;

    @Enumerated(EnumType.STRING)
    @Column(name = "toilet_floor",nullable = false)
    private Floor floor;

    @Enumerated(EnumType.STRING)
    @Column(name = "toilet_gender", nullable = false)
    private Gender gender;

    @Column(name = "toilet_position",nullable = false)
    private Integer position;

    @Column(name = "toilet_state",nullable = false)
    private Boolean state;

    public void update(Boolean state) {
        this.state = state;
    }
}
