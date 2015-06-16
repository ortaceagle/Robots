import acm.program.ConsoleProgram;

/**
 * Created by robertmilcu on 05/06/15.
 */
public class AddFive extends ConsoleProgram{

    private int AddFive (int x) {
        x+= 5;
        return x;
    }


    public void run() {
        int x = 3;
        x = AddFive(x);
        println("x = " + x);
    }

}
