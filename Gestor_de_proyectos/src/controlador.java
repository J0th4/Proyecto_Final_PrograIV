/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class controlador {
    
      private static controlador instance;
    
    private controlador() {}
    
public static controlador getInstance() {
    if (instance == null) {
        instance = new controlador();
    }
    return instance;
    }
    
}
