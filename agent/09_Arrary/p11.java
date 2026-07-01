class Demo{
	public static void main(String[]args){
		int targate=122;
		boolean is_found=false;
		int arr []={55,65,56,2,89,2};
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==targate){
				is_found=true;
			}else{
				continue;
			}
		}
		if(is_found){
			System.out.println("targate found");	
		}else{
			System.out.println("targate not found");
		}
	}
}