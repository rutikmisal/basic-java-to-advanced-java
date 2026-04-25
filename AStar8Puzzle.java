import java.util.*;

class Node {
    int[][] board;
    int g, h;
    Node parent;

    Node(int[][] board, int g, Node parent) {
        this.board = board;
        this.g = g;
        this.parent = parent;
        this.h = calculateH();
    }

    // Heuristic: number of misplaced tiles
    int calculateH() {
        int[][] goal = {{1,2,3},{4,5,6},{7,8,0}};
        int count = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] != 0 && board[i][j] != goal[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    int getF() {
        return g + h;
    }
}

public class AStar8Puzzle {

    static int[][] goal = {{1,2,3},{4,5,6},{7,8,0}};

    // Check if goal reached
    static boolean isGoal(int[][] board) {
        return Arrays.deepEquals(board, goal);
    }

    // Print board
    static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Copy board
    static int[][] copy(int[][] board) {
        int[][] newBoard = new int[3][3];
        for (int i = 0; i < 3; i++)
            newBoard[i] = board[i].clone();
        return newBoard;
    }

    // Find zero position
    static int[] findZero(int[][] board) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == 0)
                    return new int[]{i, j};
        return null;
    }

    // Generate neighbors
    static List<Node> getNeighbors(Node node) {
        List<Node> neighbors = new ArrayList<>();
        int[] pos = findZero(node.board);
        int x = pos[0], y = pos[1];

        int[][] moves = {{1,0},{-1,0},{0,1},{0,-1}};

        for (int[] m : moves) {
            int nx = x + m[0];
            int ny = y + m[1];

            if (nx >= 0 && ny >= 0 && nx < 3 && ny < 3) {
                int[][] newBoard = copy(node.board);

                // swap
                newBoard[x][y] = newBoard[nx][ny];
                newBoard[nx][ny] = 0;

                neighbors.add(new Node(newBoard, node.g + 1, node));
            }
        }
        return neighbors;
    }

    // A* Algorithm
    static void solve(int[][] start) {

        PriorityQueue<Node> open = new PriorityQueue<>(Comparator.comparingInt(Node::getF));
        Set<String> closed = new HashSet<>();

        Node startNode = new Node(start, 0, null);
        open.add(startNode);

        while (!open.isEmpty()) {
            Node current = open.poll();

            if (isGoal(current.board)) {
                System.out.println("Goal Found!\nPath:");
                while (current != null) {
                    printBoard(current.board);
                    current = current.parent;
                }
                return;
            }

            closed.add(Arrays.deepToString(current.board));

            for (Node neighbor : getNeighbors(current)) {
                if (!closed.contains(Arrays.deepToString(neighbor.board))) {
                    open.add(neighbor);
                }
            }
        }

        System.out.println("No Solution Found!");
    }

    public static void main(String[] args) {
        int[][] start = {
            {1,2,3},
            {4,0,6},
            {7,5,8}
        };

        solve(start);
    }
}