package com.example.wapoo.domain.complain.repository;

import com.example.wapoo.domain.complain.data.entity.Complain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplainRepository extends JpaRepository<Complain,Long> {
}
