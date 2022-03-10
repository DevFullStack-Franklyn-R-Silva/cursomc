package com.github.hadesfranklyn.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.hadesfranklyn.cursomc.domain.Produto;
import com.github.hadesfranklyn.cursomc.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;

	public Produto findById(Long id) {
		Optional<Produto> obj = repository.findById(id);
		return obj.orElse(null);
	}
}
