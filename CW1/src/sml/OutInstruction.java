package sml;

/**
 * Created by philhannant on 18/02/2016.
 */
public class OutInstruction extends Instruction {

    private int register;
    private int op1;


    public OutInstruction(String l, String op) {
        super(l, op);
    }

    public OutInstruction(String label, int register){
        super(label, "out");
        this.register =register;
    }

    @Override
    public void execute(Machine m) {
        System.out.println(m.getRegisters().getRegister(register));

    }

    @Override
    public String toString(){
        return super.toString() + " to " + register;
    }
}
