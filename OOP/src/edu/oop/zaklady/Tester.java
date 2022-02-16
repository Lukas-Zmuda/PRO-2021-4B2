package edu.oop.zaklady;

public class Tester {

	public static void main(String[] args) {
		
		//deklaracia objektu;
		Student s1;
		
		//inicializacia objektu
		s1 = new Student();
		
		s1.meno = "Jan";
		s1.priezvisko = "Hrasko";
		s1.pohlavie = 'm';
		s1.skupina = 1;
		s1.trieda = "I.A";
		s1.vek = 16;
		//System.out.println("Meno ziaka: " + s1.meno);
		
		s1.vypisInfo();
		Student s2 = new Student();
		
		//nainicializovat s2
		s2.meno = "Fero";
		s2.priezvisko = "Mravec";
		s2.pohlavie = 'm';
		s2.skupina = 2;
		s2.trieda = "I.C";
		s2.vek = 17;
		
		System.out.println("--------------");
		s2.vypisInfo();
		//deklarovat a inicializovat s3
		
		
		

	}

}
