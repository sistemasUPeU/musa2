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
		
		
		
	}
	

}
