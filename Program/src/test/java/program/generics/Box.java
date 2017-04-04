package program.generics;

public class Box<T> {
	
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	//bounded type parameter
	
	public <U extends Number> void inspect(U u){
		System.out.println("T:"+obj.getClass().getName());
		System.out.println("U:"+u.getClass().getName());
	}

}
