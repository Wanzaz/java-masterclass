public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (0 > kiloBytes) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024 ;
            int remainder = kiloBytes - (megaBytes * 1024);
            System.out.println(kiloBytes + " KB = " + megaBytes 
                                + " MB and " + remainder + " KB");
        }
        
    }

    public static void main(String[] args) {
        int kiloBytes = 2500;
        printMegaBytesAndKiloBytes(kiloBytes);
    }
}
