
public class Wykladowca extends Osoba {

	private String tytul;
	
	public Wykladowca( String imie, String nazwisko, int rokUrodzenia, String plec, String tytul ){
		super( imie, nazwisko, rokUrodzenia, plec );
		this.tytul = tytul;
	}

	@Override
	public String toString() {
		return "\nWykladowca\nTytul: " + tytul
				+ super.toString();
	}

	void setTytul( String tytul ){
		this.tytul = tytul;
	}
	
}
