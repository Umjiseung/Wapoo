package com.example.wapoo.toilet.repository;

import com.example.wapoo.toilet.data.enums.Floor;
import com.example.wapoo.toilet.data.enums.Gender;
import com.example.wapoo.toilet.data.enums.Location;
import com.example.wapoo.toilet.data.entity.Toilet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ToiletRepository extends JpaRepository<Toilet,Long> {
    List<Toilet> findByLocationAndFloorAndGender(Location location, Floor floor, Gender gender);
    Toilet findByIdAndPosition(Long id,Integer position);
}
