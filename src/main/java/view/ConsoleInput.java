package view;

import java.io.InputStream;
import java.util.Scanner;

public class ConsoleInput implements Input {
    private Scanner scanner;

    public ConsoleInput() {
        this(System.in);
    }

    public ConsoleInput(InputStream inputStream) {
        scanner = new Scanner(inputStream);
    }

    @Override
    public String[] getValues() {
        String[] values = new String[2];
        System.out.println("Укажите 1-й  IP адрес");
        values[0] = scanner.nextLine();
        System.out.println("Укажите 2-й  IP адрес");
        values[1] = scanner.nextLine();
        return values;
    }
}
