package ar.edu.unahur.obj2.command.comandos;

import ar.edu.unahur.obj2.command.Programable;

public class Swap extends Operable{

    @Override
    public void accion(Programable micro) {
        Integer a = micro.getAcumuladorA();
        Integer b = micro.getAcumuladorB();
        micro.setAcumuladorA(b);
        micro.setAcumuladorB(a);
    }

    @Override
    public void undo(Programable micro) {
        // TODO 
    }

}
