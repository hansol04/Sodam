package com.sodam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sodam.domain.MemberDomain;

@Repository
public interface MemberRepository extends JpaRepository<MemberDomain, String>{

}
