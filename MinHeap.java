import java.util.ArrayList;

public class MinHeap{
	private ArrayList<Integer> array = new ArrayList<Integer>();

	public MinHeap() {}

	public MinHeap(MinHeap baseHeap){
		for (int el : baseHeap.array){
			array.add((int)el);
		}
	}

	public MinHeap(ArrayList<Integer> baseArray){
		for (int i = 0; i < baseArray.size(); i++){
			array.add((int)baseArray.get(i));
		}

		for (int i = baseArray.size() / 2; i >= 0 ; i--){
			array.add((int)baseArray.get(i));
		}	
	}

	public void add(int el){
		array.add(el);
		siftUp(array.size() - 1); 
	}

	public int getMin(){
		if (empty()) throw new RuntimeException();

		return array.get(0);
	}

	public void popMin(){
		if (empty()) throw new RuntimeException();

		array.set(0, array.get(array.size() - 1));
		siftDown(0);
	}

	public void clear(){
		array.clear();
	}

	public int size(){
		return array.size();
	}

	public boolean empty(){
		return array.size() == 0;
	}

	public void println(){
		int size = array.size();
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
		int lowestChildInd = firstChildInd;

		System.out.println(array.get(lowestChildInd) + " " + array.get(firstChildInd) + " " + array.get(secondChildInd));

		while (ind != lowestChildInd){
			ind = lowestChildInd;
			firstChildInd = ind * 2 + 1;
			secondChildInd = ind * 2 + 2;
		
			if (firstChildInd < array.size() && array.get(firstChildInd) < array.get(lowestChildInd)) {
				lowestChildInd = firstChildInd;
			}

			if (secondChildInd < array.size() && array.get(secondChildInd) < array.get(lowestChildInd)) {
				lowestChildInd = secondChildInd;
			}

			System.out.println("---" + array.get(lowestChildInd) + " " + array.get(ind) + "---");
			int t = array.get(lowestChildInd);
			array.set(lowestChildInd, array.get(ind));
			array.set(ind, t);
			System.out.println("---" + array.get(lowestChildInd) + " " + array.get(ind) + "---");
		}
	}
}