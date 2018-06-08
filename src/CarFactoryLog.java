
public class CarFactoryLog {
	public static void main(String[] args) {
		AssemblyLine assemblyLine = new AssemblyLine(3,16);
		
		assemblyLine.put(new Component("usa",4));
		assemblyLine.put(new Component("motor",10));
		assemblyLine.put(new Component("capota",3));
		
		
		assemblyLine.take();
		assemblyLine.put(new Component("capota",3));
		
		
	}
}

