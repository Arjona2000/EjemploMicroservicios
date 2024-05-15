package com.empleados.entity;

import jakarta.persistence.*;
import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;

@Entity
@Data
@Table(name = "empleados")


public class Empleados{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	@Column(name = "id_Empleado")
	private Integer idEmpleado;
	
	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellido")
	private String apellido;


	@Column(name = "email")
	private String email;

	
}

