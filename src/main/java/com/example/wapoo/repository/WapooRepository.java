package com.example.wapoo.repository;

import com.example.wapoo.data.entity.Floor;
import com.example.wapoo.data.entity.Gender;
import com.example.wapoo.data.entity.Location;
import com.example.wapoo.data.entity.Wapoo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface WapooRepository extends JpaRepository<Wapoo,Long> {
    Wapoo findByLocationAndFloorAndGender(Location location, Floor floor, Gender gender);
}
