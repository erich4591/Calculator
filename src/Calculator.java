
public class Calculator {

	public static void main(String[] args) {
		CalculatorView theView = new CalculatorView();
		CalculatorModel theModel = new CalculatorModel();
		CalculatorController theController = new CalculatorController(theView, theModel);
		
		theView.setResizable(false);
		theView.setVisible(true);

	}

}
