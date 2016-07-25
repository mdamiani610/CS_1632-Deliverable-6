import static org.junit.Assert.*;
import org.mockito.*;
import org.junit.Test;

public class sieveTest {

	@Mock
    Sieve equivalenceClass1 = Mockito.mock(Sieve.class);
    Sieve equivalenceClass2 = Mockito.mock(Sieve.class);
    Sieve equivalenceClass3 = Mockito.mock(Sieve.class);
	
    //test to make sure that if the user enters a valid integer between 1 and 100 then the _max
    //variable is set to that integer
	@Test
	public void validInput() {
		String[] str = new String[1];
		str[0]="50";
		equivalenceClass1.main(str);
		assertTrue(equivalenceClass1._max==50);
		
	}
	
	//test to make sure that if the user enters an invalid integer not between 1 and 100 then 
	//the _max variable is set to 100
	@Test
	public void invalidInput() {
		String[] str = new String[1];
		str[0]="0";
		equivalenceClass2.main(str);
		assertTrue(equivalenceClass2._max==100);
		
	}
	
	//test to make sure that if the user enters a valid integer between 1 and 100 then the toReturn
    //variable is set to that integer
	@Test
	public void validInput2() {
		String[] str = new String[1];
		str[0]="50";
		int retval = equivalenceClass3.calculateMax(str);
		assertTrue(retval==50);
		
	}
	
	

}
