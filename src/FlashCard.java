import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class FlashCard extends JFrame{

    private ArrayList<String> front = new ArrayList<String>();
    private ArrayList<String> back = new ArrayList<String>();

    public JTextField cardDisplay = new JTextField();// displays the cards text
    public JTextField cardText = new JTextField();// field to enter card text

    private JButton addCard = new JButton("New Card");
    private JButton  deleteCard = new JButton("Delete Card");
    private JButton  nextCard = new JButton("Next Card");
    private JButton previousCard = new JButton("Previous Card");


    int cardPlaceHolder = 0;


    public FlashCard(){

        JPanel controls = new JPanel();
        controls.setLayout(new GridLayout(4, 1));


        controls.add(addCard);
        controls.add(deleteCard);
        controls.add(nextCard);
        controls.add(previousCard);

        JPanel controlPanel = new JPanel(new BorderLayout());


        controlPanel.add(cardText, BorderLayout.NORTH);
        controlPanel.add(controls, BorderLayout.SOUTH);


        controlPanel.add(cardDisplay, BorderLayout.CENTER);


        add(controlPanel);

        addCard.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                newCard();
                System.out.print(getFront(cardPlaceHolder));
                System.out.print(cardPlaceHolder);
                cardDisplay.setText(getFront(cardPlaceHolder));
                cardPlaceHolder++;

            }
        });

        deleteCard.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                deleteCard();
                cardPlaceHolder--;

            }
        });

        nextCard.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

            }
        });

        previousCard.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

            }
        });

    }

    public void cardListener(ActionEvent e){
        //methods
    }

    public void newCard(){
        String temp = cardText.getText();
        setFront(cardPlaceHolder, temp);

    }

    public void deleteCard(){
        setFront(cardPlaceHolder, " ");
    }

    public String getFront(int i) {
        return front.get(i);

    }

    public void setFront(/*ArrayList<String> front,*/ int i, String s) {
        this.front.add(i, s);
    }

    public String getBack(int i) {
        return back.get(i);
    }

    public void setBack(/*ArrayList<String> back,*/ int i, String s) {
        this.back.add(i, s);
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
