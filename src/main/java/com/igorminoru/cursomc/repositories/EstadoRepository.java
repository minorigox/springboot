package com.igorminoru.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.igorminoru.cursomc.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository < Estado, Integer > {

}