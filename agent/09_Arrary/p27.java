class Demo{
	public static void main(String[]args){
		int max=0;
		int arr []={30,35,49,38,30,9,6};
		
		for(int i=0;i<=(arr.length-1);i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println(max);
	}
}