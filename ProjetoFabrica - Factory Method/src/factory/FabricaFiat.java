package factory;

public class FabricaFiat implements Fabrica {
    @Override
    public Carro fabrica(Tipo opc) {
        Carro c = null;
        if(opc.equals(Tipo.UNO)) {
            c = new Uno(40000, "Uno Mille");
        }else if(opc.equals(Tipo.ARGO)) {
            c = new Argo(82000, "Argo");
        }
        return c;
    }
}
