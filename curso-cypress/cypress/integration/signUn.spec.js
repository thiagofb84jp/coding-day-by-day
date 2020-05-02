/// <reference types = "cypress"/>

describe(' Sign Up ', () => {
    //Executa uma vez antes do primeiro teste
    before(() => {
        cy.on('uncaught:exception', (err, runnable) => {
            expect(err.message).to.include('something about the error');
            done();
            return false;
        });

        cy.visit('http://a.testaddressbook.com/');
    });

    //Executa antes de cada um dos testes (em ambos os testes serão executados)
    beforeEach(() => {
        cy.reload();
    });

    it(' Sing up with successful ', () => {
        let email = 'hermano04@email.com.br';

        cy.get('[id=sign-in]').click();
        cy.get('[id=sign-in]').should('have.text', 'Sign in');

        cy.get('[data-test=sign-up]').click();
        cy.get('[data-test=sign-up]').should('have.text', 'Sign up');

        cy.get('[id=user_email]').type(email);
        cy.get('[id=user_password]').type('abcd_123');
        cy.get('[data-test=submit]').click();

    });

});