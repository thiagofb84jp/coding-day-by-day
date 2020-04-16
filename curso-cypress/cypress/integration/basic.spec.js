/// <reference types = "cypress"/>

/**
 * Dois comandos para debbugar:
 * - cy.debbug(); -> pausa a execução no ponto exato
 * - cy.pause(); -> pára a execução em um determinado momento
 */

describe(' Cypress basics ', () =>{
    it(' Should visit a page and assert title ', () =>{
        cy.visit('https://wcaquino.me/cypress/componentes.html');
        
        cy.title().should('be.equal', 'Campo de Treinamento');
        cy.title().should('contain', 'Campo');

        cy.title()
            .should('be.equal', 'Campo de Treinamento')
            .and('contain', 'Campo');
    });

    it(' Should find and interact with an element ', () =>{
        cy.visit('https://wcaquino.me/cypress/componentes.html');

        cy.get('#buttonSimple')
            .click()
            .should('have.value', 'Obrigado!');
    });
});