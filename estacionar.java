package estacionamiento;

public class estacionar {
	private int estacionamiento[]=new int [20];
	private int lugar;
	private int estacionados=0;
	private int retorno;
	private boolean tope=true;
	private int cuenta=0;
	
	public int estacionando(int [] autos) {
		//cuenta autos
		while (tope) {
			if (autos[cuenta]==0) {
				tope=false;
			}else {
				cuenta++;
			}
		}
		
		for (int i=0; i<cuenta; i++) {
			lugar = autos[i]%20;
			//System.out.println("");
			//System.out.println(autos[i] + " en el lugar " + lugar);
			if (estacionamiento[lugar]== 0) {
				estacionamiento[lugar]=autos[i];
				estacionados++;
			}else {
				//System.out.println("xxxxxxxxxxxxxxx  colision  xxxxxxxxxxxxxxxxx");
				i=20;
				retorno = 0;
			}
			if (estacionados==cuenta) {retorno=-1;}
		}
		
		for (int a = 0 ; a<20; a++) {
			System.out.print(estacionamiento[a] + "||");
		}
		System.out.println("");
		System.out.println("la cantidad de autos es " + cuenta);
		System.out.println("autos estacionados " + estacionados);
		
		return retorno;
		
	}
	
	
	public int estacionandosinprint(int [] autos) {
		//cuenta autos
		while (tope) {
			if (autos[cuenta]==0) {
				tope=false;
			}else {
				cuenta++;
			}
		}
		
		for (int i=0; i<cuenta; i++) {
			lugar = autos[i]%20;
			//System.out.println("");
			//System.out.println(autos[i] + " en el lugar " + lugar);
			if (estacionamiento[lugar]== 0) {
				estacionamiento[lugar]=autos[i];
				estacionados++;
			}else {
				//System.out.println("xxxxxxxxxxxxxxx  colision  xxxxxxxxxxxxxxxxx");
				i=20;
				retorno = 0;
			}
			if (estacionados==cuenta) {retorno=-1;}
		}
		
		//for (int a = 0 ; a<20; a++) {
			//System.out.print(estacionamiento[a] + "||");
		//}
		//System.out.println("");
		//System.out.println("la cantidad de autos es " + cuenta);
		//System.out.println("autos estacionados " + estacionados);
		
		return retorno;
		
	}
	
public estacionar() {
	
}
}
