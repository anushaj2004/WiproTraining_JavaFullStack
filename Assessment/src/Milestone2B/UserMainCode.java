package Milestone2B;

import java.util.*;

class UserMainCode {
    public String moveRobot(int input1, int input2, String input3, String input4) {
        // Parse initial position and direction
        String[] startParts = input3.split("-");
        int x = Integer.parseInt(startParts[0]);
        int y = Integer.parseInt(startParts[1]);
        char dir = startParts[2].charAt(0); // E, W, N, S

        // Directions in clockwise order: N, E, S, W
        char[] directions = { 'N', 'E', 'S', 'W' };

        // Map direction to index
        Map<Character, Integer> dirIndex = new HashMap<Character, Integer>();
        dirIndex.put('N', 0);
        dirIndex.put('E', 1);
        dirIndex.put('S', 2);
        dirIndex.put('W', 3);

        // Movement vectors
        Map<Character, int[]> moveMap = new HashMap<Character, int[]>();
        moveMap.put('N', new int[]{0, 1});
        moveMap.put('E', new int[]{1, 0});
        moveMap.put('S', new int[]{0, -1});
        moveMap.put('W', new int[]{-1, 0});

        boolean error = false;

        // Process commands
        String[] commands = input4.trim().split("\\s+");
        for (String cmd : commands) {
            if (cmd.equals("L")) {
                dir = directions[(dirIndex.get(dir) + 3) % 4];
            } else if (cmd.equals("R")) {
                dir = directions[(dirIndex.get(dir) + 1) % 4];
            } else if (cmd.equals("M")) {
                int[] move = moveMap.get(dir);
                int newX = x + move[0];
                int newY = y + move[1];
                if (newX < 0 || newY < 0 || newX > input1 || newY > input2) {
                    error = true;
                    break;
                }
                x = newX;
                y = newY;
            }
        }

        String result = x + "-" + y + "-" + dir;
        if (error) {
            result += "-ER";
        }
        return result;
    }
}