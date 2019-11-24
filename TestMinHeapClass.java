class TestMinHeapClass{
	public static void main(String[] args){
		MinHeap minHeap = new MinHeap();
		minHeap.add(10);
		System.out.println("1 " + minHeap.getMin());
		minHeap.add(20);
		minHeap.add(100);
		System.out.println("2 " + minHeap.getMin());
		minHeap.add(0);
		System.out.println("3 " + minHeap.getMin());
		minHeap.add(-123);
		System.out.println("4 " + minHeap.getMin());
		minHeap.popMin();
		System.out.println("5 " + minHeap.getMin());
		/*minHeap.add(0);
		minHeap.add(0);
		System.out.println("6 " + minHeap.size());
		
		minHeap.println();
		MinHeap minHeap2 = new MinHeap(minHeap);
		minHeap.clear();
		
		System.out.println("7 " + minHeap.empty());
		System.out.println("8 " + minHeap.size());

		System.out.println("9 " + minHeap2.empty());
		System.out.println("10 " + minHeap2.size());*/
	}
}