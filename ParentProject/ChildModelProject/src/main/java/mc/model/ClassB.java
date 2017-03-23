package mc.model;

import java.math.BigDecimal;



public class ClassB {
	private BigDecimal someString;

	private BigDecimal someId;
	
	public ClassB () {
		someString= new BigDecimal(Math.random());
		someId=new BigDecimal(Math.random());
		
		
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


	
	
}
