package com.example.wapoo.toilet.repository;

import com.example.wapoo.toilet.data.enums.Floor;
import com.example.wapoo.toilet.data.enums.Gender;
import com.example.wapoo.toilet.data.enums.Location;
import com.example.wapoo.toilet.data.entity.Toilet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface ToiletRepository extends JpaRepository<Toilet,Long> {
    List<Toilet> findByLocationAndFloor(Location location, Floor floor);
    Toilet findByIdAndPosition(Long id, Integer position);
}
