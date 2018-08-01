package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(id="comment")
    private WebElement comentario;
	
	@FindBy(id="email")
    private WebElement email;
	
	@FindBy(id="author")
    private WebElement authorComentario;
	
	@FindBy(id="url")
    private WebElement siteComentario;  
    
    @FindBy(id="comment-submit")
    private WebElement publicarComentariobtn;
    
    public HomePage() {
    	PageFactory.initElements(driver, this);
    }
    
    public void insertComment(String comentario) {
    	this.comentario.clear();
    	this.comentario.sendKeys(comentario);
    }
    
    public void insertemail(String email) {
    	this.email.clear();
    	this.email.sendKeys(email);
    }
    
    public void insertNome(String nome) {
    	this.authorComentario.clear();
    	this.authorComentario.sendKeys(nome);
    }
    
    public void insertSite(String site) {
    	this.siteComentario.clear();
    	this.siteComentario.sendKeys(site);
    }
        
    public void clickPublicarComentario() {
    	this.publicarComentariobtn.click();
    }
    
}
