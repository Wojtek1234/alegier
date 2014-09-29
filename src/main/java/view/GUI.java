package view;


import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by Wojtek on 2014-09-19.
 */
public class GUI extends JFrame {

    private final JButton search = new JButton("szukaj");
    private final JButton viewByCategory = new JButton("Pokaz z danej kategorii");
    private final JButton myItems = new JButton("pokaz moje rzeczy");
    private final JButton addNewItem = new JButton("dodaj nowy przedmiot");
    private JList<String> itemsList;
    private JLabel helloLabel;

   // private TableLayout tableLayout;

    public GUI() {


        setDefaultWindowPropertis();
        helloLabel = new JLabel("Hi ");


    }

    private void setDefaultWindowPropertis() {
        setVisible(true);
        setSize(600, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void createActionForSearch(ActionListener al) {
        search.addActionListener(al);
    }

    public void createActionForShowCategory(ActionListener al) {
        viewByCategory.addActionListener(al);
    }

    public void createActionForMyItems(ActionListener al) {
        myItems.addActionListener(al);
    }

    public void createActionForAddNewItem(ActionListener al) {
        addNewItem.addActionListener(al);
    }


}
