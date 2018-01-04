public class Calculator
{

    public int performOperations(String name,int a,int b)
    {
        if(name.equals("plus"))
        {
            return a+b;
        }
        else if (name.equals("minus"))
        {
            return a-b;
        }
        else if (name.equals("multiply"))
        {
            return a*b;
        }
        else if (name.equals("divide"))
        {
            //Calculator1 calculator1 = new Calculator1();
            //calculator1.error(c,d);
            return a/b;
        }

        throw new RuntimeException("Invalid");

    }

   }

