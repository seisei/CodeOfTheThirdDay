class Test052{


static int[] a;

  static int Fibonacci(int n){
	
	
	 if((n-1) == 0){
	   a[0] = 0;
	   return a[0];
	 }else if((n-1) == 1){
	   a[1] = 1;
	   return a[1];
	 }else{
	   a[n-1] = Fibonacci(n-1) + Fibonacci(n-2);
	 }
	 
	 return a[n-1];
	}
	
    public static void main(String args[]){ 
	
	a = new int[100];

	/*if(Fibonacci(1) == 0){
	  System.out.println("OK");
	}else{
	  System.out.println("NG");
	}
	if(Fibonacci(2) == 1){
	  System.out.println("OK");
	}else{
	  System.out.println("NG");
	}
	if(Fibonacci(3) == 1){
	  System.out.println("OK");
	}else{
	  System.out.println("NG");
	}
	if(Fibonacci(4) == 2){
	  System.out.println("OK");
	}else{
	  System.out.println("NG");
	}
	if(Fibonacci(5) == 3){
	  System.out.println("OK");
	}else{
	  System.out.println("NG");
	}
	if(Fibonacci(6) == 5){
	  System.out.println("OK");
	}else{
	  System.out.println("NG");
	}
	if(Fibonacci(7) == 8){
	  System.out.println("OK");
	}else{
	  System.out.println("NG");
	}*/
	
	System.out.println(Fibonacci(45));
	
    }
}