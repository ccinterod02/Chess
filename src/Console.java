import java.util.Scanner;

public class Console {

    public  void println(String message) {
        System.out.println(message);
    }

    public String readString(String message) {
        
        Scanner scanner = new Scanner(System.in);
        this.print(message);
        String answer = scanner.nextLine();
        scanner.close();
        return answer;
    }

    public void print(String message) {
        System.out.print(message);
    }

}
