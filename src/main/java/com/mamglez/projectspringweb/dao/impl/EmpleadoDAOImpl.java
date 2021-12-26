package com.mamglez.projectspringweb.dao.impl;

import org.springframework.stereotype.Repository;

import com.mamglez.projectspringweb.dao.EmpleadoDAO;

@Repository
public class EmpleadoDAOImpl implements EmpleadoDAO {

	@Override
	public String consultarNombreEmpleado() {
		return "Paco Pancho";
	}

}
