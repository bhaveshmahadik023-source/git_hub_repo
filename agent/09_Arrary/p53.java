//min number

class Demo{
	public static void main(String[]args){

		int arr [] ={1,2,2,3,4};
		int max=0;
		
		for(int i=0; i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		int min=max;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println(min);
	}
}