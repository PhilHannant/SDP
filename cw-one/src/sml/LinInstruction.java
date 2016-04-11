package sml;

/**
 * This class ....
 *
 * @author Phil Hannant
 */
public class LinInstruction extends Instruction {
    private int register;
    private int value;

    /**
     * Instantiates a new Lin instruction.
     *
     * @param label  the label
     * @param opcode the opcode
     */
    public LinInstruction(String label, String opcode) {
        super(label, opcode);
    }

    /**
     * Instantiates a new Lin instruction.
     *
     * @param label    the label
     * @param register the register
     * @param value    the value
     */
    public LinInstruction(String label, int register, int value) {
        super(label, "lin");
        this.register = register;
        this.value = value;

    }
    /**
     * Lin execute method
     * @param m
     */
    @Override
    public void execute(Machine m) {
        m.getRegisters().setRegister(register, value);
    }

    /**
     * Generated toString method
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + " register " + register + " value is " + value;
    }
}
