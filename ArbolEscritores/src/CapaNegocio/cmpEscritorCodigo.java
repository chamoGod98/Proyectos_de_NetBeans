
package CapaNegocio;

import TArboles.TComparar;

public class cmpEscritorCodigo implements TComparar{
    
     public int Compara( Object o1, Object o2 ){
      Escritor a1, a2;
      a1 = (Escritor) o1;
      a2 = (Escritor) o2;
      int  difedad = a1.getCodEscritor().compareTo(a2.getCodEscritor());
      
      if ( difedad == 0 )
        return 0; // o1 = o2
      else
        if ( difedad < 0 )
          return -1;  // o1 < o2
       else
         return 1; // o1 > o2
    }
     
}
