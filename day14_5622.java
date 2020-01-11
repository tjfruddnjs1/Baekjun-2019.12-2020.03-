import java.util.Scanner;
public class day14_5622 {
       public static void main(String[] args) {
    	   
             Scanner scan = new Scanner(System.in);
             String input = scan.nextLine();
             char arr[] = input.toCharArray();
             
             int sum=0;
             for(char i : arr)
             {
                    sum += Dial(i);
             }
             System.out.println(sum + input.length());
             scan.close();
       }
       
       public static int Dial(char input)
       {
             switch (input)
             {
             case 'A':case 'B':case 'C':
                    return 2;
             case 'D':case 'E':case 'F':
                    return 3;
             case 'G':case 'H':case 'I':
                    return 4;
             case 'J':case 'K':case 'L':
                    return 5;
             case 'M':case 'N':case 'O':
                    return 6;
             case 'P':case 'Q':case 'R':case 'S':
                    return 7;
             case 'T':case 'U':case 'V':
                    return 8;
             case 'W':case 'X':case 'Y':case 'Z':
                    return 9;
             default:
                    return -1;
             }
       
       }
}