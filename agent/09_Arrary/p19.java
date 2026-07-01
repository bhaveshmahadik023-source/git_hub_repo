class Demo{
	public static void main(String[]args){
		int arr []={25,88,97,68,2,27,3254};
		
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0){
				System.out.println(arr[i]+" odd");
				count++;
			}
		}
		System.out.println(count);
	}
}