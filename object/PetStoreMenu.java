package page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PetStoreMenu {

	public static final String URL_MENU = "https://petstore.octoperf.com/actions/Catalog.action";

	public static final String FISH_URL = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=FISH";
	public static final String DOGS_URL = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=DOGS";
	public static final String CATS_URL = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=CATS";
	public static final String REPTILES_URL = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=REPTILES";
	public static final String BIRDS_URL = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=BIRDS";

	private static final String FISH_LEFT_XPATH = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/a[1]/img[1]";
	private static final String DOGS_LEFT_XPATH = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/a[2]/img[1]";
	private static final String CATS_LEFT_XPATH = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/a[3]/img[1]";
	private static final String REPTILES_LEFT_XPATH = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/a[4]/img[1]";
	private static final String BIRDS_LEFT_XPATH = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/a[5]/img[1]";

	private static final String FISH_TOP_XPATH = "/html[1]/body[1]/div[1]/div[4]/a[1]/img[1]";
	private static final String DOGS_TOP_XPATH = "/html[1]/body[1]/div[1]/div[4]/a[2]/img[1]";
	private static final String REPTILES_TOP_XPATH = "/html[1]/body[1]/div[1]/div[4]/a[3]/img[1]";
	private static final String CATS_TOP_XPATH = "/html[1]/body[1]/div[1]/div[4]/a[4]/img[1]";
	private static final String BIRDS_TOP_XPATH = "/html[1]/body[1]/div[1]/div[4]/a[5]/img[1]";

	private static final String FISH_PIC_XPATH = "/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/map[1]/area[2]";
	private static final String DOGS_PIC_XPATH = "/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/map[1]/area[3]";
	private static final String REPTILES_PIC_XPATH = "/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/map[1]/area[4]";
	private static final String CATS_PIC_XPATH = "/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/map[1]/area[5]";
	private static final String BIRDS_PIC_XPATH = "/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/map[1]/area[6]";

	// Vracanje na meni
	public static void navigateToMenu(WebDriver driver) {
		driver.navigate().to(URL_MENU);
	}

	// Levi meni
	public static void enterFishLeft(WebDriver driver) {
		driver.findElement(By.xpath(FISH_LEFT_XPATH)).click();
	}

	public static void enterDogsLeft(WebDriver driver) {
		driver.findElement(By.xpath(DOGS_LEFT_XPATH)).click();
	}

	public static void enterCatsLeft(WebDriver driver) {
		driver.findElement(By.xpath(CATS_LEFT_XPATH)).click();
	}

	public static void enterReptilesLeft(WebDriver driver) {
		driver.findElement(By.xpath(REPTILES_LEFT_XPATH)).click();
	}

	public static void enterBirdsLeft(WebDriver driver) {
		driver.findElement(By.xpath(BIRDS_LEFT_XPATH)).click();
	}

	// Meni na vrhu strane
	public static void enterFishTop(WebDriver driver) {
		driver.findElement(By.xpath(FISH_TOP_XPATH)).click();
	}

	public static void enterDogsTop(WebDriver driver) {
		driver.findElement(By.xpath(DOGS_TOP_XPATH)).click();
	}

	public static void enterReptilesTop(WebDriver driver) {
		driver.findElement(By.xpath(REPTILES_TOP_XPATH)).click();
	}

	public static void enterCatsTop(WebDriver driver) {
		driver.findElement(By.xpath(CATS_TOP_XPATH)).click();
	}

	public static void enterBirdsTop(WebDriver driver) {
		driver.findElement(By.xpath(BIRDS_TOP_XPATH)).click();
	}

	// Centralni meni sa fotografijama
	public static void enterFishPic(WebDriver driver) {
		driver.findElement(By.xpath(FISH_PIC_XPATH)).click();
	}

	public static void enterDogsPic(WebDriver driver) {
		driver.findElement(By.xpath(DOGS_PIC_XPATH)).click();
	}

	public static void enterReptilesPic(WebDriver driver) {
		driver.findElement(By.xpath(REPTILES_PIC_XPATH)).click();
	}

	public static void enterCatsPic(WebDriver driver) {
		driver.findElement(By.xpath(CATS_PIC_XPATH)).click();
	}

	public static void enterBirdsPic(WebDriver driver) {
		driver.findElement(By.xpath(BIRDS_PIC_XPATH)).click();
	}

}
