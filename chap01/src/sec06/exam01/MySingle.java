package sec06.exam01;

public class MySingle {
	private static MySingle theInstance = new MySingle();
	
	private String name;
	
	private MySingle() {
		this.name="Hong Gil Dong";
	}
	
	public static MySingle getInstance() {
		return theInstance;
	}
	@Override
	public String toString() {
		return "MySingle[name=" + name + "]";
	}
	public static void main(String[] args) {
		MySingle hi = MySingle.getInstance();
		System.out.println(hi);

	}

}
