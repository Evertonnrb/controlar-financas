package br.com.domain.model.enuns;

public enum TipoLancamento {

	RECEITA("Receita"), DESPESA("Despesa");

	private String descricao;

	TipoLancamento(String descricao) {
		this.descricao = descricao;
	}

	public String descricao() {
		return this.descricao;
	}

}
