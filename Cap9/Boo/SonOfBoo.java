package Cap9.Boo;


public class SonOfBoo extends Boo{

    public SonOfBoo(){
        super("boo");
    }

    public SonOfBoo(int i){
        super("Fred");
    }

    public SonOfBoo(String s){
        super(42);
    }

    /*  error - cannot resolve symbol :  constructor Boo()
    public SonOfBoo(int i, String s){
    }*/

    /*  error - cannot resolve symbol: constructor Boo(java.lang.String, java.lang.String)
    public SonOfBoo(String a, String b, String c){
        super(a, b);
    }*/

    public SonOfBoo(int i, int j){
        super("man", j);
    }

   /* error - cannot resolve symbol: constructor Boo(int, java.lang.String)
    public SonOfBoo(int i, int x, int y){
        super(i, "star");
    }*/
}
