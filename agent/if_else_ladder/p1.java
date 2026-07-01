// eletricity bill

class Bill{
	public static void main(String[]args){
		int unit=400;
		if(unit<=100){
			System.out.println(unit*5);
		}else if(unit<=200){
			System.out.println(500+(unit-100)*7);
		}else {
			System.out.println(1200+(unit-200)*10);
		}
	}
}