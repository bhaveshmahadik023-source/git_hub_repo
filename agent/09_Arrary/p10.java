class Mod{
	public static void main(String[]args){
		int mod=0;
		int arr[]={25,68,97,521,52,5,7,8};
		int reverse=0;
		
		for(int i =0;i<arr.length;i++){
		reverse=reverse*10+arr[i];
		System.out.println(arr[i]);
		}
		System.out.println(mod);
		System.out.println(reverse);
	}
}