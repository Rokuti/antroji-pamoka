public class mazeRuner {
    public static void main(String[] args) {

    }

    public static String mazeRunner(int[][] maze, String[] directions) {
        int x = 0, y = 0;
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[i][j] == 2) {
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        for (String direction : directions) {
            if (direction.equals("N")) {
                x--;
            } else if (direction.equals("S")) {
                x++;
            } else if (direction.equals("E")) {
                y++;
            } else if (direction.equals("W")) {
                y--;
            }

            if (x < 0 || y < 0 || x > maze.length - 1 || y > maze[0].length - 1 || maze[x][y] == 1) {
                return "Dead";
            }
            if (maze[x][y] == 3) {
                return "Finish";
            }
        }
        return "Lost";
    }
}
