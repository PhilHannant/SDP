package Tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.IncludeCategories;
import sml.*;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import static org.junit.Assert.*;

/**
 * Created by philhannant on 20/02/2016.
 */
public class TranslatorTest {

    private Machine m;
    private Translator t;
    private Labels labels;
    private ArrayList<Instruction> prog;

    /**
     * Set up.
     */
    @Before
    public void setUp(){
        m = new Machine();
        t = new Translator("/Users/philhannant/IdeaProjects/SDP/CW1/src/testTrans.sml");
        labels = new Labels();
        prog = new ArrayList<>();
        t.readAndTranslate(labels, prog);


    }


    /**
     * Test get class name.
     */
    @Test
    public void testGetClassName() {
        String inOut = t.getClassName("lin");
        LinInstruction li = new LinInstruction("f0", "lin");
        String liString = li.getClass().getName();
        assertEquals(liString, inOut);
    }

    /**
     * Test get constructors add test.
     */
    @Test
    public void testGetConstructorsAddTest(){
        String outCons = t.getCons("add").toString();
        String expectedCons = "public sml.AddInstruction(java.lang.String,int,int,int)";
        assertEquals(expectedCons, outCons);
    }

    /**
     * Test get constructors bnz test.
     */
    @Test
    public void testGetConstructorsBnzTest(){
        String outCons = t.getCons("bnz").toString();
        String expectedCons = "public sml.BnzInstruction(java.lang.String,int,java.lang.String)";
        assertEquals(expectedCons, outCons);
    }

    /**
     * Test get constructors div test.
     */
    @Test
    public void testGetConstructorsDivTest(){
        String outCons = t.getCons("div").toString();
        String expectedCons = "public sml.DivInstruction(java.lang.String,int,int,int)";
        assertEquals(expectedCons, outCons);
    }


    /**
     * Test get constructors lin test.
     */
    @Test
    public void testGetConstructorsLinTest(){
        String outCons = t.getCons("lin").toString();
        String expectedCons = "public sml.LinInstruction(java.lang.String,int,int)";
        assertEquals(expectedCons, outCons);
    }

    /**
     * Test get constructors sub test.
     */
    @Test
    public void testGetConstructorsSubTest(){
        String outCons = t.getCons("sub").toString();
        String expectedCons = "public sml.SubInstruction(java.lang.String,int,int,int)";
        assertEquals(expectedCons, outCons);
    }

    /**
     * Test get constructors mul test.
     */
    @Test
    public void testGetConstructorsMulTest(){
        String outCons = t.getCons("mul").toString();
        String expectedCons = "public sml.MulInstruction(java.lang.String,int,int,int)";
        assertEquals(expectedCons, outCons);
    }

}