package br.com.domain.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.domain.model.Pessoa;
import br.com.domain.service.GestaoPessoas;

@FacesConverter(forClass = Pessoa.class)
//@FacesConverter("br.com.domain.bean.PessoaConverter")
public class PessoaConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Pessoa retorno = null;
		if(value!=null) {
			GestaoPessoas gestaoPessoas = new GestaoPessoas();
				retorno = gestaoPessoas.buscarPorCodigo(new Integer(value));
		}
		return retorno;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value != null) {
			return ((Pessoa)value).getCodigo().toString();
		}
			return null;
	}

}
