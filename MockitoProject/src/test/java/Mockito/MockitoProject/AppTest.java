package Mockito.MockitoProject;

import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;


public class AppTest 
    
{
	
	static Calculator calculator = null;
    CalculatorService service = Mockito.mock(CalculatorService.class);

    @Before
    public  void setup(){
         calculator = new Calculator(service);
         System.out.println("Constructing the class before testing");
    }

   
	
	
/*	@BeforeClass
	public void beforeclass() {
		calculator = new Calculator();
		System.out.println("Constructing the class before test");
	}
	*/
	
	@Test
	public void testadd() {
		System.out.println("Testing add method");
		when(service.operation(2, 3)).thenReturn(5);
		assertEquals(10,calculator.perform(2, 3));
		//verify(service).operation(2,3);
		
	}
	
    

    
}
