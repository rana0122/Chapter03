package Set;

public class Value {
	private int a;
	private int b;
	public Value(int a,int b){
		this.a=a;
		this.b=b;
	}
	@Override
	public String toString() {
		return "Value [a=" + a + ", b=" + b + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		return result;
	}
	//hasCode()를 오버라이드 하지 않으면 똑같은 값이 들어간다.
	//즉, hashCode()는 그 값을 가진 객체가 같은 것인지 체크하는 기능이며, 이것이 equals()보다 훨씬 성능이 좋다.
	//이유는 객체 비교를 위해 비교할 대상이 적기때문이다.
	@Override
	public boolean equals(Object obj) {// 동일성 비교
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Value other = (Value) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
	}
	

}
