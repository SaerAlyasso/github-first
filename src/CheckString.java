
public class CheckString {

	public static boolean equalIsNot(String str) {
		  int count1 = 0;
		  int count2 = 0;
		  
		  String sub1="is";
		  String sub2="not";
		  
		  int index1=0;
		  int index2=0;
		  
		  while((index1=str.indexOf(sub1,index1))!=-1){
			  
			  index1++;
			  count1++;
		  }
		  
		  while((index2=str.indexOf(sub2,index2))!=-1){
			  
			  index2++;
			  count2++;
		  }
		  
		  if(count1==count2){
			  return true;
		  }
		  
		  return false;
		}
	
	public static void main (String[] args){
		
		System.out.println(equalIsNot("isnotnotisnot"));
		System.out.println(equalIsNot("isisnotnotisnot"));
		
	}
	
}


