package modul3_1;

/**
 * Created by Катя on 08.11.2016.
 */
public class Bird {
    private String text;


    public Bird(String text) {
        this.text=text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }

    public void sign(){
        System.out.println(getText());
    }
}
