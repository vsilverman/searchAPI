/**
 * This class is using JUnit4
 */

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
/**
 * @author Vlad
 *
 */
public class TestAppleSearchAPI {
	
	public static AppleSearchAPI sapi;
	public static String CURL = "c:\\Program Files\\Git\\mingw64\\bin\\curl";
	public static String INPUT_DIR_NAME ="d:\\workspace-eclipse-4.5\\AppleTests\\input\\";
	public static String OUTPUT_DIR_NAME ="d:\\workspace-eclipse-4.5\\AppleTests\\output\\";
	public static File INDIR = new File(INPUT_DIR_NAME);
	public static File OUTDIR = new File(OUTPUT_DIR_NAME);
	public static String[] INFILES;
	public static String[] OUTFILES;


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 sapi = new AppleSearchAPI();
		 INFILES = getDirFiles(INDIR);
		 OUTFILES = getDirFiles(OUTDIR);
	}

	@AfterClass
	public static void tearDownAfterClass() {
	}

	@Before
	public void setUp() {
	}

	@After
	public void tearDown() {
	}

	
	@Test
	public void test1() {
		System.out.println(INFILES[0]);
		System.out.println(OUTFILES[0]);
		String cmd = CURL + " https://itunes.apple.com/search?term=jack+jackson";
		sapi.exec(cmd);
		assertNotNull(INFILES[0]);
		assertNotNull(OUTFILES[0]);
	}
	
	@Test
	public void test2() {
		System.out.println(INFILES[1]);
		System.out.println(OUTFILES[1]);
		String cmd = CURL + " https://itunes.apple.com/search?term=jack+jackson";
		sapi.exec(cmd);
		assertNotNull(INFILES[1]);
		assertNotNull(OUTFILES[1]);
	}
	
	@Test
	public void test3() {
		String cmd = CURL + " https://itunes.apple.com/search?term=jack+jackson";
		sapi.exec(cmd);
		assertNotNull(INFILES[2]);
		assertNotNull(OUTFILES[2]);
	}
	
	@Test
	public void test4() {
		String cmd = CURL + " https://itunes.apple.com/search?term=jack+jackson";
		sapi.exec(cmd);
		assertNotNull(INFILES[3]);
		assertNotNull(OUTFILES[3]);
	}
	
	@Test
	public void test5() {
		String cmd = CURL + " https://itunes.apple.com/search?term=jack+jackson";
		sapi.exec(cmd);
		assertNotNull(INFILES[4]);
		assertNotNull(OUTFILES[4]);
	}
	
	@Test
	public void test6() {
		String cmd = CURL + " https://itunes.apple.com/search?term=jack+jackson";
		sapi.exec(cmd);
		assertNotNull(INFILES[5]);
		assertNotNull(OUTFILES[5]);
	}
	
	@Test
	public void test7() {
		String cmd = CURL + " https://itunes.apple.com/search?term=jack+jackson";
		sapi.exec(cmd);
		assertNotNull(INFILES[6]);
		assertNotNull(OUTFILES[6]);
	}
	
	@Test
	public void test8() {
		String cmd = CURL + " https://itunes.apple.com/search?term=jack+jackson";
		sapi.exec(cmd);
		assertNotNull(INFILES[7]);
		assertNotNull(OUTFILES[7]);
	}
	
	@Test
	public void test9() {
		String cmd = CURL + " https://itunes.apple.com/search?term=jack+jackson";
		sapi.exec(cmd);
		assertNotNull(INFILES[8]);
		assertNotNull(OUTFILES[8]);
	}
	
	
	private static String[] getDirFiles(File dir) {
		String[] fileNames = null;
        if (dir.isDirectory())
            fileNames = dir.list();
		return fileNames;
	}

}
