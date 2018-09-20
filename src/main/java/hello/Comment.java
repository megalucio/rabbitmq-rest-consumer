package hello;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Comment implements Serializable {

	private static final long serialVersionUID = -4344172839992715158L;

	Integer id;
	String body;
	Integer postId;

	public Comment() {
		super();
	}

	public Comment(String body, Integer postId) {
		super();
		this.body = body;
		this.postId = postId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	@Override
	public String toString() {
		return "Comment{" + "id='" + id + '\'' + ", body=" + body + ", postId=" + postId + '}';
	}

}
