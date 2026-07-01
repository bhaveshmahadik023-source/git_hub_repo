class Demo{
	public static void main(String[]args){
		int arr []={30,35,49,56,65,78};
		
		int mid=arr.length/2;
		int left_mid=mid-1;
		
		System.out.println(arr[mid]);
		System.out.println(arr[left_mid]);
	
	
		System.out.println("---------------");
		int third=mid;
		mid=left_mid;
		
		left_mid=third;
	
		
		System.out.println(arr[mid]);
		System.out.println(arr[left_mid]);
		
	}
}