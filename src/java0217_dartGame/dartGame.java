package java0217_dartGame;

import java.util.ArrayList;
import java.util.Scanner;

public class dartGame {

	private Scanner in=new Scanner(System.in);
	private ArrayList<dartSco>eachGame=new ArrayList<>();
	private int frameSecor=0;
	private dartSco gameSco=null;
	
	
	
	public dartGame() {
		System.out.println("��Ʈ������ �����մϴ�");
		for(int i =0;i<3;i++) {
			gameSco=new dartSco();
			System.out.println("��� ������ �¾Ҵ��� �����ּ���");
			int a=in.nextInt();
			in.nextLine();
			char b=in.next().charAt(0);
			in.nextLine();
			String c =in.nextLine();
			gameSco.setjamsu(a);
			gameSco.setBonus(b);
			gameSco.setOption(c);
			eachGame.add(gameSco);
			for(dartSco p : eachGame) {
				p.prt();
	
			}
		}

	}
	
}
