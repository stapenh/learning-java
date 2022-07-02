public class Players{
    String[] a={"камень","ножницы","бумага"};
    String ruka="ladonb";
    public static void main(String[] args) {
        System.out.print("main zaebal");
    }
    public  void hand(){
        int b=a.length;
         ruka=a[(int)(Math.random()*b)];
        System.out.println(ruka);


    }
}
