public class Players{
    String[] a={"камень","ножницы","бумага"};
    int b=a.length;
    String ruka="ladonb";
    public static void main(String[] args) {
        System.out.print("main zaebal");
    }
    public  void hand(){
         ruka=a[(int)(Math.random()*b)];
        System.out.println(ruka);


    }
}
