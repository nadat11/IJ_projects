

class ReadingUserInput {
//    public static void main(String[] args) {


            public static String caoSvete(String ovoMiJeKorisnikPoslao){
                System.out.println("Korisnikov tekst: "+ovoMiJeKorisnikPoslao);

                String vratiOvo="Uspesno sam ispisao tvoj tekst";
                return vratiOvo;
            }

            public static void main(String[] args) {
                // TODO Auto-generated method stub


                System.out.println("Dobrodošli u naš program.");
                String rezultat=caoSvete("ispisi mi ovaj tekst");
                System.out.println(rezultat);
            }


//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your year of birth");
//
//        boolean hasNextInt = scanner.hasNextInt(); //checks if input is number
//
//        if(hasNextInt){
//            int yearOfBirth = scanner.nextInt();
//            scanner.nextLine();//handle next line character (enter key)
//
//            System.out.println("Enter your name: ");
//            String name = scanner.nextLine();
//
//            int age = 2021 - yearOfBirth;
//            if(age >= 0 && age <= 100) {
//                System.out.println("Your name is "+name+
//                        " and you are "+age+" years old");
//            }else{
//                System.out.println("Wrong year of birth");
//            }
//        }else{
//            System.out.println("Unable to parse year of birth");
//        }
//        scanner.close();
    }


