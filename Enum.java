enum Week{
    mon,tue,wed,thur,fri,sat;
}
public class Enum {
    public static void main(String args[])
    {
        Week w=Week.mon;
        System.out.println(w);

        for(Week w1:Week.values())
        {
            System.out.println(w1);
        }
    }
    
}
