class Demo{
	public static void main(String[]args){
		
		int arr []={30,35,49,38,9,558,68,5};
		
		int mod=arr[0];
		
		
		
		arr[0]=arr[arr.length/2];
		arr[arr.length/2]=mod;


		System.out.println(arr[arr.length/2]);
		System.out.println(arr[0]);
	}
}