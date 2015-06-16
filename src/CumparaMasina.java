import acm.program.ConsoleProgram;



public class CumparaMasina extends ConsoleProgram {



    public void run() {
        setFont("Times New Roman-20");

        masina bmw = new masina("Robert Milcu", 27);
        bmw.setMoney(18000);

        println(bmw.getName() + " has "
                + bmw.getMoney() + " money.");

        println(bmw.getName() + " can buy car: "
                + bmw.hasEnoughtMoney());

        println(bmw.getName() + " gets additional help ");
        bmw.incrementMoney(2100);

        println(bmw.getName() + " can buy car: "
                + bmw.hasEnoughtMoney());

        if (bmw.hasEnoughtMoney()) {
            println("ROCK ON " + bmw.toString());
        }
    }
}
