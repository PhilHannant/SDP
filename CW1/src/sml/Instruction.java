package sml;

/**
 * This class is the superclass of the classes for machine instructions
 *
 * @author Phil Hannant
 */
public abstract class Instruction {
    /**
     * The Label.
     */
    protected String label;
    /**
     * The Opcode.
     */
    protected String opcode;

    // Constructor: an instruction with label l and opcode op
    // (op must be an operation of the language)

    /**
     * Instantiates a new Instruction.
     *
     * @param l  the l
     * @param op the op
     */
    public Instruction(String l, String op) {
        this.label = l;
        this.opcode = op;
    }

    // = the representation "label: opcode" of this Instruction

    @Override
    public String toString() {
        return label + ": " + opcode;
    }

    // Execute this instruction on machine m.

    /**
     * Execute.
     *
     * @param m the m
     */
    public abstract void execute(Machine m);
}
