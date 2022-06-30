public class Player {
    int number=0;
    public static void main(String[] args){
        System.out.print("Vsem privet!");
    }
    public void guess (){
        number=(int) (Math.random()*10);
        System.out.print("я думаю это - "+number);

    }
}