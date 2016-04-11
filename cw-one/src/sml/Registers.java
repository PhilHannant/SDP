package sml;

/**
 * This class ....
 * <p>
 * An instance contains 32 registers and methods to access and change them
 *
 * @author someone
 */
public class Registers {

    private final static int NUMBEROFREGISTERS = 32;
    private int registers[];

    // Constructor: an instance whose registers are set to 0

    {
        registers = new int[NUMBEROFREGISTERS];
    }

    /**
     * Instantiates a new Registers.
     */
    public Registers() {
        for (int i = 0; i != registers.length; i++) {
            registers[i] = 0;
        }
    }

    // Set register i to v.
    // Precondition: 0 <= i <= NUMBEROFREGISTERS

    /**
     * Sets register.
     *
     * @param i the
     * @param v the v
     */
    public void setRegister(int i, int v) {
        registers[i] = v;
    }

    /**
     * Gets register.
     *
     * @param i the
     * @return the register
     */
    public int getRegister(int i) {
        return registers[i];
    }

    /**
     * Get registers int [ ].
     *
     * @return the int [ ]
     */
    public int[] getRegisters() {
        return this.registers;
    }

    /**
     * Sets registers.
     *
     * @param registers the registers
     */
    public void setRegisters(int[] registers) {
        this.registers = registers;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Registers)) return false;
        final Registers other = (Registers) o;
        if (!other.canEqual((Object) this)) return false;
        if (!java.util.Arrays.equals(this.registers, other.registers)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + java.util.Arrays.hashCode(this.registers);
        return result;
    }

    /**
     * Can equal boolean.
     *
     * @param other the other
     * @return the boolean
     */
    protected boolean canEqual(Object other) {
        return other instanceof Registers;
    }

    @Override
    public String toString() {
        return "sml.Registers(registers=" + java.util.Arrays.toString(this.registers) + ")";
    }
}