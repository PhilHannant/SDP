package sml;

/**
 * Created by philhannant on 20/02/2016.
 */
public class BnzInstruction extends Instruction {

    private int register;
    private String l2;

    public BnzInstruction(String l, String op) {
        super(l, op);
    }

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
}
