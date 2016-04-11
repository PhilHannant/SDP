package sml;

/**
 * Created by philhannant on 18/02/2016.
 */
public class OutInstruction extends Instruction {

    private int register;
    private int op1;


    /**
     * Instantiates a new Out instruction.
     *
     * @param l  the l
     * @param op the op
     */
    public OutInstruction(String l, String op) {
        super(l, op);
    }

    /**
     * Instantiates a new Out instruction.
     *
     * @param label    the label
     * @param register the register
     */
    public OutInstruction(String label, int register){
        super(label, "out");
        this.register =register;
    }

    @Override
    public void execute(Machine m) {
        System.out.println("Out = " + m.getRegisters().getRegister(register));

    }

    @Override
    public String toString(){
        return super.toString() + " to " + register;
    }
}
