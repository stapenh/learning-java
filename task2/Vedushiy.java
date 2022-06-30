public class Vedushiy {
    Players p1;//обьявил тип переменной p1
    Players p2;//обьявил тип переменной p2

    public  void main() {
        System.out.println("раз-два-три");
        p1 = new Players();//создется экземпляр класса
        p2 = new Players();
        p1.hand();
        p2.hand();
        System.out.println(p1.ruka);
        System.out.println("ух ты");
        if (p1.ruka != p2.ruka){
            System.out.println("что это?");
            if ((p1.ruka=="камень" & p2.ruka=="ножницы")|(p1.ruka=="бумага" & p2.ruka=="камень")|(p1.ruka=="ножницы" & p2.ruka=="бумага")){
                System.out.println("perviy pobedil");
                System.out.println("boooom");
            } else{
                System.out.println("vtoroy pobedil");
            }
        }
        if (p1.ruka == p2.ruka) {
            System.out.println("!НИЧЬЯ!");
        }





    }
}