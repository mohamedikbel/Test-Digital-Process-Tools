package test.ikbel.services.Impl;

import org.springframework.stereotype.Service;
import test.ikbel.entities.Ascenseur;
import test.ikbel.services.IAscenseur;

/**
 * La classe ImplAscenseur Implemente l'interface IAscenceur
 *
 */
@Service
public class ImplAscenceur implements IAscenseur {

	/**
	 * Initialisation: --------------------------- 
	 * - Ascenceur
	 *  - Etages
	 */

	private static final int Nbr_Ascenseurs = 3;
	private static final int Nbr_Etages = 5;
	private Ascenseur[] ascenseurs;

	/**
	 * Cette Méthode affiche la liste des Ascenceurs 
	 * 
	 * 
	 */
	@Override
	public Ascenseur[] AfficherLesAscenceur() {

		return this.ascenseurs;
	}

	/**
	 * On initialise tous les ascencurs au premier étage 
	 */
	@Override
	public Ascenseur[] IntialiserSysteme() {
		this.ascenseurs = new Ascenseur[Nbr_Ascenseurs];
		for (int asc = 0; asc < Nbr_Ascenseurs; asc++) {
			ascenseurs[asc] = new Ascenseur(asc, 1, false, false);
		}
		return AfficherLesAscenceur();
	}

	/**
	 * Cette méthode retourn l'état actuel d'un ascenceur  
	 */
	@Override
	public int AfficherEtageActuel(int IdAsc) {
		// TODO Auto-generated method stub
		return ascenseurs[IdAsc].getEtageAct();
	}

	/**
	 * Cette méthode retourne :
	 * True si l'assenceur peut encore monter (on incrumente le numero de l'étage)
	 * False si l'assenceur atteint la limite  
	 */
	@Override
	public boolean GoUp(int IdAsc) {
		if (ascenseurs[IdAsc].getEtageAct() >= Nbr_Etages) {
			ascenseurs[IdAsc].setGoing_Up(false);
			return false;
		} else {
			int act = ascenseurs[IdAsc].getEtageAct();
			ascenseurs[IdAsc].setEtageAct(act + 1);
			ascenseurs[IdAsc].setGoing_Up(true);
			ascenseurs[IdAsc].setGoing_Down(false);

		}
		return true;
	}

	/**
	 * Cette méthode retourne :
	 * True si l'assenceur peut encore descendre (on décrémenter le numero de l'étage)
	 * False si l'assenceur atteint la limite  
	 */
	@Override
	public boolean GoDown(int IdAsc) {
		if (ascenseurs[IdAsc].getEtageAct() <= 1) {
			ascenseurs[IdAsc].setGoing_Down(false);
			return false;
		} else {
			int act = ascenseurs[IdAsc].getEtageAct();
			ascenseurs[IdAsc].setEtageAct(act - 1);
			ascenseurs[IdAsc].setGoing_Up(false);
			ascenseurs[IdAsc].setGoing_Down(true);
		}
		return true;

	}

}
