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
	public static String EXPECTED_OUT = "d:\\workspace-eclipse-4.5\\AppleTests\\current-output\\" + "expected.out";
	public static File INDIR = new File(INPUT_DIR_NAME);
	public static File OUTDIR = new File(OUTPUT_DIR_NAME);
	public static String[] INFILES;
	public static String[] OUTFILES;
	public static String[] URL = new String[9];


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 sapi = new AppleSearchAPI();
		 INFILES = getDirFiles(INDIR);
		 OUTFILES = getDirFiles(OUTDIR);
		 URL[0] = "https://itunes.apple.com/search?term=jack+jackson";
		 URL[1] = "https://itunes.apple.com/search?term=jack";
		 URL[2] = "https://itunes.apple.com/search?term=jack+jackson&limit=25";
		 URL[3] = "https://itunes.apple.com/search?term=jack+jackson&media=musicVideo";
		 URL[4] = "https://itunes.apple.com/search?term=jim+jones&country=US";
		 URL[5] = "https://itunes.apple.com/search?term=jim+jones&country=US&media=all";
		 URL[6] = "https://itunes.apple.com/search?term=jim+jones&country=ca";
		 URL[7] = "https://itunes.apple.com/search?term=jim+jones&country=US&media=musicVideo";
		 URL[8] = "https://itunes.apple.com/search?term=yelp&country=US&media=software";
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

	
	public void test(int i) {
		System.out.println(INFILES[i]);
		System.out.println(OUTFILES[i]);
		String cmd = CURL+" -o "+EXPECTED_OUT+" "+URL[i];
		sapi.exec(cmd);
		File expected = new File(EXPECTED_OUT);
		File actual = new File(OUTPUT_DIR_NAME + OUTFILES[i]);
		assertEquals(expected.length() , actual.length());
		assertNotNull(INFILES[i]);
		assertNotNull(OUTFILES[i]);
	}
	
	@Test
	public void test1() {
		test(0);
	}
	
	@Test
	public void test2() {
		test(1);
	}
	
	@Test
	public void test3() {
		test(2);
	}
	
	@Test
	public void test4() {
		test(3);
	}
	
	@Test
	public void test5() {
		test(4);
	}
	
	@Test
	public void test6() {
		test(5);
	}
	
	@Test
	public void test7() {
		test(6);
	}
	
	@Test
	public void test8() {
		test(7);
	}
	
	@Test
	public void test9() {
		test(8);
	}
	
	
	
	private static String[] getDirFiles(File dir) {
		String[] fileNames = null;
        if (dir.isDirectory())
            fileNames = dir.list();
		return fileNames;
	}

}
