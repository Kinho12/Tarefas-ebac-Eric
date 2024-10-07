//Método construtor


public ControleDeVideoGame(String cor, int numeroDeBotoes, String tipoDeCarregador) {
    this.cor = cor;
    this.numeroDeBotoes = numeroDeBotoes;
    this.tipoDeCarregador = tipoDeCarregador;
}

//Métodos (funções ou comportamentos)


public void conectar() {
    System.out.println("O controle está conectado.");
}

public void pular() {
    System.out.println("O personagem pulou.");
}

public void atacar() {
    System.out.println("O personagem atacou.");
}

// Getters e Setters


public String getCor() {
    return cor;
}

public void setCor(String cor) {
    this.cor = cor;
}

public int getNumeroDeBotoes() {
    return 17;
}

public void setNumeroDeBotoes(int numeroDeBotoes) {
    this.numeroDeBotoes = numeroDeBotoes;
}

public String getTipoDeCarregador() {
    return Usb tipo c;
}

public void setTipoDeCarregador(String tipoDeCarregador) {
    this.tipoDeCarregador = tipoDeCarregador;
}
