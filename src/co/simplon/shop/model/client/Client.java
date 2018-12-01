package co.simplon.shop.model.client;

import co.simplon.shop.model.common.Entity;

public class Client  extends Entity{	

	private static final long serialVersionUID = 1L;
	
	private String name;
	private float credit;
	
	public Client(String name, float initialCredit)
	{
		this.setName(name);
		this.setCredit(initialCredit);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getCredit() {
		return credit;
	}

	public void setCredit(float credit) {
		this.credit = credit;
	}
	
	@Override
	public String toString() {		
		return name+" "+credit;
	}
	
	//Qu'est ce qui nous permet de dire qu'un client est le même qu'un autre
	//Ici je choisi de dire que si le nom et le solde sont identiques alors oui
	//ON pourrait simplement utiliser un numéro de secu ou autre identifiant
	//Dans la modelisation des classes on ne parle pas d'identifiant de base de donnée
	//ON s'en fiche, c'est un truc technique propre au SQL, le jour où on stocke les client autrement
	//ca n'a pas de sens
	@Override
	public boolean equals(Object obj) {
		
		//bah oui ca peut arriver
		if( obj == null) return false;
	
		Client aClient = (Client)obj;
		//Uilisation de l'operateur ternaire, plus concis
		return aClient.name==this.name && aClient.credit == this.credit ? true : false;
	}
}
