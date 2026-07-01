//second_min
	


class Demo{
	public static void main(String[]args){

	int max=0;
	int arr [] = {50,98,68,34,96,5};

		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		int min =max;

		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		int second_min=max;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<second_min && arr[i]>min){
				second_min = arr[i];
			}
		}
		System.out.println(second_min);
	}

}