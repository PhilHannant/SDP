package sml;

/**
 * Created by philhannant on 16/02/2016.
 */
public class DivInstruction extends Instruction {

    private int result;
    private int op1;
    private int op2;


    public DivInstruction(String l, String op) {
        super(l, op);
    }

    public DivInstruction(String label, int result, int op1, int op2){
        super(label, "div");
        this.result = result;
        this.op1 = op1;
        this.op2 = op2;
    }
    @Override
    public void execute(Machine m) {

    }
}
