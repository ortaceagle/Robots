import acm.program.ConsoleProgram;


public class Stanford extends ConsoleProgram {

    public void run() {
        setFont("Times new roman = 20");

        Student stud = new Student("Robert Milcu", 1987);
        stud.setUnits(177);

        println(stud.getName() + " has "
                + stud.getUnits() + " units");

        println(stud.getName() + " can graduate: "
                + stud.hasEnoughUnits());

        println(stud.getName() + " takes CS106A!");
        stud.incrementUnits(5);

        println(stud.getName() + " can graduate: "
                + stud.hasEnoughUnits());

        if (stud.hasEnoughUnits()) {
            println("ROCK ON " + stud.toString());
        }
    }
}
