//element is negative

class Demo{
	public static void main(String[]args){
		int arr [] = {-1,2,3,4};
		boolean is_negative=false;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]<0){
				is_negative=true;
				break;
			}
		}
		if(is_negative){
			System.out.println("true");	
		}else{
			System.out.println("false");
		}
	}	
}