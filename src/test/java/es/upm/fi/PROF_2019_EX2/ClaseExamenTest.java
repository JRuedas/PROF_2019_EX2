package es.upm.fi.PROF_2019_EX2;

import static org.junit.Assert.assertArrayEquals;

import java.util.List;

import org.junit.Test;

public class ClaseExamenTest {

	@Test
	public void shouldWorkInput6() {

		Integer[] expected = {2,3};

		List<Integer> result = ClaseExamen.primos(6);

		assertArrayEquals(result.toArray(), expected);
	}

	@Test
	public void shouldWorkInput13() {

		Integer[] expected = {13};

		List<Integer> result = ClaseExamen.primos(13);

		assertArrayEquals(result.toArray(), expected);
	}

	@Test
	public void shouldWorkInput25() {

		Integer[] expected = {5,5};

		List<Integer> result = ClaseExamen.primos(25);

		assertArrayEquals(result.toArray(), expected);
	}

	@Test(expected = EntradaInvalida.class)
	public void shouldFailInvalidInput() {

		ClaseExamen.primos(1);		
	}
}
