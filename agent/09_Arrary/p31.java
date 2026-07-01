class Demo{
	public static void main(String[]args){
		
		int arr []={30,35,49,38,9,558,68,5};
		
		int a=arr[2];
		arr[2]=arr[1];
	
		arr[1]=arr[0];
		arr[0]=a;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);	
	}
}