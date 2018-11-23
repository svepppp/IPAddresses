package controller;

import model.Diapason;
import view.*;

public class Controller {
    private Input input;
    private Output output;

    public Controller() {
    }

    public Controller(Input input, Output output) {
        this.input = input;
        this.output = output;
    }

    public void doListIpAddresses() {
        String[] values = input.getValues();
        Diapason diapason = new Diapason(values[0], values[1]);
        output.setDiapason(diapason);
        output.showAllIpAddresses();
    }
}
