public class Calculator {
    private boolean on;
    private Reader reader;

    public Calculator() {
        this.on = false;
        this.reader = new Reader();
    }

    public void start() {
        this.on = true;

        while (this.on) {
            System.out.print("Command: ");
            String command = this.reader.readString();

        }
    }

    public void handleCommand(String command) {
        if (command.equals("end")) {
            this.on = false;
            return;
        } else if (command.equals("sum")) {

        } else if (command.equals("difference")) {

        } else if (command.equals("product")) {

        }
    }
}
