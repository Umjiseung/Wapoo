package com.example.wapoo.data.entity;

import com.example.wapoo.data.dto.request.StateUpdateRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Table(name = "wapoo")
public class Wapoo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wapoo_id")
    private Long id;

    @Column(name = "wapoo_location",nullable = false)
    private Location location;

    @Column(name = "wapoo_state", nullable = false)
    private Integer state;

    @Column(name = "wapoo_gender", nullable = false)
    private Gender gender;

    public void update(StateUpdateRequest updateRequest) {
        this.id = updateRequest.getId();
        this.state = updateRequest.getState();
    }


}
