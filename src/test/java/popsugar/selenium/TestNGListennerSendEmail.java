package popsugar.selenium;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.testng.IExecutionListener;

public class TestNGListennerSendEmail implements IExecutionListener{

	
	 public void onExecutionStart() {
		 System.out.println("所有case开始执行");
	 }

	  /**
	   * Invoked once all the suites have been run.
	   */
	 public void onExecutionFinish() {
			System.out.println("this is test----------------->");
			HtmlEmail mail = new HtmlEmail();
			mail.setHostName("smtp.163.com");
			mail.setAuthentication("lydialiu199403@163.com", "sinobot123");
			try {
				mail.setFrom("lydialiu199403@163.com");
				mail.addTo("102792557@qq.com");
				mail.setSubject("selenium subject");
				mail.setCharset("UTF-8");
				mail.setHtmlMsg("<a href=\"\"> 测试报告");
				EmailAttachment emailattachment = new EmailAttachment();
				emailattachment.setPath("E:\\Idea_project\\IdeaPopsugar2019\\report.html");
				emailattachment.setName("report.html");
				emailattachment.setDescription(EmailAttachment.ATTACHMENT);
				mail.attach(emailattachment);
				mail.send();
			} catch (EmailException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }
}
