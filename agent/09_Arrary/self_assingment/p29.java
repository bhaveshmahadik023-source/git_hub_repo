//find value grater than targat

class Demo{
	public static void main(String[]args){
		int targat = 6;
		int arr [] = {1,1,1,1};
		boolean is_equal=true;

		for(int i=0;i<arr.length-1;i++){
			if(arr[i] != arr[i+1]){

				is_equal=false;
				break;
			}	
		}
		if(is_equal){
			System.out.println("equal");
		}else{
			System.out.println("not equal");
		}
	}
}