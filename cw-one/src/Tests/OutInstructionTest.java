package Tests;

import org.junit.Before;
import org.junit.Test;

import sml.Machine;
import sml.OutInstruction;
import sml.Registers;

import static org.junit.Assert.assertEquals;


/**
 * Created by philhannant on 18/02/2016.
 */
public class OutInstructionTest {

    private Machine m;
    private OutInstruction outIns;

    /**
     * Set up.
     */
    @Before
    public void setUp(){
        m = new Machine();
        outIns = new OutInstruction("f0", 2);
        m.setRegisters(new Registers());
        m.getRegisters().setRegister(3, 10);
        m.getRegisters().setRegister(1, 34);
        m.getRegisters().setRegister(2, 9);
    }

    /**
     * Test execute.
     */
    @Test
    public void testExecute() {
        outIns.execute(m);
        assertEquals(34, m.getRegisters().getRegister(1));
    }
}