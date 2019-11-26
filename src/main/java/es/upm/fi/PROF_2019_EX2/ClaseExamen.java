package es.upm.fi.PROF_2019_EX2;

import java.util.ArrayList;
import java.util.List;

public class ClaseExamen {

	public static List<Integer> primos (int n) {

		if (n <= 1) {
			throw new EntradaInvalida("La entrada no es valida: " + n);
		}

		List<Integer> factors = new ArrayList<Integer>();

		for (int i = 2; i <= n; i++) {
			while(n % i == 0) {
				factors.add(i);
				n /= i;
			}
		}

		return factors;
	}
}
