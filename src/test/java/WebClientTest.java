import static org.junit.jupiter.api.Assertions.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class WebClientTest {

	@BeforeAll
	public static void setUp() {
		URL.setURLStreamHandlerFactory(new StubStreamHandlerFactory());
	}

	@Test
	public void testGetContentOk() throws MalformedURLException {
		WebClient client = new WebClient();
		String workingContent = client.getContent(new URL("http://localhost"));
		assertEquals("<h1>It works</h1>", workingContent);
	}

}
