package sml;

/**
 * Created by philhannant on 16/02/2016.
 */
public class MulInstruction extends Instruction {

    private int result;
    private int op1;
    private int op2;


    public MulInstruction(String l, String op) {
        super(l, op);
    }

    public MulInstruction(String label, int result, int op1, int op2){
        super(label, "mul");
        this.result = result;
        this.op1 = op1;
        this.op2 = op2;
    }

    @Override
    public void execute(Machine m) {
        int value1 = m.getRegisters().getRegister(op1);
        int value2 = m.getRegisters().getRegister(op2);
        m.getRegisters().setRegister(result, value1 + value2);
    }
}
