package br.com.domain.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import br.com.domain.model.Lancamento;
import br.com.domain.model.Pessoa;
import br.com.domain.model.enuns.TipoLancamento;
import br.com.domain.service.GestaoPessoas;

@ManagedBean
@ViewScoped
public class CadastroLancamentoBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	private Lancamento lancamento = new Lancamento();
	
	@PostConstruct
	public void init() {
		GestaoPessoas gestaoPessoas = new GestaoPessoas();
		pessoas = gestaoPessoas.listarTodos();
	}
	
	public TipoLancamento[] getTipos() {
		return TipoLancamento.values();
	}
	
	public Lancamento getLancamento() {
		return lancamento;
	}
 	
	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	
	public void cadastrar() {
		System.out.println(lancamento.getPessoa().getNome());
		System.out.println(lancamento.getTipoLancamento().getDescricao());
		System.out.println(lancamento.getDescricao());
		System.out.println(lancamento.getDataVencimento());
		System.out.println(lancamento.getValor());
		this.lancamento = new Lancamento();
		String msg = "Cadastro realizado com sucesso";
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage(FacesMessage.SEVERITY_INFO,msg,msg)
		);
	}
	
	public void lacamanetoPagoModificado(ValueChangeEvent event) {
		this.lancamento.setPago((Boolean) event.getNewValue());
		this.lancamento.setDataPagamento( null);
		FacesContext.getCurrentInstance().renderResponse();
	}
	
}
