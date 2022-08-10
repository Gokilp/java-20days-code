// create class and objects
class box{
    int length;
    int height;
    int breath;

}
public class program14 {
    public static void main(String[] agrs)
    {
        box Blackbox= new box();
        Blackbox.length=20;
        Blackbox.height=10;
        Blackbox.breath= Blackbox.length* Blackbox.height;
        System.out.println(Blackbox.breath);
        box pinkbox = new box();
        pinkbox.length=30;
        pinkbox.height=100;
        pinkbox.breath=pinkbox.length* pinkbox.height;
        System.out.println(pinkbox.breath);
        box woodenbox =new box();
        woodenbox.breath=10;
        woodenbox.height=5;
        woodenbox.length=woodenbox.breath* woodenbox.height;
        System.out.println(woodenbox.length);

    }
}
