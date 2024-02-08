import javax.swing.*;

public class app {
    public static void main(String[] arge) throws Exception{
        int boardWidth = 600;
        int boardHeight = boardWidth;

        JFrame = new JFrame("Snake");
        frame.setVisible(true);
            frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizale(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeGame snakeGame = new SnakeGame(boardWidth, boardHeight);
        frame.add(snakeGame);
    }
}