package com.Blogue.Pessoal.BlogPessoal.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import com.Blogue.Pessoal.BlogPessoal.model.PostagemModel;

public interface PostagemRepository extends JpaRepository<PostagemModel, Long> {

	public List<PostagemModel> findAllByTextoContainingIgnoreCase(String texto);
}
