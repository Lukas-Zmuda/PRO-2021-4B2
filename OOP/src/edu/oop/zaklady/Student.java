package edu.oop.zaklady;

public class Student {
	
	//vlastnosti
	//instancne premenne
	String meno;
	String priezvisko;
	char pohlavie;
	String trieda;
	int skupina;
	int vek;
	
	//schopnosti
	//metody
	
	void vypisInfo() {
		System.out.println("Meno: " + meno);
		System.out.println("Priezvisko: " + priezvisko);
		System.out.println("Pohlavie: " + pohlavieSlovom());
		System.out.println("Trieda: " + trieda);
		System.out.println("Skupina: " + skupina);
		System.out.println("Vek: " + vek);
	}
	
	String pohlavieSlovom() {
		switch(pohlavie) {
		case 'm':
			return "muz";
		case 'z':
			return "zena";
		case 'n':
			return "neuvadza";
		default:
			return "nezname";
		}
	}
	/**
	 * Metoda vypis informacie o triede ziaka v tvare:
	 * Meno Priezvisko: Trieda, Skupina. skupina
	 * 
	 */
	void infoTrieda() {
		
	}
	/**
	 * Metoda vrati true v pripade, ze je student plnolety
	 * @return
	 */
	boolean plnolety() {
		
	}

}
