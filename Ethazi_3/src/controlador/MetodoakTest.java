package controlador;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MetodoakTest {

	@Test
	
	public void konprobatuMD5() {
		String pasahitza="abracadabra";
		assertEquals(Metodoak.ateraMD5(pasahitza),("ec5287c45f0e70ec22d52e8bcbeeb640"));
	}
	@Test
	public void  konprobatuDistanciaCoord() {
		 double lng1=-2.94974;
		 double lat1=43.2614;
		 double lng2=-2.99149;
		 double lat2=43.3191;
		assertEquals(Metodoak.distanciaCoord(lng1, lat1, lng2, lat2),7.251413598425656);
	}
	@Test
	public void prezioaKalkulatu() {
		double distantzia=7.251413598425656;
		double kontsumo_bus=0.32;
		int bidaiariak=40;
		assertEquals(Metodoak.prezioaKalkulatu(distantzia, kontsumo_bus, bidaiariak), 0.05569085643590904);
		
	}
	@Test
	public void konprobatuNegatibo() {
		assertEquals(Metodoak.konprobatuNegatibo(2),(true));
	}
	@Test
	public void kanbioMetodoa() {
		assertEquals(Metodoak.kanbioMetodoa(388.88),Metodoak.kanbioMetodoa(388.88));
	}
	@Test
	public void konprobatuLetra() {
		
		assertEquals(Metodoak.konprobatuLetra("dfsdfs"),(true));
	}
	@Test
	public void diruFalta() {
		double zbk=5;
		double prezioa=10;
		assertEquals(Metodoak.diruFalta(zbk, prezioa), true);
	}
	@Test
	public void orduaAtera() {
		assertEquals(Metodoak.orduaAtera(), Metodoak.orduaAtera());
	}
	@Test
	public void dataAtera() {
		assertEquals(Metodoak.dataAtera(), Metodoak.dataAtera());
	}
	@Test
	public void Redondear() {
		double numero=10.99999;
		assertEquals(Metodoak.Redondear(numero), 11);
	}
	@Test
	public void KalkulatuLetra() {
		int dni=12345678;
		assertEquals(Metodoak.KalkulatuLetra(dni), "Z");
	}
}
