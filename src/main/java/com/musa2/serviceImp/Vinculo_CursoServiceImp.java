package com.musa2.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa2.dao.Vinculo_CursoDao;
import com.musa2.entity.Vinculo_Curso;
import com.musa2.service.Vinculo_CursoService;
@Service
public class Vinculo_CursoServiceImp implements Vinculo_CursoService{
     @Autowired
     private Vinculo_CursoDao vinculocurso;

	@Override
	public int create(Vinculo_Curso vc) {
		// TODO Auto-generated method stub
		return vinculocurso.create(vc) ;
	}

	@Override
	public int update(Vinculo_Curso vc) {
		// TODO Auto-generated method stub
		return vinculocurso.update(vc);
	}

	@Override
	public int delete(int id,int x) {
		// TODO Auto-generated method stub
		return vinculocurso.delete(id,x);
	}

	@Override
	public Map<String, Object> read(int idcurso, int idconductor) {
		// TODO Auto-generated method stub
		return vinculocurso.read(idcurso, idconductor);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return vinculocurso.readAll();
	}

	@Override
	public Map<String, Object> readNombre(String nombrecurso) {
		// TODO Auto-generated method stub
		return vinculocurso.readNombre(nombrecurso);
	}

	@Override
	public Map<String, Object> readSelectcur() {
		// TODO Auto-generated method stub
		return vinculocurso.readSelectcur();
	}

	@Override
	public Map<String, Object> readSelectcon() {
		// TODO Auto-generated method stub
		return vinculocurso.readSelectcon();
	}

	@Override
	public Map<String, Object> name(String nombrecurso) {
		// TODO Auto-generated method stub
		return vinculocurso.name(nombrecurso);
	}

	


}
