package Tests;

import org.junit.Before;
import org.junit.Test;

import sml.Machine;
import sml.MinusInstruction;
import sml.Registers;

import static org.junit.Assert.*;

/**
 * Created by philhannant on 16/02/2016.
 */
public class MinusInstructionTest {

    private MinusInstruction minIns;
    private Machine m;

    @Before
    public void construct() {
        m = new Machine();
        minIns = new MinusInstruction("f0", 5, 2, 3);
        m.setRegisters(new Registers());
        m.getRegisters().setRegister(3, 10);
        m.getRegisters().setRegister(1, 34);
        m.getRegisters().setRegister(2, 9);
    }

    @Test
    public void testExecute(){
        minIns.execute(m);
        assertEquals(34, m.getRegisters().getRegister(1));

    }
}