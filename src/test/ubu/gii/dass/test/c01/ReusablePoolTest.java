/**
 * 
 */
package ubu.gii.dass.test.c01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ubu.gii.dass.c01.NotFreeInstanceException;
import ubu.gii.dass.c01.Reusable;
import ubu.gii.dass.c01.ReusablePool;

/**
 * @author Ruben Martinez Aragon
 *
 */
public class ReusablePoolTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#getInstance()}.
	 */
	@Test
	public void testGetInstance() {
		
		ReusablePool instancia1 = ReusablePool.getInstance();
		ReusablePool instancia2 = ReusablePool.getInstance();
		assertEquals(instancia1,instancia2);//comprobar que siempre devuelve la misma
		assertNotNull(instancia1);//comprobar que la instancia no es null
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#acquireReusable()}.
	 */
	@Test
	public void testAcquireReusable() {
		//fail("Not yet implemented");
		ReusablePool instancia = ReusablePool.getInstance();
		Boolean x=false;
		Boolean thrown=false;
		try {
			Reusable reu=instancia.acquireReusable();
			assertNotNull(reu);
			Reusable reu2=instancia.acquireReusable();
			assertNotNull(reu2);
			assertNotEquals(reu,reu2);
			x=true;//para ver que dos se puede
			instancia.acquireReusable(); // para ver que hay un limite tiene que saltar excepcion
			
		} catch (NotFreeInstanceException e) {
			// TODO Auto-generated catch block
			thrown=true;
		}
		
		assertTrue(x);
		assertTrue(thrown);
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#releaseReusable(ubu.gii.dass.c01.Reusable)}.
	 */
	@Test
	public void testReleaseReusable() {
		fail("Not yet implemented");
	}

}
