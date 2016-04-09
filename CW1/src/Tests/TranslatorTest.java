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
    public void testGetClassName() throws Exception {
        String inOut = t.getClassName("lin");
        LinInstruction li = new LinInstruction("f0", "lin");
        String liString = li.getClass().getName();
        assertEquals(liString, inOut);
    }
}