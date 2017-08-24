
public class LoginVO {
	
private String id;
private String pw;
private int m;

public LoginVO(String id, String pw, int m) {
	super();
	this.id = id;
	this.pw = pw;
	this.m = m;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPw() {
	return pw;
}
public void setPw(String pw) {
	this.pw = pw;
}
public int getM() {
	return m;
}
public void setM(int m) {
	this.m = m;
}

}
