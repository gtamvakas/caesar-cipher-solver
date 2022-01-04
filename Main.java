import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        do{
            System.out.println("Enter the ciphertext: ");
            Solver cipherSolver = new Solver(scanner.nextLine());
            System.out.println("Use a key or try all possible combinations? K/C");
            String input = scanner.nextLine();

            if(input.equalsIgnoreCase("K")){
                System.out.println("Please input the key (An integer): ");
                int key = Integer.parseInt(scanner.nextLine());
                System.out.println("The plaintext is: " + ConsoleColors.GREEN_BOLD + cipherSolver.solve(key) + ConsoleColors.RESET);
                System.out.println();
                System.out.println("Do you want to continue? yes/no");
                answer = scanner.nextLine();
            }else{
                int key = 1;
                while(key <= 26) {
                    System.out.println(ConsoleColors.RED_BOLD+"Key[ "+key+" ]" +  ConsoleColors.RESET + " Plaintext: " + ConsoleColors.GREEN_BOLD + cipherSolver.solve(key));
                    key++;
                }
                System.out.println("Do you want to continue? yes/no");
                answer = scanner.nextLine();
            }

        }while(answer.equalsIgnoreCase("yes"));

        System.out.println("Goodbye! <3");

    }


}
