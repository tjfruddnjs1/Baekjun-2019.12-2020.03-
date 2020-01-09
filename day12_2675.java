import java.util.Scanner;
 
public class day12_2675 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            int cnt = scan.nextInt();
            String str = scan.nextLine();
 
            String result = "";
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < cnt; k++)
                    result += str.charAt(j);
            }
            result = result.replaceAll(" ", "");
            System.out.println(result);
        }
        scan.close();
    }
}