//count of total targat

class Demo{
	public static void main(String[]args){
		int arr [] = {1,2,2,3,2};
		int count =0;
		int targat=2;
		
		for(int i =0 ;i<arr.length;i++){	
			if(arr[i]==targat){
				count++;
			}
		}
		System.out.println(count);
	}	
}