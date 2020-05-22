package br.com.cursoudemy.cursomc.services.validations;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.cursoudemy.cursomc.domain.Cliente;
import br.com.cursoudemy.cursomc.dto.ClienteNewDTO;
import br.com.cursoudemy.cursomc.enums.TipoCliente;
import br.com.cursoudemy.cursomc.repositories.ClienteRepository;
import br.com.cursoudemy.cursomc.resources.exception.FieldMessage;
import br.com.cursoudemy.cursomc.services.validations.utils.BR;

public class ClienteInsertValidator implements ConstraintValidator<ClienteInsert, ClienteNewDTO> {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	
	@Override
	public void initialize(ClienteInsert ann) {
	}

	@Override
	public boolean isValid(ClienteNewDTO objDto, ConstraintValidatorContext context) {
		List<FieldMessage> list = new ArrayList<>();
		
		if (objDto.getTipoCliente().equals(TipoCliente.PESSOAFISICA.getCod()) && !BR.isValidSsn(objDto.getNumeroDocumento())) {
			list.add(new FieldMessage("numeroDocumento", "CPF Inválido"));
		}
		
		if (objDto.getTipoCliente().equals(TipoCliente.PESSOAJURIDICA.getCod()) && !BR.isValidTfn(objDto.getNumeroDocumento())) {
			list.add(new FieldMessage("numeroDocumento", "CNPJ Inválido"));
		}
		
		Cliente aux = clienteRepository.findByEmail(objDto.getEmail());
		
		if (aux != null) {
			list.add(new FieldMessage("email", "E-mail já cadastrado"));
		}
		
		// inclua os testes aqui, inserindo erros na lista
		for (FieldMessage e : list) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(e.getMessage()).addPropertyNode(e.getFieldName())
					.addConstraintViolation();
		}
		return list.isEmpty();
	}
}