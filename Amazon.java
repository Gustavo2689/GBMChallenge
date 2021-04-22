WebDriver driver; //creación del objeto WebDriver.
String baseUrl = "https://www.amazon.com.mx/"; //La variable baseUrl me va a ayudar a guardar la URL que voy a usar para entrar al sitio.

driver = new ChromeDriver();//Con esta instancia estoy abriendo el navegador.
driver.get(baseUrl);//Con esta función estoy diciendole a que sitio voy a navegar

driver.findElement(By.linkText("pantallas")).click();// Vamos a encontrar la palabra solicitada con la función findElement y a decirle que acción queremos que haga para obtener lo siguiente que nos piden.

driver.findElement(By.xpath(/html/body/div[1]/div[2]/span/div/span/h1/div/div[1]/div/div/span)).getText();//Con esta función estoy obteniendo, a partir del xpath del objeto que buscamos, la información que nos piden. En este caso los resultados de esa página.