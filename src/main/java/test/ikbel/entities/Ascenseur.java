package test.ikbel.entities;

import java.io.Serializable;

public class Ascenseur implements Serializable {
	
	/**
	 * Un Ascenceur est définie par :
	 * Id , Etat ,Etage
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int Id;
	private int EtageAct;
	private boolean Going_Up;
	private boolean Going_Down;
	
	
	/**
	 * Constructeur paramétré
	 * 
	 */

	public Ascenseur(int id, int etageAct, boolean going_Up, boolean going_Down) {
		super();
		Id = id;
		EtageAct = etageAct;
		Going_Up = going_Up;
		Going_Down = going_Down;
	}
	
	
	
	/**
	 * Les Getters && Setters
	 */

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getEtageAct() {
		return EtageAct;
	}

	public void setEtageAct(int etageAct) {
		EtageAct = etageAct;
	}

	public boolean isGoing_Up() {
		return Going_Up;
	}

	public void setGoing_Up(boolean going_Up) {
		Going_Up = going_Up;
	}

	public boolean isGoing_Down() {
		return Going_Down;
	}

	public void setGoing_Down(boolean going_Down) {
		Going_Down = going_Down;
	}



	/**
	 * On surcharge la méthode to String 
	 * 
	 * 
	 */
	
    @Override
	public String toString() {
		return "Ascenseur [Id=" + Id + ", EtageAct=" + EtageAct + ", Going_Up=" + Going_Up + ", Going_Down="
				+ Going_Down + "]";
	}
	
	

}

