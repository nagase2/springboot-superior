package codesamples;



/**
 * ジェネリクスのサンプルプログラム。
 * @author hi965
 *
 * @param <DDDD>
 * @param <N>
 * @param <V>
 */
class ClassSample<DDDD,N,V>{
    private DDDD t;
    private N n;
    private V v;
 
    public ClassSample(DDDD t){
        this.t = t;
    }
 
    public DDDD getT(){
        return t;
    }
    public void SetN(N n){
        this.n = n;
    }
    public N getN(){
        return this.n;
    }
}
class ClassA extends ClassB{
    public String getHello(){
        return "hello classA";
    }
}
class ClassB{
    public String getHello(){
        return "hello classB";
    }
    
    public  <T,N,K> N genericMethod(T t, N n ){
        
        System.out.println(t.getClass());
        
        System.out.println();
        
        return n;
    }
    
}
 
public class GenericsSample {
 
    public static void main(String[] args) {
        // String型として利用可能
        ClassSample<? extends ClassB,Integer,String> cs1 = new ClassSample(new ClassB());
        ClassB clsB = cs1.getT();
        System.out.println(clsB.getHello());
        
        System.out.println(clsB.genericMethod("ssss", 123));
 
        // Integer型として利用可能
        ClassSample<Integer,Integer,String> cs2 = new ClassSample(221);
        Integer i = cs2.getT();
        cs2.SetN(9999);
        System.out.println(i);
        System.out.println(cs2.getN());
    }
 
}