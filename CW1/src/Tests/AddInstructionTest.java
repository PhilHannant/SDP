package Tests;

import org.junit.Before;
import org.junit.Test;
import sml.AddInstruction;
import sml.Machine;
import sml.Registers;


import static org.junit.Assert.*;

/**
 * Created by philhannant on 16/02/2016.
 */
public class AddInstructionTest {

    private AddInstruction addIns;
    private Machine m;

    @Before
    public void construct() {
        Machine m = new Machine();
        addIns = new AddInstruction("f0", 5, 2, 3);
        m.setRegisters(new Registers());
        m.getRegisters().setRegister(3, 10);
        m.getRegisters().setRegister(1, 34);
        m.getRegisters().setRegister(2, 9);
    }

    @Test
    public void testExecute(){
        addIns.execute(m);
    }

}