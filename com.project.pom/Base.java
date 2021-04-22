public class Base{
	private WebDriver driver;

	public Base(WebDriver driver){
		this.driver = driver;

	}

	public WebDriver chromeDriverConnection(){
		System.setProperty("webDriver.chrome.driver", "...");
		driver = new ChromeDriver();
		return driver;
	}

	public WebElement findElement(By locator){
		return drirve.findElement(locator);
	}

	public list<WebElement> findElements(By locator){
		return driver.findElements(locator);
	}

	public String getText(WebElement element){
		return element.getText();
	}

	public String getText(By locator){
		return driver.findElement().getText();
	}

	public void type(String inputText, By locator){
		driver.findElement(locator).sendKeys(inputText);
	}

	public void click(By locator){
		driver.findElement(locator).click();
	}

	public Boolean isDisplayed(By locator){
		try{
			return driver.findElement(locator.isDisplayed);
		}catch (org.openqa.selenium.NoSuchElementException e){
			return false

		}
	}

	public void visit(String url){
		driver.get(url);
	}	


}