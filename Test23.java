public class Test23{
int x=20;
public static void main(String[]args){
Test21 t=new Test21();
Test21 s=new Test21();
Test21 y=new Test21();
s.x = t.x+5;
t.x =s.x+5;
System.out.println(t.x);
}
}