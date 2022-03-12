package emailGenerator;

public class CreateEmailLogic {
	private String mail;
	private String pwd;
	private String capacity;
	
	public String generateMail(String name,String dept) {
		mail = name+"."+dept+"@company.com";
		System.out.println(mail);
		return mail;
	}
	public String generatePwd(int len) {
		String helper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&";
		char[] pwd = new char[len];
		for(int i=0;i<len;i++) {
			int r=(int)Math.random()*helper.length();
			pwd[i]=helper.charAt(r);
		}
		this.pwd= pwd.toString();
		System.out.println(pwd.toString());
		return pwd.toString();
		
	}

}
