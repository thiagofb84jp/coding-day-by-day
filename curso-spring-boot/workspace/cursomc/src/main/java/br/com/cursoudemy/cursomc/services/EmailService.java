package br.com.cursoudemy.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import br.com.cursoudemy.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage message);
}