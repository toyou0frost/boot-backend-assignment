import java.util.Scanner;

public class ConsoleIo {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);  
        System.out.print("아이디를 입력해주세요. : "); 

        String usernm = sc.nextLine(); 

        System.out.print("생년월일을 입력해주세요. : ");
        int birthDate = sc.nextInt();  


        System.out.printf("%s%d",usernm,birthDate); 
                                                        
        System.out.printf("%s\n%d", usernm, birthDate);
    }
}