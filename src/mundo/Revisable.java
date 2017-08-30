/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

import anotaciones.Init;
import anotaciones.NoValorDefecto;


/**
 *
 * @author ca.diazr1
 */
public interface Revisable {
    

@NoValorDefecto public boolean revisarCadena (String s);
public boolean revisarEntero (int i);
@NoValorDefecto public boolean revisarFlotante (Float f);

    
}
