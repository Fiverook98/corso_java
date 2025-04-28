public class Test {
    public static void main(String[] args) {
      final char A = 'A', E = 'E', I = 'I', O = 'O', U = 'U', Z = 'Z';
      final char a= 'a', e = 'e', i = 'i', o = 'o', u = 'u', z = 'z';
      char carattere;
      boolean isConsonante;

      carattere = ' ';
      if ((carattere >= A && carattere <= Z)||(carattere >= a && carattere <= z)){
        isConsonante = !(
                    carattere == A ||carattere == a ||
                    carattere == E ||carattere == e ||
                    carattere == O ||carattere == o ||
                    carattere == I ||carattere == i ||
                    carattere == U ||carattere == u
        );
        if (isConsonante) {
           System.out.printf("Il carattere %c è una consonante\n", carattere); 
        }else {
            System.out.printf("Il carattere %c non è una consonante\n", carattere);
        }
      } else {
        System.out.printf("Il carattere inserito non fa parte dell'alfabeto latino\n");
      }
    }
}
