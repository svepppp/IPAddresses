import controller.Controller;
import view.*;

public class Main2 {
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Output output = new ConsoleOutput();
        Controller controller = new Controller(input, output);
        controller.doListIpAddresses();
    }
}

