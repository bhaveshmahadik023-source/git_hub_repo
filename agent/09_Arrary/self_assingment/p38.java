class Demo{
	public static void main(String[]args){
		int arr[]= {1,2,3,4,1};
		boolean is_acces=true;
		for(int i =0 ; i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
				is_acces=false;
				break;
			}
		}
		if(is_acces){
			System.out.println("yes");	
		}else{
			System.out.println("no");
		}
	}
}