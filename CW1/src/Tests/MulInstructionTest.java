package Tests;

import org.junit.Before;
import sml.MulInstruction;
import sml.Machine;
import sml.Registers;

import static org.junit.Assert.*;

/**
 * Created by philhannant on 16/02/2016.
 */
public class MulInstructionTest {


    private MulInstruction mulIns;
    private Machine m;

    @Before
    public void construct() {
        m = new Machine();
        mulIns = new MulInstruction("f0", 5, 2, 3);
        m.setRegisters(new Registers());
        m.getRegisters().setRegister(3, 10);
        m.getRegisters().setRegister(1, 34);
        m.getRegisters().setRegister(2, 9);
    }
}