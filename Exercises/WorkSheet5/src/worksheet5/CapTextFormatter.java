package worksheet5;

/**
 * Created by philhannant on 04/02/2016.
 */
public class CapTextFormatter implements TextFormatter {

    @Override
    public void format(String text) {
        System.out.println(text.toUpperCase());
    }
}

