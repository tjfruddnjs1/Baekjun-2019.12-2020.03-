import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
 
public class day36_2580 {
    private static final int size = 9;
    private static int[][] arr;
    private static List<int[]> list;
    private static boolean isEnd;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        arr = new int[size][size];
        list = new ArrayList<>();
        
        for(int i=0; i < size; i++) {
            st = new StringTokenizer(br.readLine());
            
            for(int j=0; j < size; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                
                if(arr[i][j] == 0) list.add(new int[] {i, j});
            }
        }
        backtracking(0, 0);
    }
    public static void backtracking(int idx, int cnt) {
        // ��� O �� Ž�� X
        if(isEnd) return;
        
        //��ĭ ���� = �ʱ� zero ����
        if(cnt == list.size()) {
            isEnd = true;
            print();
            return;
        }
        if(idx >= list.size()) return;
        
        int y = list.get(idx)[0];
        int x = list.get(idx)[1];
        
        // 1 ���� 9 ���� �Է� ������ ���� �� Ȯ���Ѵ�.
        for(int i=1; i<=9; i++) {
            // �ش� ���ڰ� �����ϸ� �ش� ��ǥ�� ���� �Է� ��, backtrack
            if(isAble(y, x, i)) {
                arr[y][x] = i;
                backtracking(idx+1, cnt+1);
                arr[y][x] = 0;
            }
        }
        
    }
    
    public static void print() {
                StringBuilder sb = new StringBuilder();
                for(int i=0; i < size; i++) {
                    for(int j=0; j < size; j++) {
                        sb.append(arr[i][j] + " ");
                    }
                    sb.append("\n");
                }
                System.out.println(sb.toString());
    }
    
    public static boolean isAble(int y, int x, int v) {
        for(int i=0; i < size; i++) {
            // ����
            if(arr[y][i] == v) return false;
            
            // ����
            if(arr[i][x] == v) return false;
        }
        
        // 3*3
        int y_s = y/3 * 3;
        int x_s = x/3 * 3;
        for(int i = y_s; i < y_s+3; i++) {
            for(int j = x_s; j < x_s+3; j++) {
                if(arr[i][j] == v) return false;
            }
        }
        return true;
    }
}
