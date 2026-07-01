//first occurance

class Deo{
	public static void main(String[]args){
		int targat=2;
		int arr [] = {5,2,3,2,4};
		int first_occ=0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==targat){
				first_occ=i;
				break;
			}
		}
		System.out.println(first_occ);
	}
}