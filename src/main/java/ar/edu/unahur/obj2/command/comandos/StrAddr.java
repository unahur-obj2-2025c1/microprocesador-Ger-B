package ar.edu.unahur.obj2.command.comandos;

import ar.edu.unahur.obj2.command.Programable;

public class StrAddr extends Operable {
    private Integer adres;

    public StrAddr(Integer adres){
        this.adres = adres;
    }

    @Override
    public void accion(Programable micro) {
        Integer val = micro.getAcumuladorA();
        micro.setAddr(adres, val);
    }

    @Override
    public void undo(Programable micro) {
        // TODO;
    }

}
