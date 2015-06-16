
public class Incrementor {

    /* Create Incrementor with counter starting at 1 */
    public Incrementor() {
        counter = 1;
    }

    /* Create Incrementor with given starting counter value */
    public Incrementor(int startValue) {
        counter = startValue;
    }

    /* Return the real value of the counter, and Incrementor */
    public int nextValue() {
        int temp = counter;
        counter++;
        return (temp);
    }

    private int counter;
}
