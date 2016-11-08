package modul3_1;

/**
 * Created by Катя on 08.11.2016.
 */
public class BirdMain {
    public static void main(String[] args) {
        Bird colibry = new Bird("");
        System.out.println("Sign_1");
        colibry.setText("I am walking");
        System.out.println(colibry.getText());
        System.out.println("Sign_2");
        colibry.setText("I am flying");
        System.out.println(colibry.getText());
        System.out.println("Sign_3");
        colibry.setText("I am singing");
        System.out.println(colibry.getText());
        System.out.println("Sign_4");
        colibry.setText("I am Bird");
        System.out.println(colibry.getText());
    }
}
