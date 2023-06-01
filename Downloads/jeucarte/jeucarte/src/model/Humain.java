/**
 * 
 */
package model;

/**
 * @author Administrator
 *
 */
public class Humain extends Joueur {

	/**
	 * @param args
	 */
	
	public Humain(String nom, int position){
		super(nom, position, "humain", Integer.MAX_VALUE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Humain hum1 = new Humain("boss",2);
		System.out.println(hum1.toString());
	}
	@Override
	public String toString() {
		return super.toString()+"Humain []";
	}

}
