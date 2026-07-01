// mid with if-else

class Demo{
	public static void main(String[]args){
		int arr [] ={10,54,98,88,65};
		int mid=arr.length/2;
		int left_mid = mid-1;
		
		if(arr.length%2==0){
			System.out.println(arr[mid]);
			System.out.println(arr[mid-1]);
		}else{
			System.out.println(arr[mid]);
		}
	}
}