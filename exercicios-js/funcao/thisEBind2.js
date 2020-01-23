/**
 * Pontos Importantes:
 * 1. 'SetInterval()' (função nativa do Javascript) dispara outra função a partir de um intervalo repassado;
 * 2. CRTL + M -> Interrompe a execução / CRTL + N -> Inicia a execução do programa;
 */

function Pessoa(){
    this.idade = 0;

    const self = this;
    setInterval(function(){
        self.idade++; 
        console.log(self.idade);        
    }/*.bind(this)*/, 1000); //A cada 1000 milissegundos, a função será disparada novamente;
}

new Pessoa;