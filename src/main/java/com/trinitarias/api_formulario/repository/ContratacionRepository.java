package com.trinitarias.api_formulario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trinitarias.api_formulario.dto.ContratacionDto;

public interface ContratacionRepository extends JpaRepository<ContratacionDto, Long>{

}
