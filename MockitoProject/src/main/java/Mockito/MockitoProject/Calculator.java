package Mockito.MockitoProject;

public class Calculator {

	public CalculatorService service;
	public Calculator(CalculatorService service) {
		this.service = service;
	}
	
	
	
	public int perform(int i,int j) {
		return service.operation(i, j)*i;
	}
}
