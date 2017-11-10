/**
 *
 * @author giovanni.stevanato
 */
public class main {

    public static void main(String[] args) {
        testPila();
        testCoda();
    }
    
    private static void testPila(){
        Pila p = new Pila();
        for(int i=0; i<10; i++)
            p.push(i);
        
        for(int i=0; i<10; i++)
            System.out.println(p.top());
    }
    
    private static void testCoda(){
        Coda c = new Coda();
        for(int i=0; i<10; i++)
            c.enqueue(i);
        
        for(int i=0; i<10; i++)
            System.out.println(c.front());
    }
    
}
