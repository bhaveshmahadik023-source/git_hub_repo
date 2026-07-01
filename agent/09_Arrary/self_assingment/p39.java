//accending or not

class Demo{
	public static void main(String[]args){
		boolean is_accending =true;
	
		int arr []={3,5,7,8,4};
	
		for(int i= 0 ; i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
				is_accending=false;
				break;
			}
		}
		if(is_accending){
			System.out.println("yes accending");	
		}else{
			System.out.println("not accending");
		}
	}
}