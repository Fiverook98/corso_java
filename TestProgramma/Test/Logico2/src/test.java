public class test {
    public static void main(String[] args){
        float x, a, b;
        boolean appartiene;

        a = 0.1f;
        b = 1.0f;
        x = 0.5f;
        appartiene = x >= a && x <= b;
        System.out.printf("\n Valore appartiene = %b\n", appartiene);

    }
}
