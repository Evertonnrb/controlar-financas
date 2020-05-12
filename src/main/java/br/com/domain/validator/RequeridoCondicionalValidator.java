package br.com.domain.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import com.sun.faces.util.MessageFactory;

@FacesValidator("br.com.domain.validator.RequeridoCondicionalValidator")
public class RequeridoCondicionalValidator implements Validator{

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		Boolean ck = (Boolean) component.getAttributes().get("checado");
		
		if(ck != null && ck && value == null) {
			Object label = MessageFactory.getLabel(context, component);
			String descError = "Preenha kkko campo "+ label+" .";
			FacesMessage message = new FacesMessage(
					FacesMessage.SEVERITY_ERROR,
					descError,
					descError
			);
			throw new ValidatorException(message);
					
		}
	}

}
