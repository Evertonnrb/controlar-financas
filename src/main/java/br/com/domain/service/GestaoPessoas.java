package br.com.domain.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.domain.model.Pessoa;

public class GestaoPessoas {
	
	private static Map<Integer,Pessoa> pessoas = new HashMap<Integer, Pessoa>();
	
	static {
		pessoas.put(1, new Pessoa(1	, "Silva Sauro"));
		pessoas.put(2, new Pessoa(2	, "Lava jato"));
		pessoas.put(3, new Pessoa(3	, "Sorveteria"));
		pessoas.put(4, new Pessoa(4	, "cs 1"));
		pessoas.put(5, new Pessoa(5	, "cs2"));
		pessoas.put(6, new Pessoa(6	, "ap 102"));
	}
	
	public List<Pessoa> listarTodos(){
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.addAll(GestaoPessoas.pessoas.values());
		return pessoas;
	}
	
	public Pessoa buscarPorCodigo(Integer cod) {
		return pessoas.get(cod);
	}
}
