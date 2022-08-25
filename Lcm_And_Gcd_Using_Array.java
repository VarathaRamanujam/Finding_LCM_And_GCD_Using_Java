package My_Basic_programs;

public class Lcm_And_Gcd_Using_Array {

	public static void main(String[] args) {
		Lcm_And_Gcd_Using_Array obj = new Lcm_And_Gcd_Using_Array();
		//obj.Array_GCD();
		obj.Array_LCM();
	}

	private void Array_LCM() {
		int ls[]= {2,9,8,56};
		// Finding the large value in array 
		int i=0,temp=0,max=0;
		while(i<(ls.length-1)) {
			
			if(ls[i]>ls[i+1]) {
				temp=ls[i];
				ls[i]=ls[i+1];
				ls[i+1]=temp;				
			}
			i++;
		} max=ls[ls.length-1];
		//System.out.println(max);
		
		for (int j=max;true;j+=max) {
			int count=0;
			for(int k=0;k<ls.length;k++) { 
				//System.out.println(ls[k]);
				if(j%ls[k]==0) {
					count++;
				}
				//System.out.println(count);
			}			
			if(count==ls.length) {
				System.out.println("Lcm is : "+j);
				break;
			}			
		}	
	}

	private void Array_GCD() {
		int ls[]= {3,15,6,18,21,27};
		// Finding the small value in array 
		int i=0,temp=0,min=0;
		while(i<(ls.length-1)) {
			
			if(ls[i]<ls[i+1]) {
				temp=ls[i];
				ls[i]=ls[i+1];
				ls[i+1]=temp;
				
			}
			i++;
		} min=ls[ls.length-1];
		for (int j=min;j>=1;j--) {
			int count=0;
			for(int k=0;k<ls.length;k++) { 
				
				     if(ls[k]%j==0) {
					      count++;
					
				                 }
				//System.out.println(count);
			}
			
			if(count==ls.length) {
				System.out.println("Gcd is : "+j);
				break;
			}			
		}		
		}
}
