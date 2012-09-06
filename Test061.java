class Test061{


static int[] a = {1,2,3,4,5,6,7,8,9,10,12,15,16,19,20};

  static void senkei_search(int n){
	for(int i = 0; i < a.length; i++){
	  if(a[i] == n){
	    System.out.println("Yes");
		break;
	  }else if(i == (a.length - 1)){
	    System.out.println("No");
	  }
	}
	
	}
	
    public static void main(String args[]){ 
	
	senkei_search(17);
    }
}