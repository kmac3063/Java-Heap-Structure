import java.util.ArrayList;

public class MinHeap{
	private ArrayList<Integer> array;
	private int size;

	public MinHeap() {
		this(10);
	}

	public MinHeap(int n) {
		array = new ArrayList<>(n);
		size = 0;
	}

	public MinHeap(MinHeap baseHeap){
		size = baseHeap.size;
		array = new ArrayList<>(baseHeap.array);
	}

	public MinHeap(ArrayList<Integer> baseArray){
		size = baseArray.size();
		array = new ArrayList<>(baseArray);

		for (int i = array.size() / 2; i >= 0 ; i--){
			array.add(baseArray.get(i));
		}	
	}

	public void add(int el){
		size++;

		if (size - 1 < array.size()) {
			array.set(size - 1, el);
		}
		else {
			array.add(el);
		}

		siftUp(array.size() - 1);
	}

	public int get(){
		if (empty()) 
			throw new RuntimeException();

		return array.get(0);
	}

	public void pop(){
		if (empty()) 
			throw new RuntimeException();

		array.set(0, array.get(--size));
		siftDown(0);
	}

	public void clear(){
		size = 0;
	}

	public int size(){
		return size;
	}

	public boolean empty(){
		return size == 0;
	}

	public void print(){
		System.out.println();
		System.out.println("Size: " + size);
		for (int i = 0; i < size; i++){
			System.out.print(array.get(i) + " ");
			
			if ((i + 1) % 10 == 0)
				System.out.println();
		}

		System.out.println();
		if ((size % 10) != 0)
			System.out.println();

	} 

	private void siftUp(int ind) {
		int ind_par = (ind - 1) / 2;

		while (array.get(ind) < array.get(ind_par)){
			int t = array.get(ind);
			array.set(ind, array.get(ind_par));
			array.set(ind_par, t);

			ind = ind_par;
			ind_par = (ind - 1) / 2;
		}
	}

	private void siftDown(int ind) {
		int firstChildInd = ind * 2 + 1;
		int secondChildInd = ind * 2 + 2;
		int lowestChildInd = ind;

		while (firstChildInd < size){
			ind = lowestChildInd;
			firstChildInd = ind * 2 + 1;
			secondChildInd = ind * 2 + 2;
		
			if (firstChildInd < size &&
				array.get(firstChildInd) < array.get(lowestChildInd)) {
				
				lowestChildInd = firstChildInd;
			}

			if (secondChildInd < size && 
				array.get(secondChildInd) < array.get(lowestChildInd)) {
				
				lowestChildInd = secondChildInd;
			}

			if (lowestChildInd == ind) {
				break;
			}

			int t = array.get(lowestChildInd);
			array.set(lowestChildInd, array.get(ind));
			array.set(ind, t);
		}
	}
}