package ejercicioStreamsNumericos07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlumnoServiceTest {
	AlumnoService alumnoService=new AlumnoService();
	int aprobados=3;
	@Test
	void test() {
		assertEquals(aprobados, alumnoService.getInfoAlumnosAprobados().size());
	}
	@Test
	void testMalMatematico() {
		//Alumnos con matematicas suspensas
//		alumnoService.getInfoAlumnosAprobados().
	}
	@Test
	void testBuenaLengua() {
		//Alumnos con lengua e ingles aprobadas
	}
	
	@Test
	void testResponse() {
		assertEquals(aprobados, alumnoService.getInfoAlumnosAprobados().size());
		//COmprobar las materias suspensas
	}
	@Test
	void testEstadistica() {
		/*
		 * pocentaje de alumnos por numero de materias suspensas
		 * cuantos con cero, con una, etc.
		 */
	}

	@Test
	void testNotables() {
		/*
		 * porcentaje de alumnos con nota media de notable
		 */
	}
}
