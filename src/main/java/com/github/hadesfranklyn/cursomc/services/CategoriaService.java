package com.github.hadesfranklyn.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.hadesfranklyn.cursomc.domain.Categoria;
import com.github.hadesfranklyn.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;

	public Categoria findById(Long id) {
		Optional<Categoria> obj = repository.findById(id);
		return obj.orElse(null);
	}
}
