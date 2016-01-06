package app.with.embedded.elasticsearch;

import org.junit.Test;

import app.with.embedded.elasticsearch.App;

public class AppTest {

	@Test
	public void demonstrateJarHell() {
		new App().start();
	}

}