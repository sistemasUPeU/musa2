package com.musa2.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa2.dao.Configuraciones_GrupoDao;
import com.musa2.entity.Configuraciones_Grupo;
import com.musa2.service.Configuraciones_GrupoService;
@Service
public class Configuraciones_GrupoServiceImp implements Configuraciones_GrupoService {
	@Autowired
	private Configuraciones_GrupoDao Configuraciones_GrupoDao;
	@Override
	public int create(Configuraciones_Grupo cg) {
		// TODO Auto-generated method stub
		return Configuraciones_GrupoDao.create(cg);
	}

	@Override
	public Map<String, Object> readP(int paradero) {
		// TODO Auto-generated method stub
		return Configuraciones_GrupoDao.readP(paradero);
	}



	@Override
	public int SaveUno(Configuraciones_Grupo cg) {
		// TODO Auto-generated method stub
		return Configuraciones_GrupoDao.SaveUno(cg);
	}



	@Override
	public int SaveDos(Configuraciones_Grupo cg) {
		// TODO Auto-generated method stub
		return Configuraciones_GrupoDao.SaveDos(cg);
	}

	@Override
	public Map<String, Object> readUNO() {
		// TODO Auto-generated method stub
		return Configuraciones_GrupoDao.readUNO();
	}

	@Override
	public Map<String, Object> readDOS() {
		// TODO Auto-generated method stub
		return Configuraciones_GrupoDao.readDOS();
	}

}
