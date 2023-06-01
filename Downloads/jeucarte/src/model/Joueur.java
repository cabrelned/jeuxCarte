/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Joueur {
	
	
	/**
	 * @param args
	 */
	private String nom ;
	private int nbTete;
	private int position;
	private String status;
	private int nbCarte;
	private ArrayList<Carte> ListeCarte;
	private Carte carteChoisie;

	private String typeJoueur;
	
	private int timeout;

	public Joueur(String nom,int position,String typeJoueur,
			int timeout) {
		this.nom = nom;
		this.nbTete = 0;
		this.position = position;
		this.status = "RAS";
		this.nbCarte = 0;
		ListeCarte = new ArrayList<Carte>(10);
		this.typeJoueur = typeJoueur;
		this.timeout = timeout;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Joueur foo = new Joueur("boss",1,"humain",10);
System.out.println(foo.toString());

	}

	/**
	 * @param nbTete
	 * methode pour calculer le nbTete cummuler par chaque jouere
	 */
	public final void ajouterNbTete(int nbTete) {
		this.nbTete += nbTete;
	}

	/**
	 * @param carte
	 * methode pour recevoir une carte
	 */
	public void recevoirCarte(Carte carte) {
		this.ListeCarte.add(carte);
		this.trierCarte();
	}

	/**
	 * methode pour trier une carte
	 */
	public void trierCarte(){
		int posMin;
		for (int i = 0; i < this.ListeCarte.size() - 1; i++){
			posMin = i;
			for (int j = i +1; j < this.ListeCarte.size(); j++){
				if (this.ListeCarte.get(j).getNumCarte() < this.ListeCarte.get(posMin).getNumCarte()){
					posMin = j;
				}
			}
			Carte temp = this.ListeCarte.get(posMin);
			this.ListeCarte.set(posMin,this.ListeCarte.get(i)) ;
			this.ListeCarte.set(i,temp);
		}
        
	}

	public void ChoisirCarte(int numCarte){
		Carte carteChoisie = new Carte(numCarte);
		for (int i = 0; i <this.ListeCarte.size(); i++){
			System.out.println(this.ListeCarte.get(i).toString());
		}
		Scanner joueur = new Scanner(System.in);
		boolean present = false;
		while(!present){//permet d'éviter une erreur si l'on ne tape pas la bonne NgetNumCarte
			int valchoisie = joueur.nextInt();
			for (int i = 0; i <this.ListeCarte.size(); i++){
				if (this.ListeCarte.get(i).getNumCarte() == valchoisie){
					carteChoisie = new Carte(numCarte);
					this.ListeCarte.remove(carteChoisie);
					present = true;
				}
			}
			if (!present){
				System.out.println("La carte que vous avez choisie ne fait pas partie de votre main, choisissez en une autre");
			}
		}
		setCarteChoisie(carteChoisie);
	}

	public LigneCarte PoserCarte(ArrayList<Carte> tabLigne, int numLigne){
		LigneCarte newTligne = new LigneCarte(numLigne, this.getNbCarte()+1, 5, tabLigne);
		
		return(newTligne);
	}

	public int recupereNbTeteLigne(){
		Scanner joueur = new Scanner(System.in);
		int numLigne = joueur.nextInt();
		numLigne = numLigne - 1; 
		return(numLigne);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbTete() {
		return nbTete;
	}

	public void setNbTete(int nbTete) {
		this.nbTete = nbTete;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getNbCarte() {
		return nbCarte;
	}

	public void setNbCarte(int nbCarte) {
		this.nbCarte = nbCarte;
	}

	public ArrayList<Carte> getListeCarte() {
		return ListeCarte;
	}

	public void setListeCarte(ArrayList<Carte> listeCarte) {
		ListeCarte = listeCarte;
	}

	public String getTypeJoueur() {
		return typeJoueur;
	}

	public void setTypeJoueur(String typeJoueur) {
		this.typeJoueur = typeJoueur;
	}

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public Carte getCarteChoisie() {
		return carteChoisie;
	}

	public void setCarteChoisie(Carte carteChoisie) {
		this.carteChoisie = carteChoisie;
	}


}
