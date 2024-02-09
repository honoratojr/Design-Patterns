package factory;

public class FabricaVolksWagen implements Fabrica {
    @Override
    public Carro fabrica(Tipo opc) {
        Carro c = null;
        if(opc.equals(Tipo.FOX)) {
            c = new Fox(50000, "Fox Sthefani");
        }else if(opc.equals(Tipo.JETTA)) {
            c = new Jetta(100000, "Jetta GLI");
        }
        return c;
    }
    
}
