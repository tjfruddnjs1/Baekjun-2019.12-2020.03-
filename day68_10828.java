import java.util.Scanner;

public class day68_10828 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int[] arr = new int[num];
		int top = -1;
		String input;
		
		for(int i=0;i<num;i++) {
			input = scan.next();
			
			if(input.equals("push")) {
				top++;
				arr[top] = scan.nextInt();
			}else if(input.equals("pop")) {
				if(top == -1) System.out.println("-1");
				else {
					System.out.println(arr[top]);
					top--;
				}
			}else if(input.equals("size")) {
				System.out.println(String.valueOf(top+1));
			}else if(input.equals("empty")) {
				if(top==-1) System.out.println("1");
				else System.out.println("0");
			}else if(input.equals("top")) {
				if(top==-1) System.out.println("-1");
				else System.out.println(arr[top]);
			}
		}
	}

}
