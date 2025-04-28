import javax.swing.JFrame;

public class GameWindow extends JFrame{
    public GameWindow(){
        setTitle("My Game");

        setSize(800,600);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        setVisible(true);

    }

    public static void main(String[] args) {
        new GameWindow();
    }
}
