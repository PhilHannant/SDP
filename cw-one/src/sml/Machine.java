package sml;

import java.util.ArrayList;

/**
 * The type Machine.
 */
/*
 * The machine language interpreter
 */
public class Machine {
    // The labels in the SML program, in the order in which
    // they appear (are defined) in the program

    private Labels labels;

    // The SML program, consisting of prog.size() instructions, each
    // of class Instruction (or one of its subclasses)
    private ArrayList<Instruction> prog;

    // The registers of the SML machine
    private Registers registers;

    // The program counter; it contains the index (in prog) of
    // the next instruction to be executed.

    private int pc;

    {
        labels = new Labels();
        prog = new ArrayList<>();
        pc = 0;
    }

    /**
     * Instantiates a new Machine.
     */
    public Machine() {
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        String filename = "/Users/philhannant/IdeaProjects/SDP/CW1/src/test2.sml";


        Machine m = new Machine();
        Translator t = new Translator(filename);
        t.readAndTranslate(m.getLabels(), m.getProg());

        System.out.println("Here is the program; it has " + m.getProg().size() + " instructions.");
        System.out.println(m);

        System.out.println("Beginning program execution.");
        m.execute();
        System.out.println("Ending program execution.");

        System.out.println("Values of registers at program termination:");
        System.out.println(m.getRegisters() + ".");
    }

    // Print the program

    @Override
    public String toString() {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i != getProg().size(); i++)
            s.append(getProg().get(i) + "\n");
        return s.toString();
    }

    // Execute the program in prog, beginning at instruction 0.
    // Precondition: the program and its labels have been store properly.

    /**
     * Execute.
     */
    public void execute() {
        setPc(0);
        setRegisters(new Registers());
        while (getPc() < getProg().size()) {
            Instruction ins = getProg().get(getPc());
            setPc(getPc() + 1);
            ins.execute(this);
        }
    }

    /**
     * Gets labels.
     *
     * @return the labels
     */
    public Labels getLabels() {
        return this.labels;
    }

    /**
     * Gets prog.
     *
     * @return the prog
     */
    public ArrayList<Instruction> getProg() {
        return this.prog;
    }

    /**
     * Gets registers.
     *
     * @return the registers
     */
    public Registers getRegisters() {
        return this.registers;
    }

    /**
     * Gets pc.
     *
     * @return the pc
     */
    public int getPc() {
        return this.pc;
    }

    /**
     * Sets labels.
     *
     * @param labels the labels
     */
    public void setLabels(Labels labels) {
        this.labels = labels;
    }

    /**
     * Sets prog.
     *
     * @param prog the prog
     */
    public void setProg(ArrayList<Instruction> prog) {
        this.prog = prog;
    }

    /**
     * Sets registers.
     *
     * @param registers the registers
     */
    public void setRegisters(Registers registers) {
        this.registers = registers;
    }

    /**
     * Sets pc.
     *
     * @param pc the pc
     */
    public void setPc(int pc) {
        this.pc = pc;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Machine)) return false;
        final Machine other = (Machine) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$labels = this.labels;
        final Object other$labels = other.labels;
        if (this$labels == null ? other$labels != null : !this$labels.equals(other$labels)) return false;
        final Object this$prog = this.prog;
        final Object other$prog = other.prog;
        if (this$prog == null ? other$prog != null : !this$prog.equals(other$prog)) return false;
        final Object this$registers = this.registers;
        final Object other$registers = other.registers;
        if (this$registers == null ? other$registers != null : !this$registers.equals(other$registers)) return false;
        if (this.pc != other.pc) return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $labels = this.labels;
        result = result * PRIME + ($labels == null ? 0 : $labels.hashCode());
        final Object $prog = this.prog;
        result = result * PRIME + ($prog == null ? 0 : $prog.hashCode());
        final Object $registers = this.registers;
        result = result * PRIME + ($registers == null ? 0 : $registers.hashCode());
        result = result * PRIME + this.pc;
        return result;
    }

    /**
     * Can equal boolean.
     *
     * @param other the other
     * @return the boolean
     */
    protected boolean canEqual(Object other) {
        return other instanceof Machine;
    }
}