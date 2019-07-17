package _run; 

import org.openxava.util.*;

/**
 * Ejecuta esta clase para arrancar la aplicaci�n.
 * 
 * Con Eclipse: Bot�n derecho del rat�n > Run As > Java Application
 */

public class @proyecto@ { 

	public static void main(String[] args) throws Exception {
		DBServer.start("@basedatos@"); // Comment this line if you use your own database
        AppServer.run("@proyecto@");
	}

}
