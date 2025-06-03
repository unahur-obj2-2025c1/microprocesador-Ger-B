package ar.edu.unahur.obj2.command.comandos;

import ar.edu.unahur.obj2.command.Programable;

public abstract class Operable {

    public void execute(Programable micro){
        this.accion(micro);
        micro.incProgramCounter();
    }

    public abstract void accion(Programable micro);

    public abstract void undo(Programable micro);

}
