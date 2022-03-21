package com.java.assignment.question6;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;
public class Question6 {
	
	public static void main(String[] args)  throws IOException, InterruptedException{
		String uri = "https://httpbin.org/get";
		URL obj = new URL(uri);
		URLConnection con = obj.openConnection();
		Map<String, List<String>> map = con.getHeaderFields();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(uri)).GET().build();
		HttpClient client = HttpClient.newBuilder().build();
		try {
			HttpResponse<String> resp = client.send(request, BodyHandlers.ofString());
			for (Map.Entry<String, List<String>> entry : map.entrySet()) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
			System.out.println(resp.statusCode());
			System.out.println(resp.body());
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
