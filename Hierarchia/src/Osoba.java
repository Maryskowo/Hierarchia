
public class Osoba {

	private String imie;
	private String nazwisko;
	private int rokUrodzenia;
	private String plec;
	
	public Osoba( String imie, String nazwisko, int rokUrodzenia, String plec){
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.rokUrodzenia = rokUrodzenia;
		this.plec = plec;
	}


	
	public String toString() {
		return "\nImie: " + imie + ",\nNazwisko: " + nazwisko
				+ ",\nRok urodzenia: " + rokUrodzenia + ",\nPlec: " + plec;
	}
	
	void setImie( String imie ){
		this.imie = imie;
	}
	
	void setNazwisko( String nazwisko ){
		this.nazwisko = nazwisko;
	}
	
	void setRokUrodzenia( int rokUrodzenia ){
		this.rokUrodzenia = rokUrodzenia;
	}
	
	void setPlec( String plec ){
		this.plec = plec;
	}
}
