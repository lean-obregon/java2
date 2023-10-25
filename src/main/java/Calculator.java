import java.util.ArrayList;

public class Calculator implements Calculatable {
    ArrayList<String> history = new ArrayList<>();
    String message;
    int total = 0;

    @Override
    public Integer add(Integer number1, Integer number2) {
        total = number1 + number2;
        message = number1 + " + " + number2 + " = " + total;
        history.add(message);
        return total;
    }

    @Override
    public Integer subtract(Integer number1, Integer number2) {
        total = number1 - number2;
        message = number1 + " - " + number2 + " = " + total;
        history.add(message);
        return total;
    }

    @Override
    public Integer multiply(Integer number1, Integer number2) {
        total = number1 * number2;
        message = number1 + " * " + number2 + " = " + total;
        history.add(message);
        return total;
    }

    @Override
    public Integer divide(Integer number1, Integer number2) {
        total = number1 / number2;
        message = number1 + " / " + number2 + " = " + total;
        history.add(message);
        return total;
    }

    public ArrayList<String> getHistory() {
            return history;
    }
}
