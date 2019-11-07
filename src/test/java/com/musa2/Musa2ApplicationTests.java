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
		co.setIdconductor(42);
		
		co.setEstado(0);
		
		
		assertTrue(conD.delete(co)!=null);
		
		
	}
	

}
