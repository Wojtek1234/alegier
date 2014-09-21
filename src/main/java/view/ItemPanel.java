package view;

import info.clearthought.layout.TableLayout;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Wojtek on 2014-09-21.
 */
public abstract class ItemPanel extends JPanel {
    protected ImageIcon itemImage;
    protected JLabel ownerLabel,timeLastLabel,currentPriceLabel,lastAuctioneerLabel;
    protected JTextArea descriptionText;



    //TODO Jako wejscie tutaj trzeba dac do konstruktora pole z bazy danych , czyli pewno to bedzie ItemEntity z itemem bo bez sensu teraz w konstruktorze wszystko tworzyc

    public ItemPanel(){

      this.setLayout(new GridLayout(2,0));
      JPanel  upperPanel=new JPanel(new GridLayout(0,2));
      JLabel imageLabel=new JLabel(new ImageIcon());

      //imagePanel

    }




}
