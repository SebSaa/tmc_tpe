package estacionamiento;
public class patentes {
	private int MAXNUM;
	private int autos;
	int arautos[]=new int [10000];
	private int cuenta=0;
	private int entrante;
	int repetido =0 ;

	public int[] getnumpatente() {
		while (cuenta<autos) {
			repetido=0;
			entrante=(int)(Math.random()*MAXNUM+1);
			if (cuenta==0) {
				arautos[cuenta]=entrante;
			}
			//System.out.println("E: " + entrante);
			for (int i=0; i<cuenta ; i++) {
				if (entrante==arautos[i]) {
					//System.out.println("hay un numero repetido");
					repetido=1;
					//System.out.println("1 - auto " + cuenta + " patente " + entrante);
					cuenta--;
					//System.out.println("2 - auto " + cuenta + " patente " + entrante);

				}
			}
			//System.out.println("3 - cuenta " + cuenta + " entrante " + entrante);
			if (repetido==0) {
				arautos[cuenta]=entrante;
				//System.out.println("SE GUARDA EL NUMERO " + entrante + "  - auto " + cuenta + " patente " + entrante);
				cuenta++;
			}
			//System.out.println("4 - cuenta " + cuenta + " entrante " + entrante);

		}
	return arautos;
	}
	
	public void mostrar_patentes(int [] arreglo) {
		for (int i=0; i<arreglo.length;i++) {
			System.out.print(arreglo[i]+ " * ");
		}
	}
	
	
	public patentes (int cant) {
		MAXNUM = 999;
		autos = cant;
	}
}
