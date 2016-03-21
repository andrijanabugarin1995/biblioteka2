package Biblioteka;

public class Autor {
	private String imePrezime;
	private String zemljaPorekla;

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public String getZemljaPorekla() {
		return zemljaPorekla;
	}

	public void setZemljaPorekla(String zemljaPorekla) {
		this.zemljaPorekla = zemljaPorekla;
	}

	@Override
	public String toString() {
		return "Autor [imePrezime=" + imePrezime + ", zemljaPorekla=" + zemljaPorekla + "]";
	}

	
}
