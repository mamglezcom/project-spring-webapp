package com.mamglez.projectspringweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mamglez.projectspringweb.dao.EmpleadoDAO;
import com.mamglez.projectspringweb.service.SpringService;

@Service
public class SpringServiceImpl implements SpringService {
	
	@Autowired
	private EmpleadoDAO empleadoDAOImpl;

	@Override
	public String mostrarNombreEmpresa() {
		return "anotaciones con spring y jsp";
	}

	@Override
	public String mostrarNombreEmpleado() {
		return this.empleadoDAOImpl.consultarNombreEmpleado();
	}

}
