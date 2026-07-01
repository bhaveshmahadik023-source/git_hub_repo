// calculating parking-2 charges of bike and car

class Parking{
	public static void main(String[]args){
		boolean vip =false;
		boolean bike=true;
		boolean car=false;
		int hr=4;
		if(vip){
			if(hr>2){
				if(bike){
					System.out.println((hr-2)*20);
				}else if(car){	
					System.out.println((hr-2)*50);
				}
			}
		}else{
			if(bike){
				System.out.println(hr*20);	
			}else if(car){
				System.out.println(hr*50);
			}	
		}
			
	}	
}