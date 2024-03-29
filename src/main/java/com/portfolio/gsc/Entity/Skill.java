package com.portfolio.gsc.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skill {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

@NotNull
@Size(min = 1, max = 50, message = "no cumple con la longitud")
 private String nombre;

@NotNull
@Size(min = 1, max = 50, message = "no cumple con la longitud")
private String porcentaje;


public Skill(){

}
public Skill(long id, String nombre, String porcentaje){

this.id = id;
this.nombre = nombre;
this.porcentaje = porcentaje;
}}




