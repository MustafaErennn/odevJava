
public class intMatrisi {

	
	//farkli fonksiyonlardan ula�abilmek i�in public bir matris tanimi yapt�m.
	public Integer [][] matrix = new Integer[4][4];
	
	
	//bu fonksiyon matrisin icini satirlarina g�re farkl� degerlerle dolduran bir fonksiyon
	public void matrisYapimi()
	{
			//int[][] matrix = new int[4][4];
		
		
		for(int i=0;i<4;i++)
		{
		    for(int j=0;j<4;j++)
		    {
		        
		        //satir sayisi cift ise 1 ile dolduruyor
		        if(i%2==0)
		        {
		            matrix[i][j]=1;
		        }
		        else//degilse -1 ile dolduruyor.
		            matrix[i][j]=-1;
		    }
		}
	}
	
	// bu fonksiyonda matrislerin degerlerini sat�r ve sutunlariyla beraber ekrana bas�yor.
	public void matrisiYazdirma()
    {
        for(int i=0;i<4;i++)
		{
		    for(int j=0;j<4;j++)
		    {
		        System.out.println((i+1)+".inci satir ve "+(j+1)+".nci sutun degeri="+matrix[i][j]);
		    }
		    
		}
    }
	
	
	
	

}
