import model.Diapason;
import view.*;

public class Main2 {
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        String[] values = input.getValues();
        Diapason diapason = new Diapason(values[0], values[1]);
        Output output = new ConsoleOutput(diapason);
        output.showAllIpAddresses();
    }
}

