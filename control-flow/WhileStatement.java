public class WhileStatement {
    // while - continue executing code block 
    //         until the loop expression becomes false
    // do while - execute the code block once, then continue executing 
    //            until the loop condition becomes false
    
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
            
        }
        
        int j = 0;
        while (true) {
            if (j > 5) {
                break;
            }
            System.out.println(j);
            j++;
        }

        int g = 0;
        while (g <= 5) {
            System.out.println(g);
            g++;
        }

        int h = 0;
        boolean isReady = false;
        do {
            if (h > 5) {
                break;
            }
            System.out.println(h);
            h++;
            isReady = (h > 0);
        } while (isReady);


        int number = 0;
        while (number < 50) {
            number += 5;
            if (number % 25 == 0) {
                continue;
            }
            System.out.print(number + "_");
        }
    }
}
