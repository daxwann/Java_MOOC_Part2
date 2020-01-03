public class Calculator {
    private Reader reader;
    private int operations;

    public Calculator() {
        this.reader = new Reader();
        this.operations = 0;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.reader.readString();

            if (command.equals("end")) {
                break;
            }

            handleCommand(command);
        }

        statistics();
    }

    private void handleCommand(String command) {
        if (command.equals("sum")) {
            sum();
        } else if (command.equals("difference")) {
            difference();
        } else if (command.equals("product")) {
            product();
        } else {
            return;
        }

        this.operations++;
        System.out.println("");
    }

    private int[] askValues() {
        int[] values = new int[2];

        System.out.print("value1: ");
        values[0] = this.reader.readInteger();
        System.out.print("value2: ");
        values[1] = this.reader.readInteger();

        return values;
    }

    private void sum(){
        int[] values = askValues();
        int sum = values[0] + values[1];
        System.out.println("sum of the values " + sum);
    }

    private void difference() {
        int[] values = askValues();
        int difference = values[0] - values[1];
        System.out.println("difference of the values " + difference);
    }

    private void product() {
        int[] values = askValues();
        int product = values[0] * values[1];
        System.out.println("product of the values " + product);
    }

    private void statistics() {
        System.out.println("Calculations done " + this.operations);
    }
}
