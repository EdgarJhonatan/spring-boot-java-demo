package com.delgadev.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delgadev.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{

}
