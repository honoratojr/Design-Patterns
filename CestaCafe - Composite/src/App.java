import Composite.Component;
import Composite.Composite;
import Composite.Leaf;

public class App {
    public static void main(String[] args) throws Exception {

        Composite cesta = new Composite();
        Component p1 = new Leaf("Café", 19.34);
        Component p2 = new Leaf("Leite", 7.89);
        Component p3 = new Leaf("Torrada", 11.6);
        Component p4 = new Leaf("Caneca", 21.5);

        //Adicionar produtos
        cesta.adicionar(p1);
        cesta.adicionar(p2);
        cesta.adicionar(p3);
        cesta.adicionar(p4);

        Component p5 = new Leaf("Bombom Cereja", 4.5);
        Component p6 = new Leaf("Bombom Licor", 8.5);

        Composite caixa = new Composite();
        caixa.adicionar(p5);
        caixa.adicionar(p6);

        cesta.adicionar(caixa);

        System.out.println("Total = " + cesta.getPreco());
        System.out.println("Itens: " + cesta);

    }
}
