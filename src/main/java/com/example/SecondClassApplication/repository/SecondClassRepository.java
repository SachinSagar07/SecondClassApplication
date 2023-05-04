package com.example.SecondClassApplication.repository;

import com.example.SecondClassApplication.entity.SecondClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecondClassRepository extends JpaRepository<SecondClass,Integer> {
}
