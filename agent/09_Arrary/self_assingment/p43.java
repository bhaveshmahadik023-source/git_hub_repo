// targat count

class Demo{
	public static void main(String[]args){
		int arr [] ={1,5,5,7,5,8,5,7,5};
		int count=0;
		int targat=5;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==targat){
				count++;
			}
		}
		System.out.println(count);
	}
}