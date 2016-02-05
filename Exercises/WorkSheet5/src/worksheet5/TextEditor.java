package worksheet5;

/**
 * Created by philhannant on 04/02/2016.
 */
public class TextEditor {

   private final TextFormatter textFormatter;


   public TextEditor(TextFormatter textFormatter){
       this.textFormatter = textFormatter;
   }


   public void publishText(String text){
       textFormatter.format(text);
   }
}
