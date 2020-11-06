public class Inputs{
        public static void main(String[] args){
            // must create instance of Scanner for inputs
            Scanner input = new Scanner(System.in);
            int number;
            String firstName;
            double dec;

            System.out.print("Enter a number: ");
            number = input.nextInt(); // read in a whole number

            System.out.println("Number entered is: "+number);

            System.out.print("Enter a first name: ");
            firstName = input.next(); // read in a one word String

            System.out.println("Name entered is: "+firstName);

            System.out.print("Enter a decimal number: ");
            dec = input.nextDouble(); // read in a decimal number

            System.out.println("Decimal number entered is: "+dec);
        }
}
