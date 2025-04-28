public class CalculatorTest {
    public static void main(String[] args) {

        int risultato1 = Calculator.sum(2, 3);
        System.out.println(risultato1);

        float risultato2 = Calculator.sum(2.0f, 5.5f);
        System.out.println(risultato2);

        float risultato3 = Calculator.sum(5, 10.2f);
        System.out.println(risultato3);
        
    }
}
