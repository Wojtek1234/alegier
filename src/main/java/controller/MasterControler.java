package controller;

import model.AccountProperties;
import view.GUI;
import view.LoginDialog;

/**
 * Created by Wojtek on 2014-09-19.
 */
public class MasterControler {
    private final GUI gui;

    public MasterControler(){
        gui=new GUI();
        AccountProperties accountProperties=getAccountProps( gui);

        //TODO tutaj sprawdzic czy istenieje w bazie , jezeli tak to dalej, jezeli nie to zaproponowac anonymusa albo od poczatku







    }

    private AccountProperties getAccountProps(GUI gui) {
        final LoginDialog loginDialog=new LoginDialog(gui,"Login service");
        loginDialog.setModal(true);
        return loginDialog.getAccountProps();
    }
}
