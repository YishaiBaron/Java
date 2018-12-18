import java.util.Arrays;

public class PasswordGen {
static String[] options = { "a", "b", "c", "d" };
static String[] places = new String[options.length];
static int count;

public static void main(String[] args) {
    // Starting with initial position of a i.e. 0
    sequence(0, places.clone());
}

private static void sequence(int level, String[] holder) {
    if (level >= options.length) {
        // combination complete
        System.out.println("" + (++count) + " Combination "
                + Arrays.toString(holder));
        return;
    }

    String val = options[level];
    String[] inrHolder = null;
    for (int c = 0; c < holder.length; c++) {
        inrHolder = holder.clone();
        if (inrHolder[c] == null) {
            inrHolder[c] = val;
            sequence(level + 1, inrHolder.clone());
        }
    }
    return;
}
}