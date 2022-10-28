package ListoShirts;

//Declaração da classe Camisa e suas variáveis utilizando private:
class Camisa {
    private String modelo ;
    private double valor  ;
    private int qtd = 0;
    
    public Camisa(String modelo, double valor) {
        this.modelo = modelo;
        this.valor = valor;
    }

    //Declaração dos métodos Get-Set da varivável valor:
    public double getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    //Declaração dos métodos Get-Set da variável qtd:
    public int getQtd() {
        return qtd;
    }
    
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    //Declaração do construtor:
    @Override
    public String toString() {
        return "Camisa [modelo=" + modelo + "]"; //, valor=" + valor + "]";
    }
}