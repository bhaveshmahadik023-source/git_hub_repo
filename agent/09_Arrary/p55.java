//first occurance

class Demo{
	public static void main(String[]args){
		int last_occ=0;	
		boolean is_found=false;
		int arr [] ={1,5,9,7,9,7,8,9,2,2,2,3,4};
		int target=2;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==target){
				last_occ=i;
				is_found=true;
				break;
			}
		}
		if(is_found){
			System.out.println(last_occ);
		}else{
			System.out.println("target is not found");
		}
	}
		
}