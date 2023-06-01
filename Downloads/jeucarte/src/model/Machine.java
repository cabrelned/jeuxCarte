/**
 * 
 */
package model;

/**
 * @author Administrator
 *
 */
public class Machine extends Joueur {

	/**
	 * @param args
	 * joueur de type machine (IA)
	 */
	private static int nbAI=1;
	/**
	 * @param position
	 */
	public Machine(int position){
		super("AI_"+nbAI, position, "ai", 10);
		nbAI++;
	}
	// public static void main(String[] args) {
	// 	// TODO Auto-generated method stub
	// 	Machine mac1 = new Machine(2);
	// 	System.out.println(mac1.toString());
	// }
	@Override
	public String toString() {
		return super.toString()+"Machine []";
	}

}
