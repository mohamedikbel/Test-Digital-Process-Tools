package test.ikbel;

import org.junit.internal.runners.JUnit38ClassRunner;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import test.ikbel.services.Impl.ImplAscenceur;

@SpringBootTest

@RunWith(JUnit4ClassRunner.class)


public class SoftwareAscenceurApplicationTests  {
	
	






	



	public SoftwareAscenceurApplicationTests() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Autowired
	ImplAscenceur ImpAsc;
	@Test
	public void contextLoads() {

	}
 
	
	
	@Test
	public void IntialisationAscenceurTest()
	{
		
		ImpAsc.IntialiserSysteme();

	}
	
	@Test
	public void MovepTest()
	{
		
		ImpAsc.GoUp(1) ;
		ImpAsc.GoDown(1);

		

	}
	
}
