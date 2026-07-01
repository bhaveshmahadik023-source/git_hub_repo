//caltulate charges on food delivery

class Bill{
	public static void main(String[]args){
		int order=400;
		boolean premium=true;
	
		if(premium){
			System.out.println("free delivery");
		}else if(order>=500){
				System.out.println("free delivery");
		}else {
			System.out.println("50 delivery charges");	
		}
	}
}