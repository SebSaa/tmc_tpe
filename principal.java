package estacionamiento;

public class principal {
	private static int resultado;
	public static void main(String[] args) {
		int arreglo[];
		int nuevosautos[];
		int estaciona = 0;
		int vuelta=0;
		double dif = 10;
		double epsilon = 0.01;
		double casofavorablediez=0;
		double casofavorablecien=0;
		double casofavorablemil=0;
		double resultadolaplacediez;
		double resultadolaplacecien;
		double resultadolaplacemil;
		double resante =0;

		
		patentes numeros= new patentes(5);
		arreglo = numeros.getnumpatente();
		//numeros.mostrar_patentes(arreglo);
		
		estacionar estautos  = new estacionar();
		resultado = estautos.estacionando(arreglo);	
		//System.out.println("numero retornado " + resultado);
		
		
		System.out.println("sobre 10 casos");
		for (int i = 0; i<10; i++) {
			patentes laplace = new patentes(10);
			nuevosautos = laplace.getnumpatente();
			
			estacionar losnuevosautos = new estacionar();
			estaciona = losnuevosautos.estacionando(nuevosautos);	

			if (estaciona !=-1) {
				casofavorablediez++;
			}
		}
		resultadolaplacediez = casofavorablediez / 10;
		
		
		System.out.println("sobre 100 casos");
		for (int i = 0; i<100; i++) {
			patentes laplace = new patentes(10);
			nuevosautos = laplace.getnumpatente();
			
			estacionar losnuevosautos = new estacionar();
			estaciona = losnuevosautos.estacionando(nuevosautos);	

			if (estaciona !=-1) {
				casofavorablecien++;
			}
		}
		resultadolaplacecien = casofavorablecien / 100;
		
		
		System.out.println("sobre 1000 casos");
		for (int i = 0; i<1000; i++) {
			patentes laplace = new patentes(10);
			nuevosautos = laplace.getnumpatente();
			
			estacionar losnuevosautos = new estacionar();
			estaciona = losnuevosautos.estacionando(nuevosautos);	

			if (estaciona !=-1) {
				casofavorablemil++;
			}
		}
		
		resultadolaplacemil = casofavorablemil / 1000;
		System.out.println("Casos favorable: " + casofavorablediez + " / sobre 10 casos " + resultadolaplacediez);
		System.out.println("Casos favorable: " + casofavorablecien + " / sobre 100 casos " + resultadolaplacecien);
		System.out.println("Casos favorable: " + casofavorablemil + " / sobre 1000 casos " + resultadolaplacemil);
		
		// && vuelta>10
		while (dif>epsilon || vuelta<=10) {
				patentes laplace = new patentes(10);
				nuevosautos = laplace.getnumpatente();
				
				estacionar losnuevosautos = new estacionar();
				estaciona = losnuevosautos.estacionandosinprint(nuevosautos);	

				if (estaciona !=-1) {
					casofavorablemil++;
				}
			
			
			resultadolaplacemil = casofavorablemil / 100;
			dif = resultadolaplacemil - resante;
			if (dif<0) {dif=dif*-1;}
			vuelta++;
			System.out.println("anterior " + resante + " nuevo " + resultadolaplacemil);
			System.out.println("**   DIFERENCIA  ********************** " + dif + " VUELTA " + vuelta);
			
			resante = resultadolaplacemil;
			
		}
		
		

	}

}

