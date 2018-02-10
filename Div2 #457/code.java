import java.io.*;
import java.util.Scanner;

class GFG {
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int x = scan.nextInt();
	    int h = scan.nextInt();
	    int m = scan.nextInt();
	    int ans = 0;
	    boolean b = func(m);
	    while(b){
            if (m < x) m += 60;
            m-=x;
            ans++;
            b = func(m);
	    }
	    System.out.println(ans);
	}
	public static boolean func(int m){
	    if (m / 10 == 7 || m % 10 == 7){
	        return false;
	    }
	    return true;
	}
}