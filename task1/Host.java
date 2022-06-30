public class Host {
    Player p1;//обьявил тип переменной p1
    Player p2;//обьявил тип переменной p2
    Player p3;//обьявил тип переменной p3
    public  void main(){
        System.out.println("ctartuem!");
        p1=new Player();//создется экземпляр класса
        p2=new Player();
        p3=new Player();
        int papanumber=(int)(Math.random()*10);
        p1.guess();
        p2.guess();
        p3.guess();

        if (p1.number==papanumber){
            System.out.print("верно! 1 ответил") ;
        }
        if (p2.number==papanumber){
            System.out.print("верно! 2 ответил") ;
        }
        if (p3.number==papanumber){
            System.out.print("верно! 3 ответил") ;
        }
    }
}