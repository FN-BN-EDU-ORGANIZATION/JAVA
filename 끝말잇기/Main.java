package 끝말잇기;

import java.net.HttpURLConnection;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String key = "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";

		 ChatGpt gpt = new ChatGpt(key);
		 gpt.playWordChain();
}
}


