package org.openxava.test.actions;

import org.openxava.actions.*;
import org.openxava.util.*;

/** 
 * tmp
 * 
 * @author Javier Paniza
 */
public class AddNewLabelAction extends BaseAction {
	
	private String key;
	private String label;

	public void execute() throws Exception {
		// TMP ME QUED� POR AQU�. LO DE ABAJO NO FUNCIONA. DEPURANDO EN Labels, MetaElement Y View. PRUEBA UNTARIA TODAV�A SIN HACER
		Labels.put(getKey(), Locales.getCurrent(), getLabel());
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
