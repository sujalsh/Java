abstract class C{
    public static int j = 111;
    void print(){
        System.out.print("Geek1!");
    }
}
class I2 implements C{
    public static int j = 222;
    void print(){
        System.out.println("Geek2!");
    }
}