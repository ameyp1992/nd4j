package org.nd4j.jdbc.mysql;

import javax.sql.DataSource;
import org.junit.*;
import static org.junit.Assert.*;
import com.mchange.v1.db.sql.DriverManagerDataSource;

/**
 * The class <code>MysqlLoaderTest</code> contains tests for the class <code>{@link MysqlLoader}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:23 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class MysqlLoaderTest {
	/**
	 * Run the MysqlLoader(DataSource,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:23 PM
	 */
	@Test
	public void testMysqlLoader_1()
		throws Exception {
		DataSource dataSource = new DriverManagerDataSource("");
		String jdbcUrl = "";
		String tableName = "";
		String columnName = "";

		MysqlLoader result = new MysqlLoader(dataSource, jdbcUrl, tableName, columnName);

		// add additional test code here
		assertNotNull(result);
		assertEquals("INSERT INTO  VALUES(?,?)", result.insertStatement());
		assertEquals("DELETE  FROM  WHERE id =?", result.deleteStatement());
		assertEquals("SELECT * FROM  WHERE id =?", result.loadStatement());
	}

	/**
	 * Run the String deleteStatement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:23 PM
	 */
	@Test
	public void testDeleteStatement_1()
		throws Exception {
		MysqlLoader fixture = new MysqlLoader(new DriverManagerDataSource(""), "", "", "");

		String result = fixture.deleteStatement();

		// add additional test code here
		assertEquals("DELETE  FROM  WHERE id =?", result);
	}

	/**
	 * Run the String insertStatement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:23 PM
	 */
	@Test
	public void testInsertStatement_1()
		throws Exception {
		MysqlLoader fixture = new MysqlLoader(new DriverManagerDataSource(""), "", "", "");

		String result = fixture.insertStatement();

		// add additional test code here
		assertEquals("INSERT INTO  VALUES(?,?)", result);
	}

	/**
	 * Run the String loadStatement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:23 PM
	 */
	@Test
	public void testLoadStatement_1()
		throws Exception {
		MysqlLoader fixture = new MysqlLoader(new DriverManagerDataSource(""), "", "", "");

		String result = fixture.loadStatement();

		// add additional test code here
		assertEquals("SELECT * FROM  WHERE id =?", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/7/15 7:23 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 3/7/15 7:23 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 3/7/15 7:23 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MysqlLoaderTest.class);
	}
}