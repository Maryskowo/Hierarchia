
public class Stypendysta extends Student{

	private double kwota;
	
	public Stypendysta( String imie, String nazwisko, int rokUrodzenia, String plec, int indeks, double kwota ){
		super( imie, nazwisko, rokUrodzenia, plec, indeks );
		this.kwota = kwota;
	}

	
	
	@Override
	public String toString() {
		return super.toString() + "\nKwota: " + kwota;
	}
	
	void setKwota ( double kwota ){
		this.kwota = kwota;
	}
}
