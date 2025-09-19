package br.com.daianegeraldino.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.daianegeraldino.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

    
}
