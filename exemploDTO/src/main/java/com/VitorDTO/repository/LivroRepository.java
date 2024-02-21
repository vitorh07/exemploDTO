package com.VitorDTO.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.VitorDTO.entitites.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}
