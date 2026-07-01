//find value grater than targat

class Demo{
	public static void main(String[]args){
		int targat = 6;
		int arr [] = {1,4,5,3,8,9};

		for(int i=0;i<arr.length;i++){
			if(arr[i]>targat){
				System.out.println(arr[i]);
			}	
		}
	}
}