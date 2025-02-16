public class IntWrapper {
    
    private int val;
    private static int count = 0; // Luokkamuuttuja count

    public IntWrapper()
    {
        val = 0;
        count++; // Lisätään countia jokaisen luonnin yhteydessä
    }
    public IntWrapper(int ival)
    {
        val = ival;
        count++; // Lisätään countia jokaisen luonnin yhteydessä
    }

    // Luokkametodi getCount, joka palauttaa luotujen IntWrapper objektien määrän
    public static int getCount() {
        return count;
    }
    
    public static void main(String args[]){

        IntWrapper iw1 = new IntWrapper(1);
        System.out.println(IntWrapper.getCount());
        IntWrapper iw2 = new IntWrapper(1);
        System.out.println(IntWrapper.getCount());
        iw1 = new IntWrapper();
        System.out.println(IntWrapper.getCount());
        
    }

    static void check(IntWrapper iw1, IntWrapper iw2){

        boolean w1 = false, w2 = false;
        if(iw1.val == 2)
            w1 = true;
        if(iw2.val == 5)
            w2 = true;
        
        System.out.println(w1);
        System.out.println(w2);
    }
}
