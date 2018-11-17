package model;

public class IpAddress {
    private String value;
    private int number;
     private int indexPoint;

    public IpAddress() {
    }

    public IpAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getNumber(String value) {
        String stringNumber;
        int i = value.length();
        char symbol = ' ';
        do {
            i--;
            symbol = value.charAt(i );
        } while (symbol != '.');
         indexPoint=i;
        stringNumber = value.substring(indexPoint+1);
        number = Integer.parseInt(stringNumber);
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getIndexPoint() {
        return indexPoint;
    }

    public void setIndexPoint(int indexPoint) {
        this.indexPoint = indexPoint;
    }
}