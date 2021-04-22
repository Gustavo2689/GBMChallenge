public class RegisterPage extends Base{
	//Aquí irían los localizadores de la clase donde se encuentran los test cases de esta página de ejemplo Register Page.

	By registerLinkLocator = By.LinkText("REGISTER");
	By registerPageLocator = By.xpath("//img@src=/.../");

	By usernameLocator = By.id("email");
	By passwordLocator = By.name("password");
	By confirmPasswordLocator = By.cssSelector("input[name_´confirmPassword´]");

	By registerBtnLocator = By.name("register");
	By registerMessage = By.tagName("font");


	//Este constructor se genera de la clase Base
	public RegisterPage(WebDriver driver){
		super(driver);
		//TODO Auto generated constructor stub
	}

	//Aquí estamos concentrando varios métodos de la clase Base
	public void registerUser(){
		click(registerLinkLocator);
		Thread.sleep(2000);
		if(isDisplayed(registerPageLocator)){
			type("adminqa", usernameLocator);
			type("pass1", passwordLocator);
			type("pass1", confirmPasswordLocator);

			click(registerBtnLocator);

		}else{
			System.out.println("Register page wasn ot found")
		}

	}

	//Este método nos ayudará a confirmar el registro pero nuevamente usando métodos de la clase Base.
	public String registerMessage(){

		List<WebElement> fonts = findElements(registerMessage);
		return getText(fonts.get(5))
		
	}


}