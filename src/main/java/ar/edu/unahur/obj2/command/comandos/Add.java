package ar.edu.unahur.obj2.command.comandos;

import ar.edu.unahur.obj2.command.Programable;

public class Add extends Operable{

    @Override
    public void accion(Programable micro) {
        Integer a = micro.getAcumuladorA();
        Integer b = micro.getAcumuladorB();
        micro.setAcumuladorA(a + b);
        micro.setAcumuladorB(0);

    }

    @Override
    public void undo(Programable micro) {
        // TODO ;
    }

}
