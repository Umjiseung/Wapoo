package com.example.wapoo.toilet.data.entity;

import com.example.wapoo.toilet.data.enums.Floor;
import com.example.wapoo.toilet.data.enums.Gender;
import com.example.wapoo.toilet.data.enums.Location;
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

    @Column(name = "toilet_last", nullable = false)
    private Integer last;

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
    private Boolean position;

    public void update(Integer last) {
        this.last = last;
    }
}
