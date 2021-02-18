package test.ikbel.services;

import test.ikbel.entities.Ascenseur;

/**
 * L'interface IIAscenseur contient les méthodes 
 * à développer dans la classe d'implimentation
 * 
 */
public interface IAscenseur {

	public Ascenseur[] AfficherLesAscenseur();

	public Ascenseur[] IntialiserSysteme();

	public int AfficherEtageActuel(int IdAsc);

	public boolean GoUp(int IdAsc);

	public boolean GoDown(int IdAsc);

}
