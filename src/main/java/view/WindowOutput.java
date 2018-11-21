package view;

import model.Diapason;

import java.util.List;

public class WindowOutput implements Output {
    private AllIpAddressesWindow allIpAddressesWindow;
    private Diapason diapason;

    public WindowOutput(Diapason diapason) {
        this.diapason = diapason;
        allIpAddressesWindow = new AllIpAddressesWindow();
    }


    @Override
    public void showAllIpAddresses() {
        List<String> allIpAddresses = diapason.getAllIpAddresses();

        for (String allIpAddress : allIpAddresses) {
            allIpAddressesWindow.getjTextArea().append("\n" + allIpAddress);
        }
    }
}
