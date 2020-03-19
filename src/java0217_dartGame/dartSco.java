package java0217_dartGame;



public class dartSco {

	private int jamsu=0;
	private char bonus;
	private String option="";
	
	dartSco() {
		
	}
	
	public void Sco(int jamsu, char bonus,String option) {
		this.jamsu=jamsu;
		this.bonus=bonus;
		this.option=option;
	}
	public void prt() {
		System.out.println(this.jamsu+"  /  "+this.bonus+"  /  "+this.option );
	}
	public void setjamsu(int jamsu) {
		this.jamsu=jamsu;
	}
	
	
	public int getjamsu() {
		return jamsu;
		
	}
	public char getBonus() {
		return bonus;
	}

	public void setBonus(char bonus ) {
		this.bonus=bonus;
	}
	
	public String getOption() {
		return option;
		
	}
	public void setOption(String option) {
		this.option=option;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
