package org.openxava.test.model;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

/**
 * tmp ME QUED� POR AQU�: INTENTANDO HACER UN EJEMPLO QUE FALLE, COPIANDO DE Prova. TODAV�A NO HE CREADO LAS TABLAS
 * 
 * @author Javier Paniza
 */

@Entity
@EntityValidator( value=Validador1.class,
	properties={
		@PropertyValue(name="name")
})
public class DailyActivity extends Identifiable {

	@ManyToOne
	private WeeklyActivity weeklyActivity;
	
	@Column(length=40)
	private String name;

	public WeeklyActivity getWeeklyActivity() {
		return weeklyActivity;
	}

	public void setWeeklyActivity(WeeklyActivity weeklyActivity) {
		this.weeklyActivity = weeklyActivity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}