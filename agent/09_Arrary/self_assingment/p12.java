//sorting or not(logic-3)

class Demo{
	public static void main(String[]args){

		int arr []={5,6,7,8,9};
		boolean is_sorted = true;
		int privious=0;

		for(int i=0;i<arr.length;i++){
			if(arr[i]<privious){
				is_sorted=false;
				break;
			}
		privious=arr[i];	
		}
		if(is_sorted){
			System.out.println("sorted");	
		}else{
			System.out.println("not sorted");
		}
	}
}