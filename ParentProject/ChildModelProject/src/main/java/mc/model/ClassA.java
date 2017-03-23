package mc.model;

import java.math.BigDecimal;



public class ClassA {
	private BigDecimal someString;
    private String opala;
	private BigDecimal someId;
	private ClassB b;
	
	public ClassA() {
		someString = new BigDecimal(Math.random());
		someId=new BigDecimal(Math.random());
		b=new ClassB();
	}
	
	public BigDecimal getSomeString() {
		return someString;
	}
	public void setSomeString(BigDecimal someString) {
		this.someString = someString;
	}
	public BigDecimal getSomeId() {
		return someId;
	}
	public void setSomeId(BigDecimal someId) {
		this.someId = someId;
	}
	public ClassB getB() {
		return b;
	}
	public void setB(ClassB b) {
		this.b = b;
	}


	
}
