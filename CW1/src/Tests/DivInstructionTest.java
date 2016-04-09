package Tests;

import org.junit.Before;
import org.junit.Test;
import sml.Machine;
import sml.DivInstruction;
import sml.Registers;

import static org.junit.Assert.*;

/**
 * Created by philhannant on 16/02/2016.
 */
public class DivInstructionTest {


    private DivInstruction divIns;
    private Machine m;

    /**
     * Construct.
     */
    @Before
    public void construct() {
        m = new Machine();
        divIns = new DivInstruction("f0", 5, 2, 3);
        m.setRegisters(new Registers());
        m.getRegisters().setRegister(3, 10);
        m.getRegisters().setRegister(1, 34);
        m.getRegisters().setRegister(2, 9);
    }

    /**
     * Test execute.
     *
     * @throws Exception the exception
     */
    @Test
    public void testExecute() throws Exception {
        divIns.execute(m);
        assertEquals(9, m.getRegisters().getRegister(2));

    }
}