package com.example.wapoo.complain.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "complain")
public class Complain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "complain_id")
    private Long id;

    @Column(name = "complain_title")
    private String title;

    @Column(name = "complain_time")
    private String time;



}
