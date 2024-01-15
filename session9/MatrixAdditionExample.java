package core_programs;

public class MatrixAdditionExample{  
		public static void main(String args[]){  
		int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
		int b[][]={{9,8,7},{6,5,4},{3,2,1}};    
		    
		int c[][]=new int[3][3];
		System.out.println("Metrics a :");
		for(int[] val:a) {
			for(int e:val) {
				System.out.print(e+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Metrics b :");
		for(int[] val2: b) {
			for(int j:val2) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Addition of a and b is:");
		    
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=a[i][j]+b[i][j];    
		System.out.print(c[i][j]+" ");    
		}    
		System.out.println(); 
		}    
		}
}

