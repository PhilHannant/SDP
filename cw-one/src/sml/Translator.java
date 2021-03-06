package sml;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * The type Translator.
 */
/*
 * The translator of a <b>S</b><b>M</b>al<b>L</b> program.
 */
public class Translator {

    private static final String PATH = "";
    // word + line is the part of the current line that's not yet processed
    // word has no whitespace
    // If word and line are not empty, line begins with whitespace
    private String line = "";
    private Labels labels; // The labels of the program being translated
    private ArrayList<Instruction> program; // The program to be created
    private String fileName; // source file of SML code

    /**
     * Instantiates a new Translator.
     *
     * @param fileName the file name
     */
    public Translator(String fileName) {
        this.fileName = PATH + fileName;
    }

    /**
     * Read and translate boolean.
     *
     * @param lab  the lab
     * @param prog the prog
     * @return the boolean
     */
// translate the small program in the file into lab (the labels) and
    // prog (the program)
    // return "no errors were detected"
    public boolean readAndTranslate(Labels lab, ArrayList<Instruction> prog) {

        try (Scanner sc = new Scanner(new File(fileName))) {
            // Scanner attached to the file chosen by the user
            labels = lab;
            labels.reset();
            program = prog;
            program.clear();

            try {
                line = sc.nextLine();
            } catch (NoSuchElementException ioE) {
                return false;
            }

            // Each iteration processes line and reads the next line into line
            while (line != null) {
                // Store the label in label
                String label = scan();

                if (label.length() > 0) {
                    Instruction ins = getInstruction(label);
                    if (ins != null) {
                        System.out.println();
                        labels.addLabel(label);
                        program.add(ins);
                    }
                }

                try {
                    line = sc.nextLine();
                } catch (NoSuchElementException ioE) {
                    return false;
                }
            }
        } catch (IOException ioE) {
            System.out.println("File: IO error " + ioE.getMessage());
            System.exit(-1);
            return false;
        }
        return true;
    }

    /**
     * Gets instruction.
     *
     * @param label the label
     * @return the instruction
     */
// line should consist of an MML instruction, with its label already
    // removed. Translate line into an instruction with label label
    // and return the instruction
    public Instruction getInstruction(String label) {
        if (line.equals(""))
            return null;
        //Reflection added below
        String ins = scan();
        try {
            Constructor<?> cons = getCons(ins);
            Class[] paraTypes = cons.getParameterTypes();
            Object[] paras = new Object[paraTypes.length];

            paras[0] = label;
            for(int i = 1; i < paraTypes.length; i++) {
                if (paraTypes[i].toString().equals("int")) {
                    paras[i] = scanInt();
                } else {
                    paras[i] = scan();
                }

            }

            return (Instruction)cons.newInstance(paras);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        /*int s1; // Possible operands of the instruction
        int s2;
        int r;
        int x;
        String l2;

        if (line.equals(""))
            return null;

        String ins = scan();
        switch (ins) {
            case "add":
                r = scanInt();
                s1 = scanInt();
                s2 = scanInt();
                return new AddInstruction(label, r, s1, s2);
            case "sub":
                r = scanInt();
                s1 = scanInt();
                s2 = scanInt();
                return new SubInstruction(label, r, s1, s2);
            case "mul":
                r = scanInt();
                s1 = scanInt();
                s2 = scanInt();
                return new MulInstruction(label, r, s1, s2);
            case "div":
                r = scanInt();
                s1 = scanInt();
                s2 = scanInt();
                return new DivInstruction(label, r, s1, s2);
            case "out":
                s1 = scanInt();
                return new OutInstruction(label, s1);
            case "lin":
                r = scanInt();
                s1 = scanInt();
                return new LinInstruction(label, r, s1);
            case "bnz":
                s1 = scanInt();
                l2 = scan();
                return new BnzInstruction(label, s1, l2);

        }*/

        // You will have to write code here for the other instructions.

        return null;
    }

    /*
     * Return the first word of line and remove it from line. If there is no
     * word, return ""
     */
    private String scan() {
        line = line.trim();
        if (line.length() == 0)
            return "";

        int i = 0;
        while (i < line.length() && line.charAt(i) != ' ' && line.charAt(i) != '\t') {
            i = i + 1;
        }
        String word = line.substring(0, i);
        line = line.substring(i);
        return word;
    }

    // Return the first word of line as an integer. If there is
    // any error, return the maximum int
    private int scanInt() {
        String word = scan();
        if (word.length() == 0) {
            System.out.println("max! " + Integer.MAX_VALUE);
            return Integer.MAX_VALUE;
        }

        try {
            return Integer.parseInt(word);
        } catch (NumberFormatException e) {
            return Integer.MAX_VALUE;
        }
    }

    /**
     * Get class name string.
     *
     * @param ins the ins
     * @return the string
     */
    //Returns string representing the class to be instantiated
    public String getClassName(String ins){//Made public so it's possible to test
        String returnIns = "sml." + ins.toUpperCase().charAt(0) + ins.substring(1) + "Instruction";
        return returnIns;
    }

    /**
     * Get cons constructor.
     *
     * @param ins the ins
     * @return the constructor
     */
    //returns the contructors, assumes it will always be the 2nd constructor.
    public Constructor<?> getCons(String ins){
        try {
            Constructor<?>[] publicConstructors = Class.forName(getClassName(ins)).getConstructors();
            return publicConstructors[1];
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }

}