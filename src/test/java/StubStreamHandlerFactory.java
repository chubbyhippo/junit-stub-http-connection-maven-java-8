import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;

public class StubStreamHandlerFactory implements URLStreamHandlerFactory {

	@Override
	public URLStreamHandler createURLStreamHandler(String protocol) {
		return new StubHttpURLStreamHandler();
	}

}
