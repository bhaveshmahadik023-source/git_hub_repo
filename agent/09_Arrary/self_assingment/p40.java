//decending or not

class Demo{
	public static void main(String[]args){
		int arr [] = {8,2,3,1,0};	
		boolean is_decending =true;
		
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]<arr[i+1]){
				is_decending = false;
				break;
			}
		}
		if(is_decending){
			System.out.println("yes is_decending");	
		}else{
			System.out.println("not is_decending");
		}
	}
}