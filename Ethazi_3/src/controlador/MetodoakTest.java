package controlador;

import static org.junit.jupiter.api.Assertions.*;

import java.text.DecimalFormat;
import java.util.Calendar;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class MetodoakTest {

	@Test
	public void metodoakKoprobatu() {

	}
	public void konprobatuMD5() {
		
	}
	
	public void  konprobatuDistanciaCoord() {
		
	}
	public void prezioaKalkulatu() {
		
	}
	public void konprobatuNegatibo() {
		
	}
	public void kanbioMetodoa() {
		
	}
	public void konprobatuLetra() {
		
	}
	public void diruFalta() {
	
	}
	public void orduaAtera() {
		assertEquals(Metodoak.orduaAtera(), "9:57");
	}
	public void dataAtera() {
		assertEquals(Metodoak.dataAtera(), "13/02/2019");
	}
	public void Redondear() {
		double numero=10.99999;
		assertEquals(Metodoak.Redondear(numero), 11);
	}
	public void KalkulatuLetra() {
		int dni=12345678;
		assertEquals(Metodoak.KalkulatuLetra(dni), "Z");
	}
}
