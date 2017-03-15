
class ExceptionType1 extends Exception
{
	ExceptionType1(String s)
	{
		super(s);
	}
}


class ExceptionType2 extends Exception
{
	ExceptionType2(String s)
	{
		super(s);
	}
}


class ExceptionType3 extends Exception
{
	ExceptionType3(String s)
	{
		super(s);
	}
}


public class MultipleException {

	int div(int a, int b) throws ArithmeticException {
		
		if(b==0)
		{
			throw new ArithmeticException("Division by Zero");
		}
		else
		return a/b;
		
	}
	
	void multipleExcept(int type) throws Exception, ExceptionType1, ExceptionType2, ExceptionType3
	{
		try
		{
			if (type==1)
				throw new ExceptionType1("Exception Type 1");
			else if (type==2)
				throw new ExceptionType2("Exception Type 2");
			else if (type==3)
				throw new ExceptionType3("Exception Type 3");
			else
					throw new Exception("General Exception");
		}
		catch (ExceptionType1 e1)
		{
			System.out.println("Exception caught - " + e1.toString());
		}
		catch (ExceptionType2 e1)
		{
			System.out.println("Exception caught - " + e1.toString());
		}
		catch (ExceptionType3 e1)
		{
			System.out.println("Exception caught - " + e1.toString());
		}
		catch (Exception e1)
		{
			System.out.println("Exception caught - " + e1.toString());
		}
	}
	
	 public static void main(String[] args)
	{
		MultipleException obj = new MultipleException();
		try{
		obj.multipleExcept(1);
		obj.multipleExcept(2);
		obj.multipleExcept(3);
		obj.multipleExcept(4);
		}
		catch(Exception e){
			System.out.println("Some other Exception caught");
		}
		
	}
}
