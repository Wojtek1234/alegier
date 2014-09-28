package controller;

import model.AccountProperties;
import model.entity.Item;
import model.services.AlegierServiceBean;
import model.services.ItemService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import view.GUI;
import view.LoginDialog;

import java.util.List;

/**
 * Created by Wojtek on 2014-09-19.
 */
public class MasterControler {
    private final GUI gui;

    public MasterControler(){
        gui=new GUI();
        ApplicationContext context = new ClassPathXmlApplicationContext( "beanConfiguration.xml" );
        AlegierServiceBean alegierServiceBean = (AlegierServiceBean)context.getBean( "alegierServiceBean" );

        final ItemService itemService= alegierServiceBean.getBookService();
        List lista=itemService.getAll();

        for(Item it:lista){
           Item ite=(Item)it;
           System.out.println(ite.getName());
        }




    }

    private AccountProperties getAccountProps(GUI gui) {
        final LoginDialog loginDialog=new LoginDialog(gui,"Login service");
        loginDialog.setModal(true);
        return loginDialog.getAccountProps();
    }
}
