//calculating parking charges

class Parking{
	public static void main(String[]args){
		int hr=3;
		boolean vip=false;
		if(vip){
			System.out.println("Free Parking");	
		}else if(hr<=2){
			System.out.println(hr*20);	
		}else {
			System.out.println(40+(hr-2)*10);	
		}
	}
}