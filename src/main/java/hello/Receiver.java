package hello;

import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Receiver {

	@Autowired
	RestTemplate restTemplate;

	private CountDownLatch latch = new CountDownLatch(1);

	public void receiveMessage(Comment comment) {

		HttpHeaders headers = new HttpHeaders();

		headers.add(HttpHeaders.CONTENT_TYPE, "application/json");
		headers.add(HttpHeaders.ACCEPT, "application/json");

		HttpEntity<Comment> request = new HttpEntity<>(comment, headers);

		Comment createdComment = restTemplate.postForObject("http://localhost:3000/comments", request, Comment.class);

		System.out.println("Processed <" + createdComment.toString() + ">");
		latch.countDown();
	}

	public CountDownLatch getLatch() {
		return latch;
	}

}
