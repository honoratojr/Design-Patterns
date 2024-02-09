package factory;

public class Jetta implements Carro {
    private double preco;
    private String modelo;


    public Jetta(double preco, String modelo) {
        this.preco = preco;
        this.modelo = modelo;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Jetta [preco=" + preco + ", modelo=" + modelo + "]";
    }
    
}
