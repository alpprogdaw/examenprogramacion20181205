package fp.daw.examen;

public class Ejercicio6 {

	/* 
	 *  2,5 puntos
	 * 
	 * Escribe en el método 'main' un programa que cree un vector de números enteros de un
	 * tamaño aleatorio comprendido entre 100 y 500. Una vez creado lo llenará llenará con
	 * números aleatorios comprendidos entre 0 y 1000000. Después de llenar el vector 
	 * mostrará la mínima diferencia entre dos valores adyacentes. La diferencia entre dos
	 * valores adyacentes se calcula como el valor almacenado en cada posición [i] (excepto
	 * la primera) menos el valor almacenado en la posición [i-1].
	 */
		
	public static void main(String[] args) {
		
		int a = (int) (Math.random() * 500);
		int vector [] = new int[a]; 
		int diferencia = 0;
		
		for (int i = 0; i<vector.length -1;i++) {
			vector[i] = (int) (Math.random() * 1000000);
			for (int j=1; j<vector.length -1; j++) {
				diferencia = vector[i] - vector[i -1];
			}
			if (vector[i] == 0) {
				diferencia = i;
			}
			else if (vector [i] < 1) {
				diferencia = vector [i] - vector [i-1];
			}
			System.out.println("El numero en la posicion [" +  i + "]" + " es el " +  vector[i]);
		}
		System.out.println("La diferencia " + diferencia);

	}

}
