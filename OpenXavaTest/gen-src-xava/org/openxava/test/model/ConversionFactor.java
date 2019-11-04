
// File generated by OpenXava: Mon Nov 04 09:58:10 CET 2019
// Archivo generado por OpenXava: Mon Nov 04 09:58:10 CET 2019

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: ConversionFactor		Entity/Entidad

package org.openxava.test.model;

import java.util.*;
import java.math.*;
import java.rmi.RemoteException;
import org.openxava.component.MetaComponent;
import org.openxava.model.meta.MetaModel;
import org.openxava.util.*;

/**
 * 
 * @author MCarmen Gimeno
 */
public class ConversionFactor implements java.io.Serializable, org.openxava.test.model.IConversionFactor {	

	// Constructor
	public ConversionFactor() {
		initMembers();
	} 

	private void initMembers() { 
		setId(null); 
		setFromUnit(null); 
		setToUnit(null); 
		setFactor(null); 
		setReverseFactor(null); 	
	} 
	
	// Properties/Propiedades 
	private static org.openxava.converters.IConverter reverseFactorConverter;
	private org.openxava.converters.IConverter getReverseFactorConverter() {
		if (reverseFactorConverter == null) {
			try {
				reverseFactorConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("reverseFactor");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "reverseFactor"));
			}
			
		}	
		return reverseFactorConverter;
	} 
	private java.math.BigDecimal reverseFactor;
	private java.math.BigDecimal get_ReverseFactor() {
		return reverseFactor;
	}
	private void set_ReverseFactor(java.math.BigDecimal newReverseFactor) {
		this.reverseFactor = newReverseFactor;
	} 	
	
	/**
	 * 
	 * 
	 */
	public java.math.BigDecimal getReverseFactor() {
		try {
			return (java.math.BigDecimal) getReverseFactorConverter().toJava(get_ReverseFactor());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "ReverseFactor", "ConversionFactor", "java.math.BigDecimal"));
		}
	}
	
	/**
	 * 
	 */
	public void setReverseFactor(java.math.BigDecimal newReverseFactor) {
		try { 
			set_ReverseFactor((java.math.BigDecimal) getReverseFactorConverter().toDB(newReverseFactor));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "ReverseFactor", "ConversionFactor", "java.math.BigDecimal"));
		}		
	} 
	private static org.openxava.converters.IConverter toUnitConverter;
	private org.openxava.converters.IConverter getToUnitConverter() {
		if (toUnitConverter == null) {
			try {
				toUnitConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("toUnit");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "toUnit"));
			}
			
		}	
		return toUnitConverter;
	} 
	private java.lang.String toUnit;
	private java.lang.String get_ToUnit() {
		return toUnit;
	}
	private void set_ToUnit(java.lang.String newToUnit) {
		this.toUnit = newToUnit;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getToUnit() {
		try {
			return (String) getToUnitConverter().toJava(get_ToUnit());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "ToUnit", "ConversionFactor", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setToUnit(String newToUnit) {
		try { 
			set_ToUnit((java.lang.String) getToUnitConverter().toDB(newToUnit));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "ToUnit", "ConversionFactor", "String"));
		}		
	} 
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long newId) {
		this.id = newId;
	} 
	private static org.openxava.converters.IConverter factorConverter;
	private org.openxava.converters.IConverter getFactorConverter() {
		if (factorConverter == null) {
			try {
				factorConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("factor");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "factor"));
			}
			
		}	
		return factorConverter;
	} 
	private java.math.BigDecimal factor;
	private java.math.BigDecimal get_Factor() {
		return factor;
	}
	private void set_Factor(java.math.BigDecimal newFactor) {
		this.factor = newFactor;
	} 	
	
	/**
	 * 
	 * 
	 */
	public java.math.BigDecimal getFactor() {
		try {
			return (java.math.BigDecimal) getFactorConverter().toJava(get_Factor());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Factor", "ConversionFactor", "java.math.BigDecimal"));
		}
	}
	
	/**
	 * 
	 */
	public void setFactor(java.math.BigDecimal newFactor) {
		try { 
			set_Factor((java.math.BigDecimal) getFactorConverter().toDB(newFactor));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Factor", "ConversionFactor", "java.math.BigDecimal"));
		}		
	} 
	private static org.openxava.converters.IConverter fromUnitConverter;
	private org.openxava.converters.IConverter getFromUnitConverter() {
		if (fromUnitConverter == null) {
			try {
				fromUnitConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("fromUnit");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "fromUnit"));
			}
			
		}	
		return fromUnitConverter;
	} 
	private java.lang.String fromUnit;
	private java.lang.String get_FromUnit() {
		return fromUnit;
	}
	private void set_FromUnit(java.lang.String newFromUnit) {
		this.fromUnit = newFromUnit;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getFromUnit() {
		try {
			return (String) getFromUnitConverter().toJava(get_FromUnit());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "FromUnit", "ConversionFactor", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setFromUnit(String newFromUnit) {
		try { 
			set_FromUnit((java.lang.String) getFromUnitConverter().toDB(newFromUnit));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "FromUnit", "ConversionFactor", "String"));
		}		
	} 

	// References/Referencias 

	// Colecciones/Collections 

	// Methods/Metodos 	

	// User defined finders/Buscadores definidos por el usuario 	
 	public static ConversionFactor findById(java.lang.Long id) throws javax.ejb.ObjectNotFoundException {
		org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from ConversionFactor as o where o.id = :arg0"); 
		query.setParameter("arg0", id); 
		ConversionFactor r = (ConversionFactor) query.uniqueResult();
		if (r == null) {
			throw new javax.ejb.ObjectNotFoundException(XavaResources.getString("object_not_found", "ConversionFactor"));
		}
		return r; 
 	} 


	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("ConversionFactor").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	public String toString() {		
		try {
			return getMetaModel().toString(this);
		}
		catch (XavaException ex) {
			System.err.println(XavaResources.getString("toString_warning", "ConversionFactor"));
			return super.toString();
		}		
	}

	public boolean equals(Object other) {		
		if (other == null) return false;
		return toString().equals(other.toString());
	}
	
	public int hashCode() {		
		return toString().hashCode();
	}
	
}