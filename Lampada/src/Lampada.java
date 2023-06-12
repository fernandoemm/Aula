
public class Lampada {
	private boolean acesa;	// atributo
	
	public void acender() {	// método público
		this.acesa = true;
	}
	public void apagar() {	// método público
		this.acesa = false;
	}
	public Lampada(boolean acesa) {	// método construtor da classe
		this.acesa = acesa;
	}
	public boolean isAcesa() {	// "getter é is para boolean"
		return acesa;
	}
	public void setAcesa(boolean acesa) {	// setter
		this.acesa = acesa;
	}
	public static void main(String[] args) {
		int cont = 1; // variável local
		Lampada lamp1 = new Lampada(true);	//instanciando objeto
		Lampada lamp2 = new Lampada(false);	// instanciando objeto
		
		while (cont < 5) {
			System.out.println("-- Iteração (repetição): " + cont);
			System.out.println("Lâmpada [lamp1] = " + (lamp1.isAcesa()?"acesa":"apagada"));
			System.out.println("Lâmpada [lamp2] = " + (lamp1.isAcesa()?"acesa":"apagada"));
			System.out.println();
			lamp1.setAcesa(!(lamp1.isAcesa()));	// troca o estado de lamp1
			lamp2.setAcesa(!(lamp2.isAcesa()));	// troca o estado de lamp2
			cont++;	// incrementa cont em 1
		}
		
	}
}
