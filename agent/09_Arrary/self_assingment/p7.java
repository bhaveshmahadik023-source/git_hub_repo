//Strickly accending check

class Demo{
	public static void main(String[]args){
		int arr [] = {1,2,8,9};
		int last_num=0;
		boolean is_acc=true;
		for(int i=0;i<arr.length;i++){
			
			last_num = arr[i];
		}
		
		for(int i=arr.length-1;i>=0;i--){

			
			if(arr[i]>=last_num){
				if(arr[i]==last_num){
					is_acc=false;
					break;
				}else{
					is_acc=false;
					break;
				}
			}	
		last_num=arr[i];
		}
		if(is_acc){
			System.out.println("true");	
		}else{
			System.out.println("not strickly");	
		}
	}
}