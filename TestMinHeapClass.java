class TestMinHeapClass{
	public static void main(String[] args){
		MinHeap minHeap = new MinHeap();
		minHeap.add(3);
		minHeap.add(2);
		minHeap.add(1);
		minHeap.add(0);
		minHeap.add(0);
		minHeap.add(0);

		MinHeap minHeap2 = new MinHeap(minHeap);
		int i = 1;
		while (!minHeap.empty()){
			System.out.println(i++ + "| " + minHeap.get());
			minHeap.pop();	
		}

		i = 1;
		while (!minHeap2.empty()){
			System.out.println(i++ + "| " + minHeap2.get());
			minHeap2.pop();	
		}
		
	}
}