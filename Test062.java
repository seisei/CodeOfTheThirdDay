class Test062{


static int[] a = {1,2,3,4,5,6,7,8,9,10,12,15,16,19,20,21};

  static void nibun_search(int n){
	int first = 0;
	int last = a.length - 1;
	int middle;
	for(middle = 0; first < last; middle++){
	  middle = (first + last) / 2;
	  
	  if(n == a[middle]){
	    System.out.println("Yes");
		break;
	  }else{
	    if(n < a[middle]){
		  last = middle;
		}else{
		  first = middle;
		}
	  }
	  
	  if((first + 1) == last){
	    if(n == a[first]){
	      System.out.println("Yes");
		  break;
		}else if(n == a[last]){
		  System.out.println("Yes");
		  break;
		}else{
		  System.out.println("No");
		}
	  } 
	  
	  if(first == last){
	    System.out.println("No");
		break;
	  }
	}
	
	}
	
    public static void main(String args[]){ 
	
	nibun_search(21);
    }
}