public class App {
    public static void main(String[] args) throws Exception {
        
        CarroPolicia carroPolicia = new CarroPolicia();

        CarroRoubado carroRoubado = new CarroRoubado();

        carroRoubado.addObserver(carroPolicia);

        carroRoubado.frente();
        carroRoubado.direita();
        carroRoubado.frente();
        carroRoubado.esquerda();
        carroRoubado.para();
    }
}
