package controller;

import model.AccountProperties;
import sun.rmi.runtime.Log;
import view.GUI;
import view.LoginDialog;

/**
 * Created by Wojtek on 2014-09-19.
 */
public class MasterControler {
    private final GUI gui;
    public MasterControler(){

        AccountProperties accountProperties=getAccountProps();

        //TODO tutaj sprawdzic czy istenieje w bazie , jezeli tak to dalej, jezeli nie to zaproponowac anonymusa albo od poczatku


        gui=new GUI();




    }

    private AccountProperties getAccountProps() {
        final LoginDialog loginDialog=new LoginDialog();
        loginDialog.setModal(true);
        return loginDialog.getAccountProps();
    }
}
