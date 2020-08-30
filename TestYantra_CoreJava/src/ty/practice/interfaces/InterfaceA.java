package ty.practice.interfaces;

public interface InterfaceA {

	public abstract void B(int a);

	public static void m() {
		System.out.println("Static method");
	}
	
	default void d() {
		System.out.println("Default method");
	}

}
