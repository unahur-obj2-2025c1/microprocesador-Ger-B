package ar.edu.unahur.obj2.command.comandos;

import ar.edu.unahur.obj2.command.Programable;

public class LodvVal extends Operable {

    private Integer val;

    public LodvVal(Integer valor){
        this.val = valor;
    }

    @Override
    public void accion(Programable micro) {
        micro.setAcumuladorA(val);
    }

    @Override
    public void undo(Programable micro) {
        // TODO 
    }
}
