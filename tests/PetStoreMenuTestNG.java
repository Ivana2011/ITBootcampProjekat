package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import page.object.PetStoreMenu;

public class PetStoreMenuTestNG {

	public void wait2() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void fishTest() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		SoftAssert sa = new SoftAssert();

		driver.navigate().to(PetStoreMenu.URL_MENU);
		driver.manage().window().maximize();
		wait2();

		PetStoreMenu.enterFishLeft(driver);
		String fishLeftUrl = driver.getCurrentUrl();

		driver.navigate().to(PetStoreMenu.URL_MENU);
		wait2();
		PetStoreMenu.enterFishTop(driver);
		String fishTopUrl = driver.getCurrentUrl();
		wait2();

		driver.navigate().to(PetStoreMenu.URL_MENU);
		wait2();
		PetStoreMenu.enterFishPic(driver);
		wait2();
		String fishPicUrl = driver.getCurrentUrl();

		driver.close();

		if (fishLeftUrl.contains("jsessionid") || fishTopUrl.contains("jsessionid")
				|| fishPicUrl.contains("jsessionid")) {
			if (fishLeftUrl.contains("FISH") && fishTopUrl.contains("FISH") && fishPicUrl.contains("FISH")) {
				fishLeftUrl = "";
				fishTopUrl = "";
				fishPicUrl = "";
			}
		}

		sa.assertEquals(fishLeftUrl, fishTopUrl, fishPicUrl);
	}

	@Test
	public void dogsTest() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		SoftAssert sa = new SoftAssert();

		driver.navigate().to(PetStoreMenu.URL_MENU);
		driver.manage().window().maximize();
		wait2();

		PetStoreMenu.enterDogsLeft(driver);
		String dogsLeftUrl = driver.getCurrentUrl();

		driver.navigate().to(PetStoreMenu.URL_MENU);
		wait2();
		PetStoreMenu.enterDogsTop(driver);
		wait2();
		String dogsTopUrl = driver.getCurrentUrl();

		driver.navigate().to(PetStoreMenu.URL_MENU);
		wait2();
		PetStoreMenu.enterDogsPic(driver);
		wait2();
		String dogsPicUrl = driver.getCurrentUrl();

		driver.close();

		if (dogsLeftUrl.contains("jsessionid") || dogsTopUrl.contains("jsessionid")
				|| dogsPicUrl.contains("jsessionid")) {
			if (dogsLeftUrl.contains("FISH") && dogsTopUrl.contains("FISH") && dogsPicUrl.contains("FISH")) {
				dogsLeftUrl = "";
				dogsTopUrl = "";
				dogsPicUrl = "";
			}
		}

		sa.assertEquals(dogsLeftUrl, dogsTopUrl, dogsPicUrl);
	}

	@Test
	public void catsTest() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		SoftAssert sa = new SoftAssert();

		driver.navigate().to(PetStoreMenu.URL_MENU);
		driver.manage().window().maximize();
		wait2();

		PetStoreMenu.enterCatsLeft(driver);
		wait2();
		String catsLeftUrl = driver.getCurrentUrl();

		driver.navigate().to(PetStoreMenu.URL_MENU);
		wait2();
		PetStoreMenu.enterCatsTop(driver);
		wait2();
		String catsTopUrl = driver.getCurrentUrl();

		driver.navigate().to(PetStoreMenu.URL_MENU);
		wait2();
		PetStoreMenu.enterCatsPic(driver);
		wait2();
		String catsPicUrl = driver.getCurrentUrl();

		driver.close();

		if (catsLeftUrl.contains("jsessionid") || catsTopUrl.contains("jsessionid")
				|| catsPicUrl.contains("jsessionid")) {
			if (catsLeftUrl.contains("FISH") && catsTopUrl.contains("FISH") && catsPicUrl.contains("FISH")) {
				catsLeftUrl = "";
				catsTopUrl = "";
				catsPicUrl = "";
			}
		}

		sa.assertEquals(catsLeftUrl, catsTopUrl, catsPicUrl);
	}

	@Test
	public void reptilesTest() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		SoftAssert sa = new SoftAssert();

		driver.navigate().to(PetStoreMenu.URL_MENU);
		driver.manage().window().maximize();
		wait2();

		PetStoreMenu.enterReptilesLeft(driver);
		wait2();
		String reptilesLeftUrl = driver.getCurrentUrl();

		driver.navigate().to(PetStoreMenu.URL_MENU);
		wait2();
		PetStoreMenu.enterReptilesTop(driver);
		wait2();
		String reptilesTopUrl = driver.getCurrentUrl();

		driver.navigate().to(PetStoreMenu.URL_MENU);
		wait2();
		PetStoreMenu.enterReptilesPic(driver);
		wait2();
		String reptilesPicUrl = driver.getCurrentUrl();

		driver.close();

		if (reptilesLeftUrl.contains("jsessionid") || reptilesTopUrl.contains("jsessionid")
				|| reptilesPicUrl.contains("jsessionid")) {
			if (reptilesLeftUrl.contains("FISH") && reptilesTopUrl.contains("FISH")
					&& reptilesPicUrl.contains("FISH")) {
				reptilesLeftUrl = "";
				reptilesTopUrl = "";
				reptilesPicUrl = "";
			}
		}

		sa.assertEquals(reptilesLeftUrl, reptilesTopUrl, reptilesPicUrl);
	}

	@Test
	public void birdsTest() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		SoftAssert sa = new SoftAssert();

		driver.navigate().to(PetStoreMenu.URL_MENU);
		driver.manage().window().maximize();
		wait2();

		PetStoreMenu.enterBirdsLeft(driver);
		wait2();
		String birdsLeftUrl = driver.getCurrentUrl();

		driver.navigate().to(PetStoreMenu.URL_MENU);
		wait2();
		PetStoreMenu.enterBirdsTop(driver);
		wait2();
		String birdsTopUrl = driver.getCurrentUrl();

		driver.navigate().to(PetStoreMenu.URL_MENU);
		wait2();
		PetStoreMenu.enterBirdsPic(driver);
		wait2();
		String birdsPicUrl = driver.getCurrentUrl();

		driver.close();

		if (birdsLeftUrl.contains("jsessionid") || birdsTopUrl.contains("jsessionid")
				|| birdsPicUrl.contains("jsessionid")) {
			if (birdsLeftUrl.contains("FISH") && birdsTopUrl.contains("FISH") && birdsPicUrl.contains("FISH")) {
				birdsLeftUrl = "";
				birdsTopUrl = "";
				birdsPicUrl = "";
			}
		}

		sa.assertEquals(birdsLeftUrl, birdsTopUrl, birdsPicUrl);
	}
}
