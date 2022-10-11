package baseball;

import java.util.Arrays;

public class BGame {
	private int t =0;
	private int com[]=new int[4];
	public void init(){	
		for(int i=0;i<4;i++) {
			com[i] = (int)(Math.random()*10);
			for(int x=0;x<i;x++) {
				if(com[x]==com[i]) {i--;}
			}
		}
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(com));
	}

	public void incCount() {
		// TODO Auto-generated method stub
		t += 1;
	}
	public int getStrike(int[] input) {
		int s=0;
		for(int i=0;i<4;i++) {
			if(com[i]==input[i]) {
				s++;
			}
		}
		return s;
	}
	public int getBall(int[] input) {
		// TODO Auto-generated method stub
		int b=0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(com[i]!=input[i]&&com[i]==input[j]) {
					b++;
				}
			}
		}
		return b;
	}
	public void completeGame() {
		// TODO Auto-generated method stub
		System.out.println("게임이 종료되었습니다.");
		System.out.println("시도 횟수 : "+t);
	}
}
