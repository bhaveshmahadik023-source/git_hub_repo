//second max


class Demo{
	public static void main(String[]args){

	int max=0;
	int arr [] = {50,98,68,34,96,5};

		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		int second_max =0;

		for(int i=0;i<arr.length;i++){
			if(arr[i]>second_max && arr[i]<max){
				second_max = arr[i];
			}
		}
		System.out.println(second_max);
	}

}