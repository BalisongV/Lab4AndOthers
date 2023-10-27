package Lab9;
import java.util.Comparator;
import java.util.Vector;
public class MyVector<E> extends Vector<E> {

    public MyVector()
    {
        super();
    }

    public void sort() {
        sort(null);
    }

    public void sort(Comparator<? super E> c)
    {
        int numSorted = 1;
        int index;
        int n = size();
        while (numSorted < n)
        {
            E temp = get(numSorted);

            for (index = numSorted; index > 0; index--)
            {
                if (c.compare(temp,get(index-1)) < 0)
                {
                    set(index, get(index-1));
                }
                else
                {
                    break;
                }
            }

            set(index, temp);
            numSorted++;
        }
    }
}
