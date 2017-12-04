public class Algoritm {
    //Algoritm euclid
    public int cmmdc(int a, int b)
    {
        if (a < b)
        {
            int aux = b;
            b = a;
            a = aux;
        }
        if (a == b)
        {
            return a;
        }
        int r;
        while ( b!=0 )
        {
            r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
    public boolean prim(int a)
    {
        if (a <= 1)
        {
            return false;
        }
        for (int i=2;i<=a/2;i++)
        {
            if (a%i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
