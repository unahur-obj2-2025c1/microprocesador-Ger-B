package ar.edu.unahur.obj2.command.comandos;

import ar.edu.unahur.obj2.command.Programable;

public class LodAddr extends Operable{
    private Integer addr;

    public LodAddr(Integer adres){
        this.addr = adres;
    }

    @Override
    public void accion(Programable micro) {
        Integer a = micro.getAddr(addr);
        micro.setAcumuladorA(a);
    }

    @Override
    public void undo(Programable micro) {
        // TODO;
    }

}
