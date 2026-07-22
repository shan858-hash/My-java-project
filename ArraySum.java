class ArraySum{
	public static void main(String[] args){
		int[] numbers={5,4,6,3,8,5};
		int sum=0;
		for(int i=0;i<numbers.length;i++){
			sum+=numbers[i];
		}
		System.out.println("The sum of number: "+sum);
	}
}