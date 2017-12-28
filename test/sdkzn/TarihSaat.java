/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdkzn;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author OS
 */
public class TarihSaat {
    private static final DateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
    private static final DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    private Date dt = new Date();
    
    public  String SimdikiTarihSaat(){
        return sdf.format(dt); 
    }
}
