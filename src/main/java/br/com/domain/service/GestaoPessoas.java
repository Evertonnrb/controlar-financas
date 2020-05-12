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
		pessoas.put(1, new Pessoa(2	, "Lava jato"));
		pessoas.put(1, new Pessoa(1	, "Sorveteria"));
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
