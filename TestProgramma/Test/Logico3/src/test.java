public class test {
    public static void main(String[] args){
        char carattere;
        boolean isVocale;
        
        carattere = 'b';
        isVocale = carattere == 'a' || carattere == 'e' || carattere == 'i' || carattere == 'o' || carattere == 'u';

        if (isVocale)
            System.out.printf("Il carattere %c è una vocale\n", carattere);
        else 
            System.out.printf("Il carattere %c non è una vocale\n", carattere);

    }
}
