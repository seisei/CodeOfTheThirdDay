class BubbleSort{

static void bubbleSort(int[] a){
  
  for(int i = 0; i < a.length - 1; i++){
    int count = 0;
      for(int j = 0; j < a.length - 1;j++){
	    if(a[j] > a[j+1]){
		  int tmp = a[j];
		  a[j] = a[j+1];
		  a[j+1] = tmp;
		  count++;
		}
	  }
	if(count == 0){
	  break;
	}
	  }
  }

    
    public static void main(String args[]){
		int[] a = {10,4,6,45,68,30,61,5,21,11};
		
		
		
		bubbleSort(a);
		
		for(int i = 0; i < a.length; i++){
		  System.out.println(a[i]);
	    }
    }
}