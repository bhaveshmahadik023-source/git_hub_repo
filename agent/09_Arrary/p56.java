class Demo{
	public static void main(String[]args){
		int arr [] = {1,2,2,2,3,3,3,3,3,3,4};
		int num=0;
		int count=0;
		int max=0;
		for(int i=0;i<arr.length;i++){

			if(arr[i]>max){

				if(arr[i]>max && arr[i]==num){
					count++;
				}
			}
		max=arr[i];
		num=arr[i];
		}
		System.out.println(count+1);
	}
}