class Test051{

    static int kaijou(int a){
	 int result;
	 if(a == 1 || a == 0){
	   return 1;
	 }else{
	   result = a * kaijou(a-1);
	 }
	 
	 return result;
	}
    public static void main(String args[]){ 
		
	if(kaijou(0) == 1){
	  System.out.println("OK");
	}else{
	  System.out.println("NG");
	}
	if(kaijou(1) == 1){
	  System.out.println("OK");
	}else{
	  System.out.println("NG");
	}
	if(kaijou(2) == 2){
	  System.out.println("OK");
	}else{
	  System.out.println("NG");
	}
	if(kaijou(3) == 6){
	  System.out.println("OK");
	}else{
	  System.out.println("NG");
	}
	if(kaijou(4) == 24){
	  System.out.println("OK");
	}else{
	  System.out.println("NG");
	}
	if(kaijou(5) == 120){
	  System.out.println("OK");
	}else{
	  System.out.println("NG");
	}
	if(kaijou(6) == 720){
	  System.out.println("OK");
	}else{
	  System.out.println("NG");
	}
	
    }
}