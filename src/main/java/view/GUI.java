package view;

import javax.swing.*;

/**
 * Created by Wojtek on 2014-09-19.
 */
public class GUI extends JFrame {


    public GUI(){
        setDefaultWindowPropertis();

        final JButton search=new JButton("szukaj");
        final JButton ViewByCategory=new JButton("Pokaz z danej kategorii");







    }

    private void setDefaultWindowPropertis() {
        setVisible(true);
        setSize(600,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
