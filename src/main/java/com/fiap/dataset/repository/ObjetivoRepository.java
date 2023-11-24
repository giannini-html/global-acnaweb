package com.fiap.dataset.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiap.dataset.model.Objetivo;

@Repository
public interface ObjetivoRepository extends JpaRepository<Objetivo, Long> {

}
