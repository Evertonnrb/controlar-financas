package br.com.domain.model.enuns;

public enum TipoLancamento {

	RECEITA("Receita"), DESPESA("Despesa"),CALOTE("Calote"),INVESTIMENTO("Investimento");

	private String descricao;

	TipoLancamento(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
