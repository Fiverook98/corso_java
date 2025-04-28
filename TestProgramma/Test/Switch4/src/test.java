public class test {
    public static void main(String[] args) {
        int up = 0,
            down = 0,
            left = 0,
            right = 0;

        char direction = 'S';

        switch (direction) {
           case 'D' -> {
                System.out.println("Turning right");
                right++;
           }
           case 'A' -> {
                System.out.println("Turning left");
                left++;
           }
           case 'W' -> {
                System.out.println("Moving up");
                up++;
           }
           case 'S' -> {
                System.out.println("Moving down");
                down++;
           }
        }
        System.out.println(down);
    }
}