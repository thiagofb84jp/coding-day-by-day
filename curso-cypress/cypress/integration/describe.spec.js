//Bibiloteca que faz referência ao Cypress
/// <reference types = "cypress"/>

//Define o caso de teste
it(' A external test... ', () => {

});

//Define uma suíte de testes
describe(' Should group tests... ', () => {
    describe(' Should group more specif tests... ', () => {
        it(' A specific test... ', () => {

        });
    });

    describe(' Should group more specif tests... 2', () => {
        it(' A specific test... 2', () => {

        });
    });

    it(' A internal test... ', () => {

    });
});