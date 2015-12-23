import javax.swing.JFrame;


public class FlashCardTest {

    public static void main(String[] args){

        FlashCard frame = new FlashCard();
        frame.setTitle("Test");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.setFront(0, "Kyle");

        frame.setBack(0, "Daniel");

        System.out.print(frame.getFront(0));

        System.out.print(frame.getBack(0));
    }
}
