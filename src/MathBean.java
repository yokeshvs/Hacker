
public class MathBean {
	private double operand1;
	private double operand2;
	private String operation;
	private double result;
	public double getOperand1() {
		return operand1;
	}
	public void setOperand1(double operand1) {
		this.operand1 = operand1;
	}
	public double getOperand2() {
		return operand2;
	}
	public void setOperand2(double operand2) {
		this.operand2 = operand2;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
	//5
//	public double calculate() {
//		result = 0;
//		try {
//			switch (operation) {
//			case "plus":
//				result = operand1 + operand2;
//				return result;
//
//			default:
//				return 0;
//			}
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//	}
}
