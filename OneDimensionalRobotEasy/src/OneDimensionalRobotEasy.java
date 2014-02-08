import java.util.*;

public class OneDimensionalRobotEasy {
    public int finalPosition(String commands, int A, int B) {
        int position = 0;
        for (int i = 0; i < commands.length(); i++) {
            String command = commands.substring(i, i + 1);
            if (command.equals("R")) {
                if (position < B) {
                    position++;
                }
            } else if (command.equals("L")) {
                if (-A < position) {
                    position--;
                }
            }
        }
        return position;

    }
}
