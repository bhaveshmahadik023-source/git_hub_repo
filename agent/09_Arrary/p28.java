
class Demo{
	public static void main(String[]args){
		int max=0;
		int arr []={30,35,49,38,30,9,6};
		int count=0;
		
		for(int i=0;i<=(arr.length-1);i++){
			if(arr[i]%2==0){
				count++;
			}
		}
		System.out.println(count);
	}
}