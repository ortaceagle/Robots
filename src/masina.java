

public class masina {

    public masina (String name, int age) {
        ownerName = name;
        ownerAge = age;
    }

    public String getName() {
        return ownerName;
    }

    public int getAge() {
        return ownerAge;
    }

    /** Set the number of money earned */
    public void setMoney (double money) {
        moneyEarned = money;
    }

    public double getMoney() {
        return moneyEarned;
    }

    /** Increment the number of money earned */
    public void incrementMoney (double additionalMoney) {
        moneyEarned += additionalMoney;
    }


    /** Gets the number of money earned */
    public boolean hasEnoughtMoney() {
        return (moneyEarned >= MONEY_REQ_TO_BUY_CAR);
    }

    /** Creates a string identifying this owner. */
    public String toString() {
        return ownerName + " (#" + ownerAge + ")";
    }



    /* Public constants */

    /** The number of money required to buy the car */

    public static final double MONEY_REQ_TO_BUY_CAR = 20000.0;

    /* Private instance variables */

    private String ownerName;   /* The owner name */
    private int ownerAge;       /* The owner age */
    private double moneyEarned; /* The number of money earned */
}
