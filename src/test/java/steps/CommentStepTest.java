package steps;

import java.util.concurrent.ThreadLocalRandom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pages.HomePage;
import util.TestBase;

public class CommentStepTest extends TestBase {	
	
	HomePage homePage;
	int randomNum = ThreadLocalRandom.current().nextInt(0, 300000 + 1);
	
	@Before
	public void init() throws Throwable {
		TestBase.initialization();
	}
	
	@After
	public void closerChrome() {
		TestBase.close();
	}
	
	
	@Test
	public void createComment() {
		homePage = new HomePage();
		try {
			//com random ele sempre irá incluir um comentário diferente
			homePage.insertComment("Inserindo um comentário  " + randomNum);
			homePage.insertemail("bianca@gmail.com");
			homePage.insertNome("Bianca Silva");
			homePage.insertSite("https://jovemnerd.com.br/");
			homePage.clickPublicarComentario();
		
		} catch (Exception error) {
			error.getMessage();
		}
	}
}
