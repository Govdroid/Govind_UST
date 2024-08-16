package java_Day_2;

public class matrix_prod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1[][]={{2,3},{1,2}};    
		int m2[][]={{2,4},{2,1}};    
		System.out.println("Product of the two matrices: ");
		int m3[][]=new int[2][2];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				m3[i][j]=0;
				for(int k=0;k<2;k++) {
					m3[i][j]+=m1[i][k]*m2[k][j];
				}
			}
		}
		
		for(int i=0;i<2;i++) {
			System.out.println();
			for(int j=0;j<2;j++) {
				System.out.print(m3[i][j]+" ");
			}
		}

	}

}
