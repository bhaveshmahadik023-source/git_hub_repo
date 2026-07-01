//last_occurance

class Demo{
	public static void main(String[]args){
		int last_occ=0;	
		
		int arr [] = {1,2,2,2,2,2,2,3,4};
		int target=2;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==target){
				last_occ=i;
			}
		}
		System.out.println(last_occ);
	}
		
}