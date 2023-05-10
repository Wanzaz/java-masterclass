public class NatoPhoneticAlphabet {
    
    public static void NatoChecker(String word) {

        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)) {
                case 'A':
                    System.out.println("Able");
                    break;
                case 'B':
                    System.out.println("Baker");
                    break;
                case 'C':
                    System.out.println("Charlie");
                    break;
                case 'D':
                    System.out.println("Dog");
                    break;
                case 'E':
                    System.out.println("Easy");
                    break;
                default:
                    System.out.println("*");
                    break;
            }
        }
    }

    public static void main(String[] args) {

        String word = "CGAER";
        
        NatoChecker(word);
    }
}
