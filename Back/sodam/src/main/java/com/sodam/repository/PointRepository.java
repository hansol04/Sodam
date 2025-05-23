package com.sodam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sodam.domain.PointDomain;

@Repository
public interface PointRepository extends JpaRepository<PointDomain, Long>{

}
