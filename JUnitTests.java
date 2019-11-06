import static org.junit.Assert.*;

public class JUnitTests {

	@Test
	public void testStatement(){
		Movie starwars = new Movie("Star Wars: Vingança dos Sith", 1);
		Movie branquelas = new Movie("As Branquelas", 2);
		Movie iluminado = new Movie("O Iluminado", 1);

		Rental swR = new Rental(starwars, 8);
		Rental bR = new Rental(branquelas, 8);
		Rental ilR = new Rental(iluminado, 8);

		Customer eu = new Customer("Thiago");
		eu.addRental(swR);
		eu.addRental(bR);
		eu.addRental(ilR);

		String saidaEsperada = "";

		saidaEsperada = "Rental Record for Thiago\n" +
		"	Star Wars: Vingança dos Sith	24.0\n" +
		"	As Branquelas	9.0\n" +
		"	O Iluminado	24.0\n" +
		"Amount owed is 57.0\n" +
		"You earned 5 frequent renter points";

		assertEquals(me.statement(), saidaEsperada);
	}
}