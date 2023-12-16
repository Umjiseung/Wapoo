package com.example.wapoo.complain.repository;

import com.example.wapoo.complain.data.entity.Complain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplainRepository extends JpaRepository<Complain,Long> {
}
