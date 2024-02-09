package factory;

public class Uno implements Carro {
    private double preco;
    private String modelo;


    public Uno(double preco, String modelo) {
        this.preco = preco;
        this.modelo = modelo;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Uno [preco=" + preco + ", modelo=" + modelo + "]";
    }
}
