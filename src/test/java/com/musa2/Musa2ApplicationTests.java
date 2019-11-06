package com.musa2;


import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.musa2.dao.ConductoresDao;
import com.musa2.entity.Conductores;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Musa2ApplicationTests {
	@Autowired
	private ConductoresDao conD;

	@Test
	public void contextLoads() {
		Conductores co = new Conductores();
		co.setTipooperador(1);
		co.setCodigo(23);
		co.setEstado(2);
		co.setNrolicencia(12);
		co.setCursovial(1);
		co.setUsercreate("William");
		co.setIdpersona(10);
		co.setLinc_fechainicio("2019-11-12");
		co.setLinc_fechafin("2019-11-12");
		co.setClase("a");
		co.setCategoria(1);
		
		assertTrue(conD.create(co)!=null);
		
		
	}
	@Test
	public void Testop() {
		
	}
	

}
