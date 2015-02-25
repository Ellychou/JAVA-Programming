// you can also use imports, for example:
import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class ConvertRadix {
    public String solution(int V, int R) {
        if(V < 0 || V > 200000000 || R < 2 || R > 36) return null;
        int mod;
        char c;
        // write your code in Java SE 8
        StringBuilder s = new StringBuilder();
        
        while(V >= R) {
            mod = V % R;
            V = V / R;
            if(mod >= 10) {
                c = (char)('a' + (mod-10));
            } else {
                c = (char)(mod + '0');
            }
            s.insert(0,c);
        }
        
        if(V >= 10) {
            c = (char)('a' + (V-10));
        } else {
            c = (char)(V + '0');
        }
        s.insert(0,V);
        return s.toString();
    }
}
