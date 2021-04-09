

//
//
//
//
public class Mainn {

    static int fMainn(int h){
        if(h==0){
            return 0;}
        else if(h==1){
            return 1;}
        else{
            System.out.println();
                System.out.println("h-1 " + (h-1) + " " + "h-2 " + (h-2) + " " + "Итого: " + ((h-1) + (h-2)));
            return fMainn(h-1) + fMainn(h-2);
        }
    }

    public static void main(String[] args)
    {
        {
            int u=fMainn(8);
            System.out.println(u);
        }}
}