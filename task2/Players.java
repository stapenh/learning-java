public class Players{
    String[] a={"камень","ножницы","бумага"};
    String ruka="ladonb";
    public static void main(String[] args) {
        System.out.print("main zaebal");
    }
    public  void hand(){
         ruka=a[(int)(Math.random()*a.length)];
        System.out.println(ruka);


    }
}
