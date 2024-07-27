public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }else if(kiloBytes >= 0){
//            int megaBytes = kiloBytes / 1024;
//            int reminder = kiloBytes % 1024;
//            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + reminder + " KB");
            System.out.println(kiloBytes + " KB = " + kiloBytes/1024 + " MB and " + kiloBytes%1024 + " KB");
        }
    }
}


