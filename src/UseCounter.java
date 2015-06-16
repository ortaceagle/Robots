import acm.program.ConsoleProgram;


public class UseCounter extends ConsoleProgram {

    public void run() {
        setFont("Times New Roman=60");

        Incrementor count1 = new Incrementor(); // starts at 1
        Incrementor count2 = new Incrementor(35853);

        println("Five values for count1: ");
        countFiveTimes(count1);

        println("Five values for count2");
        countFiveTimes(count2);

        println("Another five values for count1: ");
        countFiveTimes(count1);

    }

    private void countFiveTimes(Incrementor counter) {
        for (int i = 0; i < 5; i++) {
            println(counter.nextValue());
        }

    }
}
