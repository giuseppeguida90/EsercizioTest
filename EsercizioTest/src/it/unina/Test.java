package it.unina;

public class Test {
	private int thing1;
	private int thing2;
	public int getThing1() {
		return thing1;
	}
	public void setThing1(int thing1) {
		this.thing1 = thing1;
	}
	public int getThing2() {
		return thing2;
	}
	public void setThing2(int thing2) {
		this.thing2 = thing2;
	}
	@Override
	/*Questa funzione viene sempre chiamata quando si fa 
	 * System.out.println(myobject)*/
	public String toString() {
		return "Test [thing1=" + thing1 + ", thing2=" + thing2 + "]";
	}
	
}
