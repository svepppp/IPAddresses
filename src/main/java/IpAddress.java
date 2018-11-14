public class IpAddress {
    private String value;
    private int firstNumber;
    private int secondNumber;

    public IpAddress() {
    }

    public IpAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    @Override
    public String toString() {
        return "IpAddress{" +
                "value='" + value + '\'' +
                ", firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                '}';
    }
}
