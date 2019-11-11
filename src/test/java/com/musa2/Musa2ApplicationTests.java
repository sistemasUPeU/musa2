package com.musa2;


import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.musa2.dao.ConductoresDao;
import com.musa2.dao.SoatsDao;
import com.musa2.entity.Conductores;
import com.musa2.entity.Soats;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Musa2ApplicationTests {
	@Autowired
	private SoatsDao soatsD;
	@Test
	public void contextLoads() {
		Soats so = new Soats();
		so.setIdsoat(2);
		so.setNrodocumento(1123);
		so.setNropoliza(1231);
		so.setVigenciadesde("2019-11-12");
		so.setVigenciahasta("2019-11-11");
		so.setCertificadodesde("2019-10-11");
		so.setCertificadohasta("2019-10-12");
		so.setMontoprima(20.2);
		so.setAseguradora("Lopez");
		so.setIdvehiculo(1);
		so.setEstado(2);
		
		assertTrue(soatsD.delete(so)!=null);
		
		
	}
	

}
