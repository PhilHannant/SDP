package Tests;

import org.junit.Before;
import sml.AddInstruction;
import sml.Machine;
import sml.Registers;


import static org.junit.Assert.*;

/**
 * Created by philhannant on 16/02/2016.
 */
public class AddInstructionTest {

    @Before
    public void construct() {
        Machine m = new Machine();
        AddInstruction minIns = new AddInstruction("f0", 5, 2, 3);
        m.setRegisters(new Registers());
        m.getRegisters().setRegister(3, 10);
        m.getRegisters().setRegister(1, 34);
        m.getRegisters().setRegister(2, 9);
    }

}