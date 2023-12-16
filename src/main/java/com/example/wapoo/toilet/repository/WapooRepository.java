package com.example.wapoo.toilet.repository;

import com.example.wapoo.toilet.data.entity.Floor;
import com.example.wapoo.toilet.data.entity.Gender;
import com.example.wapoo.toilet.data.entity.Location;
import com.example.wapoo.toilet.data.entity.Wapoo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface WapooRepository extends JpaRepository<Wapoo,Long> {
    Wapoo findByLocationAndFloorAndGender(Location location, Floor floor, Gender gender);
}
