package view;

import model.Diapason;

import java.util.List;

public class ConsoleOutput implements Output {
    private Diapason diapason;

    public ConsoleOutput() {
    }

    public ConsoleOutput(Diapason diapason) {
        this.diapason = diapason;
    }

    public Diapason getDiapason() {
        return diapason;
    }

    @Override
    public void setDiapason(Diapason diapason) {
        this.diapason = diapason;
    }

    @Override
    public void showAllIpAddresses() {
        List<String> allIpAddresses = diapason.getAllIpAddresses();
        System.out.println("\nВсе  IP адреса");

        for (String allIpAddress : allIpAddresses) {
            System.out.println(allIpAddress);
        }
    }
}
