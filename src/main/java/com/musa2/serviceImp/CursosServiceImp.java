package com.musa2.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.musa2.dao.CursosDao;
import com.musa2.entity.Cursos;
import com.musa2.service.CursosService;

@Service
public class CursosServiceImp implements CursosService {
	@Autowired
	private CursosDao cursosDao;

	@Override
	public int create(Cursos cursos) {
		// TODO Auto-generated method stub
		return cursosDao.create(cursos);
	}

	@Override
	public int update(Cursos cursos) {
		// TODO Auto-generated method stub
		return cursosDao.update(cursos);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return cursosDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return cursosDao.read(id);
	}



	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return cursosDao.readAll();
	}
	@Override
	public Map<String, Object> read(String nombrecurso) {
		// TODO Auto-generated method stub
		return cursosDao.read(nombrecurso);
	}

	@Override
	public Map<String, Object> findCursosByNombre(int nombrecurso) {
		// TODO Auto-generated method stub
		return cursosDao.findCursosByNombre(nombrecurso);
	}



}
