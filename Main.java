package ua.lviv.iot;

public class Main {

        public static void main(String[] args) {
            Message M1 = new Message();
            Message M2 = new Message("Hello, my friend", "James", 145, 3);
            Message M3 = new Message("How are you doing?", "Friedrich", 96.3, 2.46, 17, true);

            System.out.println(M1.toString());
            System.out.println(M2.toString());
            System.out.println(M3.toString());

            System.out.println("Printing static int AgeLimit: " + M1.printDateOfSending());
            System.out.println("Printing static int AgeLimit: " + M2.printDateOfSending());
            System.out.println("Printing static int AgeLimit: " + M3.printDateOfSending());

            System.out.println("Static method : " + Message.printStaticDateOfSending());
        }
    }

