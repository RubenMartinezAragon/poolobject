/**
 * 
 */
package ubu.gii.dass.test.c01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ubu.gii.dass.c01.DuplicatedInstanceException;
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
	 * @throws DuplicatedInstanceException 
	 */
	@Test
	public void testAcquireReusable() throws DuplicatedInstanceException {
		//fail("Not yet implemented");
		ReusablePool instancia = ReusablePool.getInstance();
		Boolean x=false;
		Boolean thrown=false;
		Reusable reu=null;
		Reusable reu2=null;
		try {
			reu=instancia.acquireReusable();
			assertNotNull(reu);
			reu2=instancia.acquireReusable();
			assertNotNull(reu2);
			assertNotEquals(reu,reu2);
			assertEquals(reu.util(),reu.hashCode() + "  :Uso del objeto Reutilizable");
			assertEquals(reu2.util(),reu2.hashCode() + "  :Uso del objeto Reutilizable");
			x=true;//para ver que dos se puede
			instancia.acquireReusable(); // para ver que hay un limite tiene que saltar excepcion
			
		} catch (NotFreeInstanceException e) {
			// TODO Auto-generated catch block
			thrown=true;
			
			
		}
		assertTrue(x);
		assertTrue(thrown);
		
		//liberar los objetos
		instancia.releaseReusable(reu);
		instancia.releaseReusable(reu2);

	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#releaseReusable(ubu.gii.dass.c01.Reusable)}.
	 * @throws NotFreeInstanceException 
	 */
	@Test
	public void testReleaseReusable() throws NotFreeInstanceException {
		ReusablePool instancia = ReusablePool.getInstance();
		Boolean thrown=false;
		try {
			Reusable reu=instancia.acquireReusable();
			assertNotNull(reu);
			instancia.releaseReusable(reu);
			
			instancia.releaseReusable(reu);
			
		} catch (DuplicatedInstanceException e) {
			// TODO Auto-generated catch block
			thrown=true;
		}
		
		assertTrue(thrown);

	}

}
