package co.com.calculator.util;

import java.util.Locale;
import java.util.ResourceBundle;

public class Propiedades {
	
	private static ResourceBundle resourceBundle = ResourceBundle.getBundle("co.com.calculator.util/values", Locale.getDefault()); 

	public static final String KEY_MENU_PRINCIPAL ="KEY_MENU_PRINCIPAL"; 
	public static final String KEY_MAIN_OPC = "KEY_MAIN_OPC";
	public static final String KEY_OPC_CLC = "KEY_OPC_CLC";
	public static final String KEY_OPC_EXT = "KEY_OPC_EXT";
	
	public static String get(String key){		

		return resourceBundle.getString(key);
	}
	public static void actualizar(Locale locale){
		
		resourceBundle = ResourceBundle.getBundle("co.com.calculator.util/values", locale);
		
	}
}
