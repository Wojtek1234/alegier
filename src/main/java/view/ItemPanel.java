package view;

import model.entity.Item;

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

    public ItemPanel(Item item){

      this.setLayout(new GridLayout(2,0));
      JPanel  upperPanel=new JPanel(new GridLayout(0,2));
      JLabel imageLabel=new JLabel(item.getImageIcon());
      upperPanel.add(imageLabel);
      upperPanel.add(setupInfoPanel(item));



    }

    private JPanel setupInfoPanel(Item item) {
        JPanel infoPanel=new JPanel(new GridLayout(4,0));
        ownerLabel=new JLabel(item.getAccount().getName())  ;
        infoPanel.add(ownerLabel);
        timeLastLabel=new JLabel(item.getExperiedDate().toString()) ;
        infoPanel.add(timeLastLabel);
        currentPriceLabel=new JLabel(String.valueOf(item.getCurrentPrice()));
        infoPanel.add(currentPriceLabel);
        lastAuctioneerLabel=new JLabel();//ciezko powiedziec co tu dac, jeszcze sie zastanowic jakie pole lub tabele dodac do bazy danych
        infoPanel.add(lastAuctioneerLabel);
        return infoPanel;
    }


}
