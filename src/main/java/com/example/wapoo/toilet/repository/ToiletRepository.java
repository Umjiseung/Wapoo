package com.example.wapoo.toilet.repository;

import com.example.wapoo.toilet.data.entity.Floor;
import com.example.wapoo.toilet.data.entity.Gender;
import com.example.wapoo.toilet.data.entity.Location;
import com.example.wapoo.toilet.data.entity.Toilet;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ToiletRepository extends JpaRepository<Toilet,Long> {
    Toilet findByLocationAndFloorAndGender(Location location, Floor floor, Gender gender);
}
