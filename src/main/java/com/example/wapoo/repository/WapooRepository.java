package com.example.wapoo.repository;

import com.example.wapoo.data.entity.Gender;
import com.example.wapoo.data.entity.Wapoo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WapooRepository extends JpaRepository<Wapoo,Long> {
    List<Wapoo> findByGender(Gender gender);
}
