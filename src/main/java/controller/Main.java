package controller;

import model.Diapason;
import view.*;

public class Main {
    public static void main(String[] args) {
        Input input = new WindowInput();
        String[] values = input.getValues();
        Diapason diapason = new Diapason(values[0], values[1]);
        Output output = new WindowOutput(diapason);
        output.showAllIpAddresses();
    }
}
