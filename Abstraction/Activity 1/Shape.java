
abstract class Shape {
	private int field;
	private String value;
	public int getField() {
		return field;
	}
	public void setField(int field) {
		this.field = field;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
    abstract int  calculateArea(int value) ;
}
    
    
	