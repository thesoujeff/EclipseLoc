package dad.template.maven;

import java.util.ResourceBundle;

public class Main {

	public static void main(String[] args) {
		System.out.println(ResourceBundle.getBundle("properties/messages").getString("message"));
	}

}
