import java.util.Stack;

public class Stack {
    private static final int DEFAULT_SIZE = 5;
    private static final int MAX_SIZE = 64;
    private static final int MIN_PEG = 1;
    private static final int MAX_PEG = 3;
    @SuppressWarnings("unchecked")
    private static Stack<Integer>[] tower = new Stack[4];
    private int numOfRings;

public Towers(int n) {
    if (n < 1 || n > MAX_SIZE)
        throw new IllegalArgumentException(
                String.format("Number of rings (%s) cannot be less than 1 or exceed 64 ", n));
    numOfRings = n;
    tower[1] = new Stack<Integer>();
    tower[2] = new Stack<Integer>();
    tower[3] = new Stack<Integer>();
    for (int i = numOfRings; i >= 1; i--)
        tower[1].push(i);
}

public Towers() {
    numOfRings = DEFAULT_SIZE;
    tower[1] = new Stack<Integer>();
    tower[2] = new Stack<Integer>();
    tower[3] = new Stack<Integer>();
    for (int i = numOfRings; i >= 1; i--)
        tower[1].push(i);
}

private static void pegCheck(int pegNumber) {
    if (pegNumber < MIN_PEG || pegNumber > MAX_PEG)
        throw new IllegalArgumentException(
                String.format("Peg number (%s) cannot be less than 1 or exceed 3 ", pegNumber));
}

public int getRingCount(int pegNumber) {
    pegCheck(pegNumber);
    if (tower[pegNumber].isEmpty()) {
        return 0;
    } else
        return tower[pegNumber].size();
}

public int getTopDiameter(int pegNumber) {
    pegCheck(pegNumber);
    if (getRingCount(pegNumber) > 0) {
        return tower[pegNumber].get(tower[pegNumber].size() - 1);
    }
    return 0;
}

public boolean move(int startPeg, int endPeg) {
    pegCheck(startPeg);
    pegCheck(endPeg);

    if (endPeg != startPeg) {
        if (getRingCount(startPeg) > 0) {
            if (getRingCount(endPeg) == 0 || getTopDiameter(startPeg) < getTopDiameter(endPeg)) {
                int topRing = tower[startPeg].pop();
                tower[endPeg].push(topRing);
                return true;
            }

        }
    }
    return false;
}
}
