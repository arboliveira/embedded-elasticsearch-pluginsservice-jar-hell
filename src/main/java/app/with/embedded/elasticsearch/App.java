package app.with.embedded.elasticsearch;

import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.node.Node;
import org.elasticsearch.node.NodeBuilder;

public class App {

	public static void main(String[] args) {
		new App().start();
	}

	public void start() {
		Node node = node();
		node.start();
	}

	private Node node() {
		NodeBuilder nodeBuilder = NodeBuilder.nodeBuilder();
		nodeBuilder.settings(settings());
		return nodeBuilder.node();
	}

	private Settings.Builder settings() {
		Settings.Builder builder = Settings.builder();
		builder.put("path.home", "pathhome");
		return builder;
	}

}