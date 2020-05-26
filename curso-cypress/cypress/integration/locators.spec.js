/// <reference types = "cypress"/>

describe(' Work with basic elements ', () => {
    //Executa uma vez antes do primeiro teste
    before(() => {
        cy.visit('https://wcaquino.me/cypress/componentes.html');
    });

    //Executa antes de cada um dos testes (em ambos os testes serão executados)
    beforeEach(() => {
        cy.reload();
    });

    it(' Using JQuery selector ', () => {
        cy.get(':nth-child(1) > :nth-child(3) > [type="button"]').click();
        cy.get("[onClick*='Francisco']").click();
        cy.get("#tabelaUsuarios td:contains('Doutorado'):eq(0) ~ td:eq(3) > input").click();
        cy.get("#tabelaUsuarios tr:contains('Doutorado'):eq(0) td:eq(6) input").click();
    });

    it.only(' Using xpath', () => {
        cy.xpath('//input');
    });

});