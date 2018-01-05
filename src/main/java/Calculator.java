public class Calculator
{

    public int performOperations(String name,int a,int b)
    {


        if(name.equals("plus"))
        {
            System.out.println("Addition Operation");

            return a+b;
        }
        else if (name.equals("minus"))
        {
            System.out.println("Substraction Operation");

            return a-b;
        }
        else if (name.equals("multiply"))
        {
            System.out.println("Multiplication Operation");
            return a*b;
        }
        else if (name.equals("divide"))
        {
            System.out.println("Division Operation");
            //Calculator1 calculator1 = new Calculator1();
            //calculator1.error(c,d);
            return a/b;
        }

        throw new RuntimeException("Invalid");

    }

   }

