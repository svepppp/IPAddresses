import controller.Controller;
import view.*;

public class Main {
    public static void main(String[] args) {
        Input input = new WindowInput();
        Output output = new WindowOutput();
        Controller controller = new Controller(input, output);
        controller.doListIpAddresses();
    }
}
