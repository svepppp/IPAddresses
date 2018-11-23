package view;

import model.Diapason;

import java.util.List;

public class WindowOutput implements Output {
    private AllIpAddressesWindow allIpAddressesWindow;
    private Diapason diapason;

    public WindowOutput() {
        allIpAddressesWindow = new AllIpAddressesWindow();
    }

    public WindowOutput(Diapason diapason) {
        this.diapason = diapason;
        allIpAddressesWindow = new AllIpAddressesWindow();
    }

    public AllIpAddressesWindow getAllIpAddressesWindow() {
        return allIpAddressesWindow;
    }

    public Diapason getDiapason() {
        return diapason;
    }

    public void setAllIpAddressesWindow(AllIpAddressesWindow allIpAddressesWindow) {
        this.allIpAddressesWindow = allIpAddressesWindow;
    }

    @Override
    public void setDiapason(Diapason diapason) {
        this.diapason = diapason;
    }

    @Override
    public void showAllIpAddresses() {
        List<String> allIpAddresses = diapason.getAllIpAddresses();

        for (String allIpAddress : allIpAddresses) {
            allIpAddressesWindow.getjTextArea().append("\n" + allIpAddress);
        }
    }
}
