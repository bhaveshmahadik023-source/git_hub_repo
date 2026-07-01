//missing value without sorting

class Demo{
	public static void main(String[]args){
		int arr []={1,5,4,6,2};
		int count=0;

		for(int i=1;i<=6;i++){
			count=count+i;	
		}
	
		int sub=count;
		for(int i=0;i<arr.length;i++){
			sub = sub-arr[i];	
		}
		System.out.println(sub);
	}
}

