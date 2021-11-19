package Controllers;
import org.junit.Test;

import model.ListRepositories;
import play.Application;
import play.inject.guice.GuiceApplicationBuilder;
import play.test.WithApplication;
import services.RepositoryFetching;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * 
 * @author piedamsel46_
 *
 */

public class RepositoryFetchingTest extends WithApplication {
	
	@Override
    protected Application provideApplication() {
        return new GuiceApplicationBuilder().build();
    }

	final List<String> loginList = Arrays.asList(
			"Jimicreator","jjs576","aakashtyagiwmp","ytwahs", "Afsalon","Tuhsarshrivastav","awesome-yasin",
			"Vretlee","srimanraj", "Vretlee","instagram-webclone", "TheBoy-WhoCode", "miraj-code","UltimatumGamer","Incognito-Coder",
			"nayakpuradarshan", "Han-Joon-Hyeok", "jaydutt31", "Daniil-Solo", "Wiyiiong", "kkirby16","Hackr-Sach","acastillocc",
			"Mainsupport", "andhika16","AnhHoangQuach","utkucfc","brvale","asity-tech","clippefuentes"
				);
	final List<String> nameList = Arrays.asList(
			"Instagram-Bot", "django-instagram", "androidUserProfilePageAsInstagram", "lessonUML","Instagram-Clone", "AdonisJs_instagram-clone",
			"Media-Downloader","ZPhisher", "Decentragram-instagram", "WhatsApp-Crasher","Instagram_FE","Instagram_FE",
			"Insta-Scrapy", "UltimatumGamer","Instagram-Tools", "AutomationFramework-Instagram","instagram-comment-scraper","getinstadp",
			"InstagramBot","Ig_Bot", "photo-sharer-backend", "chainlink-hackathon-project","InstagramReact","Tool-Instagram",
			"instagramClone", "instagram-frontend", "instagramclone", "Login-Instagram", "asity-insta-kage","MERNInstagram"
			);
	
	final List<String> urlList = Arrays.asList(
			"https://api.github.com/users/Jimicreator", "https://api.github.com/repos/Jimicreator/Instagram-Bot","https://avatars.githubusercontent.com/u/46480412?v=4",
			"https://api.github.com/users/aakashtyagiwmp","https://api.github.com/users/ytwahs","https://api.github.com/users/Afsalon","https://api.github.com/users/Tuhsarshrivastav",
			"https://api.github.com/users/awesome-yasin","https://api.github.com/users/Vretlee","https://api.github.com/users/srimanraj","https://api.github.com/users/Vretlee",
			"https://api.github.com/repos/Vretlee/WhatsApp-Crasher","https://api.github.com/repos/Vretlee/WhatsApp-Crasher","https://api.github.com/users/TheBoy-WhoCode","https://api.github.com/users/miraj-code",
			"https://api.github.com/users/UltimatumGamer","https://api.github.com/users/Incognito-Coder","https://api.github.com/users/nayakpuradarshan","https://api.github.com/users/Han-Joon-Hyeok","https://api.github.com/users/jaydutt31",
			"https://api.github.com/users/Daniil-Solo","https://api.github.com/users/Wiyiiong","https://api.github.com/users/kkirby16","https://api.github.com/users/Hackr-Sach",
			"https://api.github.com/users/acastillocc","https://api.github.com/users/Mainsupport","https://api.github.com/users/andhika16","https://api.github.com/users/AnhHoangQuach","https://api.github.com/users/utkucfc",
			"https://api.github.com/users/brvale", "https://api.github.com/users/asity-tech","https://api.github.com/users/clippefuentes","https://api.github.com/repos/clippefuentes/MERNInstagram",
			"https://api.github.com/repos/asity-tech/asity-insta-kage","https://api.github.com/repos/brvale/Login-Instagram","https://api.github.com/repos/utkucfc/instagramclone","https://api.github.com/repos/AnhHoangQuach/instagram-frontend","https://api.github.com/repos/andhika16/instagramClone",
			"https://api.github.com/repos/Mainsupport/Tool-Instagram","https://api.github.com/repos/acastillocc/InstagramReact","https://api.github.com/repos/Hackr-Sach/chainlink-hackathon-project","https://api.github.com/repos/kkirby16/photo-sharer-backend","https://api.github.com/repos/Wiyiiong/Ig_Bot",
			"https://api.github.com/repos/Daniil-Solo/InstagramBot","https://api.github.com/repos/jaydutt31/getinstadp","https://api.github.com/repos/Han-Joon-Hyeok/instagram-comment-scraper",
			"https://api.github.com/repos/nayakpuradarshan/AutomationFramework-Instagram","https://api.github.com/repos/Incognito-Coder/Instagram-Tools","https://api.github.com/repos/UltimatumGamer/UltimatumGamer","https://api.github.com/repos/miraj-code/Insta-Scrapy",
			"https://api.github.com/repos/TheBoy-WhoCode/instagram_reels","https://api.github.com/repos/instagram-webclone/Instagram_FE","https://api.github.com/repos/Vretlee/WhatsApp-Crasher","https://api.github.com/repos/srimanraj/Decentragram-instagram",
			"https://api.github.com/repos/Vretlee/ZPhisher","https://api.github.com/repos/awesome-yasin/Media-Downloader","https://api.github.com/repos/Tuhsarshrivastav/AdonisJs_instagram-clone","https://api.github.com/repos/Afsalon/Instagram-Clone","https://api.github.com/repos/ytwahs/lessonUML",
			"https://api.github.com/repos/aakashtyagiwmp/androidUserProfilePageAsInstagram","https://api.github.com/repos/jjs576/django-instagram","https://api.github.com/repos/jjs576/django-instagram"
			);
	
	
	final List<String> issues_urlList = Arrays.asList(
			"https://api.github.com/repos/Jimicreator/Instagram-Bot/issues{/number}","https://api.github.com/repos/jjs576/django-instagram/issues{/number}","https://api.github.com/repos/aakashtyagiwmp/androidUserProfilePageAsInstagram/issues{/number}","https://api.github.com/repos/ytwahs/lessonUML/issues{/number}",
			"https://api.github.com/repos/Afsalon/Instagram-Clone/issues{/number}","https://api.github.com/repos/Tuhsarshrivastav/AdonisJs_instagram-clone/issues{/number}","https://api.github.com/repos/awesome-yasin/Media-Downloader/issues{/number}",
			"https://api.github.com/repos/Vretlee/ZPhisher/issues{/number}","https://api.github.com/repos/srimanraj/Decentragram-instagram/issues{/number}","https://api.github.com/repos/Vretlee/WhatsApp-Crasher/issues{/number}","https://api.github.com/repos/instagram-webclone/Instagram_FE/issues{/number}",
			"https://api.github.com/repos/TheBoy-WhoCode/instagram_reels/issues{/number}","https://api.github.com/repos/miraj-code/Insta-Scrapy/issues{/number}","https://api.github.com/repos/UltimatumGamer/UltimatumGamer/issues{/number}",
			"https://api.github.com/repos/Incognito-Coder/Instagram-Tools/issues{/number}",
			"https://api.github.com/repos/nayakpuradarshan/AutomationFramework-Instagram/issues{/number}","https://api.github.com/repos/Han-Joon-Hyeok/instagram-comment-scraper/issues{/number}","https://api.github.com/repos/jaydutt31/getinstadp/issues{/number}",
			"https://api.github.com/repos/Daniil-Solo/InstagramBot/issues{/number}","https://api.github.com/repos/Wiyiiong/Ig_Bot/issues{/number}","https://api.github.com/repos/kkirby16/photo-sharer-backend/issues{/number}","https://api.github.com/repos/Hackr-Sach/chainlink-hackathon-project/issues{/number}",
			"https://api.github.com/repos/acastillocc/InstagramReact/issues{/number}","https://api.github.com/repos/acastillocc/InstagramReact/issues{/number}","https://api.github.com/repos/Mainsupport/Tool-Instagram/issues{/number}","https://api.github.com/repos/andhika16/instagramClone/issues{/number}",
			"https://api.github.com/repos/AnhHoangQuach/instagram-frontend/issues{/number}","https://api.github.com/repos/utkucfc/instagramclone/issues{/number}","https://api.github.com/repos/brvale/Login-Instagram/issues{/number}","https://api.github.com/repos/asity-tech/asity-insta-kage/issues{/number}","https://api.github.com/repos/clippefuentes/MERNInstagram/issues{/number}"
			
			);
	
	final List<String> commit_urlList = Arrays.asList(
			"https://api.github.com/repos/Jimicreator/Instagram-Bot/commits{/sha}","https://api.github.com/repos/Jimicreator/Instagram-Bot/commits{/sha}","https://api.github.com/repos/jjs576/django-instagram/commits{/sha}","https://api.github.com/repos/ytwahs/lessonUML/commits{/sha}",
			"https://api.github.com/repos/Afsalon/Instagram-Clone/commits{/sha}","https://api.github.com/repos/Tuhsarshrivastav/AdonisJs_instagram-clone/commits{/sha}","https://api.github.com/repos/awesome-yasin/Media-Downloader/commits{/sha}","https://api.github.com/repos/Vretlee/ZPhisher/commits{/sha}",
			"https://api.github.com/repos/srimanraj/Decentragram-instagram/commits{/sha}","https://api.github.com/repos/Vretlee/WhatsApp-Crasher/commits{/sha}","https://api.github.com/repos/instagram-webclone/Instagram_FE/commits{/sha}","https://api.github.com/repos/TheBoy-WhoCode/instagram_reels/commits{/sha}",
			"https://api.github.com/repos/miraj-code/Insta-Scrapy/commits{/sha}","https://api.github.com/repos/UltimatumGamer/UltimatumGamer/commits{/sha}","https://api.github.com/repos/Incognito-Coder/Instagram-Tools/commits{/sha}","https://api.github.com/repos/nayakpuradarshan/AutomationFramework-Instagram/commits{/sha}",
			"https://api.github.com/repos/Han-Joon-Hyeok/instagram-comment-scraper/commits{/sha}","https://api.github.com/repos/jaydutt31/getinstadp/commits{/sha}","https://api.github.com/repos/Daniil-Solo/InstagramBot/commits{/sha}","https://api.github.com/repos/Wiyiiong/Ig_Bot/commits{/sha}","https://api.github.com/repos/kkirby16/photo-sharer-backend/commits{/sha}",
			"https://api.github.com/repos/Hackr-Sach/chainlink-hackathon-project/commits{/sha}","https://api.github.com/repos/acastillocc/InstagramReact/commits{/sha}","https://api.github.com/repos/Mainsupport/Tool-Instagram/commits{/sha}","https://api.github.com/repos/Mainsupport/Tool-Instagram/commits{/sha}","https://api.github.com/repos/AnhHoangQuach/instagram-frontend/commits{/sha}",
			"https://api.github.com/repos/utkucfc/instagramclone/commits{/sha}","https://api.github.com/repos/brvale/Login-Instagram/commits{/sha}","https://api.github.com/repos/asity-tech/asity-insta-kage/commits{/sha}","https://api.github.com/repos/clippefuentes/MERNInstagram/commits{/sha}"
			);
	
	@Test
	public void logintest() throws Exception {
		String expected = "login";
		RepositoryFetching repositories = new RepositoryFetching();
		assertEquals(expected, repositories);
	}
	
	
	@Test
	public void nameList() throws Exception {
		String expected = "name";
		RepositoryFetching repositories = new RepositoryFetching();
		assertEquals(expected, repositories);
	}
	
	@Test
	public void urlList() throws Exception {
		String expected = "url";
		RepositoryFetching repositories = new RepositoryFetching();
		assertEquals(expected, repositories);
	}
	
	@Test
	public void issues_urlList() throws Exception {
		String expected = "issues_url";
		RepositoryFetching repositories = new RepositoryFetching();
		assertEquals(expected, repositories);
	}
	
	@Test
	public void commit_urlList() throws Exception {
		String expected = "commit_url";
		RepositoryFetching repositories = new RepositoryFetching();
		assertEquals(expected, repositories);
	}
	
	
	
	

}
