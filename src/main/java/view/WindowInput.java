package view;

public class WindowInput implements Input {
    private IpAddressWindow ipAddressWindow;

    public WindowInput() {
        ipAddressWindow = new IpAddressWindow();
    }

    @Override
    public String[] getValues() {
        String[] values = new String[2];
        pause(20000);
        values[0] = ipAddressWindow.getValue1();
        values[1] = ipAddressWindow.getValue2();
        return values;
    }

    private void pause(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
