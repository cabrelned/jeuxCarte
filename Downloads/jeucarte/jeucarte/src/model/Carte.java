/**
 * 
 */
package model;

import java.net.URL;
import java.util.ArrayList;

import javax.swing.ImageIcon;

/**
 * @author Administrator
 *
 */
public class Carte {

	/**
	 * @param args
	 * numCarte est le nombre sur la carte
	 */
	private int numCarte;
	private int nbTete;
	private ImageIcon image;
	
	public Carte(int numCarte) {
		this.numCarte = numCarte;
		// attribution du nombre de tete selon le numero sur la carte
		if(numCarte==55){
			this.nbTete=7;
		} else if(numCarte%10==5){ 
			this.nbTete=2;
		} else if(numCarte%10==0){
			this.nbTete=3;
		} else if(numCarte%11==0){		
			this.nbTete=5;
		} else {			   
			this.nbTete=1;
		}
		URL url_tmp = getClass().getResource("/images/cards/"+numCarte+".png"); // Choisis l'image suivant le numero de la carte
		if(url_tmp!=null) this.image = new ImageIcon(url_tmp);
	}
	/**
	 * creation de carte vide
	 */
	public Carte() {
		this.numCarte = 999;
		this.nbTete=0;
		
		URL url_tmp = getClass().getResource("/images/cards/carteVide.png"); // Choisis l'image suivant le numero de la carte
		if(url_tmp!=null) this.image = new ImageIcon(url_tmp);
	}
	// public static void main(String[] args) {
	// 	// TODO Auto-generated method stub

	// 	ArrayList<Carte> listCarte = new ArrayList<Carte>();

	// 	for (int i = 0; i < 104; i++) {
	// 		Carte carte = new Carte(i+1);
	// 		listCarte.add(carte);
	// 	}
	// 	Carte carte = listCarte.get(30);
	// 	System.out.println(carte.plusGrand(listCarte.get(31)));
		
	
	// }
	public int getNumCarte() {
		return numCarte;
	}
	public void setNumCarte(int numCarte) {
		this.numCarte = numCarte;
	}
	public int getNbTete() {
		return nbTete;
	}
	public void setNbTete(int nbTete) {
		this.nbTete = nbTete;
	}
	public ImageIcon getImage() {
		return image;
	}
	public void setImage(ImageIcon image) {
		this.image = image;
	}


	@Override
	public String toString() {
		return "Carte [numCarte=" + numCarte + ", nbTete=" + nbTete + ", image=" + image + "]";
	}

	/**
	 * @param c
	 * @return vrais si une carte est plus grand que la carte en parametre
	 * 
	 */
	public boolean plusGrand(Carte c) {
		if(this.getNumCarte()>c.getNumCarte()){
			return true;
		} else{
			return false;
		} 
	}


}
