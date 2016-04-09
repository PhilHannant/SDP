package Tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.IncludeCategories;
import sml.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by philhannant on 20/02/2016.
 */
public class TranslatorTest {

    private Machine m;
    private Translator t;
    private Labels labels;
    private ArrayList<Instruction> prog;

    @Before
    public void setUp(){
        m = new Machine();
        t = new Translator("/Users/philhannant/IdeaProjects/SDP/CW1/src/testTrans.sml");
        labels = new Labels();
        prog = new ArrayList<>();
        t.readAndTranslate(labels, prog);


    }


    @Test
    public void testGetInstruction() throws Exception {
//        Instruction inOut = t.getInstruction("f0");
        System.out.println(t.getInstruction("f0"));

        LinInstruction li = new LinInstruction("f0", "lin");
        System.out.println(li.getClass());
        Instruction outIns = new OutInstruction("f0", "lin");
//        System.out.println(inOut.getClass());
//        System.out.println(outIns.getClass());
//        assertEquals(outIns.getClass(), inOut.getClass());
    }
}