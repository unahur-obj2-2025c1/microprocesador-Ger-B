package ar.edu.unahur.obj2.command;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.command.comandos.Operable;

public class Microprocesador implements Programable{
    private Integer acumA = 0;
    private Integer acumB = 0;
    private Integer pC = 0;
    private List<Integer> datos = new ArrayList<>();

    @Override
    public void run(List<Operable> operaciones) {
        operaciones.forEach(op -> op.execute(this));
    }

    @Override
    public void incProgramCounter() {
        pC += 1;
    }

    @Override
    public Integer getProgramCounter() {
        return pC;
    }

    @Override
    public void setAcumuladorA(Integer value) {
        acumA = value;
    }

    @Override
    public Integer getAcumuladorA() {
        return acumA;
    }

    @Override
    public void setAcumuladorB(Integer value) {
        acumB = value;
    }

    @Override
    public Integer getAcumuladorB() {
        return acumB;
    }

    @Override
    public void copyFrom(Programable programable) {
        //TODO
    }

    // @Override
    // public Programable copy() {
    //     return ;// TODO 
    // }

    @Override
    public void reset() {
        pC = 0;
        acumA = 0;
        acumB = 0;
    }

    @Override
    public void setAddr(Integer addr, Integer val) {
        if(addr>=0 && addr<1024){
            datos.add(addr, val);
        }
    }

    @Override
    public Integer getAddr(Integer addr) {
        if(addr>=0 && addr<1024){
            return datos.get(addr);
        }else{
            return 0;
        }
    }

}