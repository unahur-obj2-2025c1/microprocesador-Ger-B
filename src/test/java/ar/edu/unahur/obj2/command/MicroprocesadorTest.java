package ar.edu.unahur.obj2.command;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.command.comandos.Add;
import ar.edu.unahur.obj2.command.comandos.LodAddr;
import ar.edu.unahur.obj2.command.comandos.LodvVal;
import ar.edu.unahur.obj2.command.comandos.Nop;
import ar.edu.unahur.obj2.command.comandos.Operable;
import ar.edu.unahur.obj2.command.comandos.StrAddr;
import ar.edu.unahur.obj2.command.comandos.Swap;

public class MicroprocesadorTest {
    Microprocesador m1 = new Microprocesador();
    Operable nop = new Nop();
    Operable swap = new Swap();
    Operable add = new Add();

    @Test
    void dadoUnProgramaElProgramCounterSeComportaComoDeberia() {
        List<Operable> programa1 = new ArrayList<>(List.of(nop, nop, nop));
        m1.run(programa1);
        assertEquals(3, m1.getProgramCounter());
    }

    @Test
    void dadoUnProgramaDeSumaElEstadoDelMicroprocesadorEsElEsperado(){
        Operable lodv20 = new LodvVal(20);
        Operable lodv17 = new LodvVal(17);
        List<Operable> programa2 = new ArrayList<>(List.of(lodv20, swap, lodv17, add));
        m1.run(programa2);
        assertEquals(4, m1.getProgramCounter());
        assertEquals(37, m1.getAcumuladorA());
        assertEquals(0, m1.getAcumuladorB());
    }
    
    @Test
    void dadoUnProgramaDeSumasElEstadoDelMicroprocesadorEsElEsperado(){
        Operable lodv2 = new LodvVal(2);
        Operable lodv8 = new LodvVal(8);
        Operable lodv5 = new LodvVal(5);
        Operable lod0 = new LodAddr(0);
        Operable str0 = new StrAddr(0);
        List<Operable> programa2 = new ArrayList<>(List.of(lodv2, str0, lodv8, swap, lodv5, add, swap, lod0, add));
        m1.run(programa2);
        assertEquals(9, m1.getProgramCounter());
        assertEquals(15, m1.getAcumuladorA());
        assertEquals(0, m1.getAcumuladorB());
    }
}