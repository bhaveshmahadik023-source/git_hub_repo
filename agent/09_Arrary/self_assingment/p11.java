//sorting or not (logic-2)

class Demo{
	public static void main(String[]args){

		int arr []={5,6,5,8,9};
		
		boolean is_sorted=true;
		for(int i=0;i<arr.length-2;i++){
			
		
			if(arr[i+1]<arr[i]){
				is_sorted=false;
				break;
			}
		}
		if(is_sorted){
			System.out.println("sorted");	
		}else{
			System.out.println("not sorted");
		}
	}
}