import acm.graphics.GRect;
import acm.program.GraphicsProgram;

/**
 * Created by robertmilcu on 03/06/15.
 */
public class Checkerboard extends GraphicsProgram {

    /* Number of rows */
    private static final int NROWS = 8;

    /* Number of Columns */
    private static final int NCOLUMNS = 8;

    /* Runs the program */
    public void run() {
        int sqSize = getHeight() / NROWS;
        for (int i = 0; i < NROWS; i++) {
            for (int j = 0; j < NCOLUMNS; j++) {
                int x = j * sqSize;
                int y = i * sqSize;
                GRect sq = new GRect(x, y, sqSize, sqSize);
                sq.setFilled (((i + j) % 2) != 0);
                add(sq);
            }
        }

    }

}
