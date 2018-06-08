import java.util.LinkedList;
import java.util.ListIterator;

public class AssemblyLine {
	public int capacity;
	public int maxWeight;
	public LinkedList<Component> line;
	
	
	public AssemblyLine( int capacity, int maxWeight ) {
		this.capacity = capacity;
		this.maxWeight = maxWeight;
		line = new LinkedList<Component>();
	}
	
	
	public int getSize() {
		return line.size();
	}
	
	public int getWeight() {
		ListIterator<Component> it = line.listIterator();
		int weight = 0;
		while(it.hasNext()) {
			weight = weight + it.next().weight;
		}
		return weight;
	}
	
	public Component take() {
		/* 
		 * TODO
		 * the method should put a component on the line
		 * */
		return null;
	}
	
	public void put( Component component ) {
		if( line.size() < this.capacity &&
				this.getWeight() + component.weight <= this.maxWeight ) {
			line.addFirst(component);
			System.out.println("Componenta " + component.name + " a fost adaugata cu succes!" );
		} else {
			System.out.println("Capacitatea sau greutatea maxima au fost depasite!");
		}
	}
}
