package Stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import IMDB_POM.OperationsIMDB;
import Utility.SeleniumUtility;
import WikipediaPOM.OperationsWikipedia;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WikipediaTest {

	WebDriver driver;
	OperationsWikipedia wiki;
	OperationsIMDB imdb;
	SeleniumUtility utility = new SeleniumUtility();
	String wikiReleaseDate, wikiRegion, imdbReleaseDate, imdbRegion;

	@Given("^open (.+) browser$")
	public void open_browser_enter(String browsername) {
		driver = utility.setUp(browsername);
	}

	@And("^enter wikipedia (.*)$")
	public void enter(String url) {
		wiki = new OperationsWikipedia(driver);
		wiki.getWikiMainPage(url);
	}

	@When("^search (.+) on wikipedia$")
	public void search_on_wekipedia(String moviename) {
		wiki.serchMovie(moviename);
	}

	@Then("^validate WikipediaPage (.+)$")
	public void validate_page(String expectedtitle) {
		String actualTitle = wiki.getMoviePageTitle();
		Assert.assertEquals(actualTitle, expectedtitle);
	}

	@And("^get movie (.+) & (.+) from WikipediaPage$")
	public void get_movie_(String detail1, String detail2) {
		wikiReleaseDate = wiki.getMovieDetails(detail1);
		wikiRegion = wiki.getMovieDetails(detail2);
		driver.close();
	}

	@Given("^enter IMDb (.*)$")
	public void enter_im_db_https_www_imdb_com(String url) {
		imdb = new OperationsIMDB(driver);
		imdb.getIMDbMainPage(url);
	}

	@When("^search (.+) on IMDb$")
	public void search_k_g_f_chapter_on_im_db(String moviename) {
		imdb.serchMovie(moviename);
	}

	@Then("^validate IMDbPage (.+)$")
	public void validate_im_db_page_k_g_f_chapter_im_db(String expectedtitle) {
		String actualTitle = imdb.getMoviePageTitle();
		Assert.assertEquals(actualTitle, expectedtitle);
	}

	@Then("^get movie (.+) & (.+) from IMDbPage$")
	public void get_movie_release_date_country_of_origin_from_im_db_page(String detail1, String detail2) {
		imdbReleaseDate = imdb.getMovieReleaseDate(detail1);
		imdbRegion = imdb.getMovieRegion(detail2);
		driver.close();
	}
	
    @Then("^validate release dates & regions of Wikipedia & IMDb$")
    public void validate_release_dates_regions_of_wikipedia_imdb() {
    	Assert.assertEquals( "Movie regions from IMDb & Wikipedia not matched", wikiRegion, imdbRegion);
    	System.out.println("Test pass : Movie regions from IMDb & Wikipedia matched");
    	Assert.assertEquals( "Movie release dates from IMDb & Wikipedia not matched", wikiReleaseDate, imdbReleaseDate);
    	System.out.println("Test pass : Movie release dates from IMDb & Wikipedia matched");
    }
}
