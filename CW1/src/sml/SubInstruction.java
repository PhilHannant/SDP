package sml;

/**
 * Created by philhannant on 16/02/2016.
 */
public class SubInstruction extends Instruction {

    private int result;
    private int op1;
    private int op2;

    /**
     * Instantiates a new Sub instruction.
     *
     * @param l  the l
     * @param op the op
     */
    public SubInstruction(String l, String op) {
        super(l, op);
    }

    /**
     * Instantiates a new Sub instruction.
     *
     * @param label  the label
     * @param result the result
     * @param op1    the op 1
     * @param op2    the op 2
     */
    public SubInstruction(String label, int result, int op1, int op2){
        super(label, "sub");
        this.result = result;
        this.op1 = op1;
        this.op2 = op2;
    }

    /**
     * Sub execute method
     * @param m
     */
    @Override
    public void execute(Machine m) {
        int value1 = m.getRegisters().getRegister(op1);
        int value2 = m.getRegisters().getRegister(op2);
        m.getRegisters().setRegister(result, value1 - value2);
    }

    /**
     * Generated toString method
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + " " + op1 + " - " + op2 + " to " + result;
    }
}
