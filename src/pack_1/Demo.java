package pack_1;

public class Demo 
{
	public static void main(String[] args) 
	{
		String path=System.getProperty("user.dir");
        Excelutils ex=new Excelutils(path+"/excel/data.xlsx","Sheet1");
	Excelutils.getRowCount();
	Excelutils.getCellDataString(0, 0);
	Excelutils.getCellDataString(0, 1);
	Excelutils.getCellDataString(1, 0);
	Excelutils.getCellDataNumber(1, 1);
	Excelutils.getCellDataString(2, 0);
	Excelutils.getCellDataNumber(2, 1);
	
    System.out.println("hello");
    System.out.println("this is");
    System.out.println("Git");
    
    System.out.println("Second man");
    System.out.println("second commit");
    
    
    System.out.println("Third commit Amir");
    System.out.println("Third times");
    
    
    
    
	
	}
}
