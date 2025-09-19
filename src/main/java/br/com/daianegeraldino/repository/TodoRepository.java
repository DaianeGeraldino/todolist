package br.com.daianegeraldino.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<br.com.daianegeraldino.entity.Todo, Long> {
    
    
}
