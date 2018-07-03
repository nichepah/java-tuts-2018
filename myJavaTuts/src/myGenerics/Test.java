package myGenerics;

public class Test<T>{
	T myObject; 
	
	public Test(T obj) {
		// TODO Auto-generated constructor stub
		this.myObject = obj;
	}
	
	public T getObject() {
		return(this.myObject);
	}

}
