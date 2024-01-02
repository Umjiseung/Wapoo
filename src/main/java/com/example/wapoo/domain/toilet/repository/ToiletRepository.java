package com.example.wapoo.domain.toilet.repository;

import com.example.wapoo.domain.toilet.data.entity.Toilet;
import com.example.wapoo.domain.toilet.data.enums.Floor;
import com.example.wapoo.domain.toilet.data.enums.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ToiletRepository extends JpaRepository<Toilet,Long> {
    List<Toilet> findByLocationAndFloor(Location location, Floor floor);
    Toilet findByIdAndPosition(Long id, Integer position);
}
