package baseball;

import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BGame g= new BGame();
		Scanner sc = new Scanner(System.in);
		int[] input = new int[4];
		
		g.init();
		
		g.print();
		
		do {
			System.out.println("숫자를 입력하시오 : ");
			for(int i =0;i<4;i++) {
				input[i]=sc.nextInt();
			}
			g.incCount();
			System.out.println(g.getStrike(input)+"St "+g.getBall(input)+"Ba");
		}while (g.getStrike(input)!=4);
		g.completeGame();
	}

}
