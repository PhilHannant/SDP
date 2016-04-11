package sml;

/**
 * Created by philhannant on 20/02/2016.
 */
public class BnzInstruction extends Instruction {

    private int register;
    private String l2;

    /**
     * Instantiates a new Bnz instruction.
     *
     * @param l  the l
     * @param op the op
     */
    public BnzInstruction(String l, String op) {
        super(l, op);
    }

    /**
     * Instantiates a new Bnz instruction.
     *
     * @param label    the label
     * @param register the register
     * @param l2       the l 2
     */
    public BnzInstruction(String label, int register, String l2){
        super(label, "bnz");
        this.register = register;
        this.l2 = l2;
    }

    @Override
    public void execute(Machine m) {
        if(m.getRegisters().getRegister(register)!= 0){
            m.setPc(m.getLabels().indexOf(l2));
        }

    }

    /**
     * Generated toString method
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + " " + l2 +  " to " + register;
    }
}
