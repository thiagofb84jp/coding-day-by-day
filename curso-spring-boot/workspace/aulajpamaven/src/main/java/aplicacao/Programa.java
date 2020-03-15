package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.github.javafaker.Faker;

import dominio.Pessoa;

public class Programa {
	
	/**
	 * Pontos Importantes:
	 * 1. O JPA só remove uma entidade que esteja monitorada. Caso tente remover uma instância que está destacada, o sistema
	 * 		apresentará uma mensagem de falha;
	 * 2. Objeto monitorado pode ser um objeto que acabou de ser inserido ou que foi buscado no banco de dados e ainda não foi
	 * 		fechado o EntityManager;
	 * 
	 */
	
	public static void main(String[] args) {
		persistirDadosNoBanco();
	}
	
	static void persistirDadosNoBanco() {
		Pessoa p1 = new Pessoa(null, new Faker().name().fullName(), new Faker().internet().emailAddress());
		Pessoa p2 = new Pessoa(null, new Faker().name().fullName(), new Faker().internet().emailAddress());
		Pessoa p3 = new Pessoa(null, new Faker().name().fullName(), new Faker().internet().emailAddress());
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		System.out.println("Done!");
		
		em.close();
		emf.close();
	}
	
	static void pesquisarDadosNoBanco() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p);
		System.out.println("Done!");
		
		em.close();
		emf.close();
	}
	
	static void removerRegistroNoBancoDeDados() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = em.find(Pessoa.class, 2);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println("Done!");
		em.close();
		emf.close();
	}
}