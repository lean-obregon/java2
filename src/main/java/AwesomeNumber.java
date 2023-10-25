public class AwesomeNumber {
    int num;

    AwesomeNumber(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public static int add(AwesomeNumber n1, AwesomeNumber n2) {
        return n1.getNum() + n2.getNum();
    }

    public static int subtract(AwesomeNumber n1, AwesomeNumber n2) {
        return n1.getNum() - n2.getNum();
    }
}