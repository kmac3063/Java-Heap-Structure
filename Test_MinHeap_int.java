class Test_MinHeap_int{
	public static void main(String[] args){
		MinHeap_int minHeap = new MinHeap_int();
		minHeap.add(3);
		minHeap.add(2);
		minHeap.add(1);
		minHeap.add(0);
		minHeap.add(0);
		minHeap.add(0);

		MinHeap_int minHeap2 = new MinHeap_int(minHeap);
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