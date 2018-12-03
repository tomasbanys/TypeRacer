/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typeracer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;

/**
 *
 * @author tomas
 */
public class Sakinys {
    private String ivestas;
    private int zodziai;
    private int simboliai;

    public Sakinys(String ivestas, int zodziai, int simboliai) {
        this.ivestas = ivestas;
        this.zodziai = zodziai;
        this.simboliai = simboliai;
    }

    public String getIvestas() {
        return ivestas;
    }

    public int getZodziai() {
        return zodziai;
    }

    public int getSimboliai() {
        return simboliai;
    }
    
     //Arraylist<String> list = new ArrayList<String>();
     
}
