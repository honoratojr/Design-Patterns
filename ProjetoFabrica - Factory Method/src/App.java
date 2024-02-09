import java.util.Scanner;

import factory.Carro;
import factory.Fabrica;
import factory.FabricaFiat;
import factory.FabricaVolksWagen;
import factory.Tipo;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Fabrica fabrica = null;
        Carro c = null;
        int escolha = 1;
        if(escolha == 1) {
            fabrica = new FabricaFiat();
            c = fabrica.fabrica(Tipo.ARGO);
        } else if (escolha == 2) {
            fabrica = new FabricaVolksWagen();
            c = fabrica.fabrica(Tipo.FOX);
        }
        
        System.out.println(c);
    }
}
