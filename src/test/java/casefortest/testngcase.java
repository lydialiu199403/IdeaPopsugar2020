package casefortest;


        import org.testng.annotations.AfterClass;
        import org.testng.annotations.BeforeClass;
        import org.testng.annotations.Test;

        import junit.framework.Assert;

public class testngcase {

    @BeforeClass
    public void test01() {
        System.out.println("测试汉字BeforeClass--->test01");
    }

    @Test
    public void test0001() {
        Assert.assertTrue("不是正确的",4>2);
    }


    @Test
    public void test0002() {
        Assert.assertTrue("不是正确的",4>2);
    }
    /**
     * @author xin.wang
     * @see 测试方法执行结束后清理测试环境
     */
	/*@AfterMethod
	public void cleanEnv(ITestResult rs) throws Exception {
		try {
			PageObjectUtil.setPageObjMap(null);;
			if (!rs.isSuccess()) {
				if (reTryCount <= retryMaxCount) {
					success = false;
				}
				Throwable throwable = rs.getThrowable();
				System.out.println("=====测试用例: " + rs.getMethod().getMethodName() + " 运行失败，原因： "
						+ throwable.getMessage() + "=====");
				StackTraceElement[] se = throwable.getStackTrace();
				System.out.println("堆栈信息:");
				for (StackTraceElement e : se) {
					System.out.println(e.toString());
				}
			} else {
				reTryCount = 1;
				System.out.println("=====测试用例: " + rs.getMethod().getMethodName() + " 运行成功=====");
			}
			webDriver.close();
			webDriver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ExcuteDOSCommand.excuteBATFile(CommonConstants.KILL_DRIVER_PROCESS_BAT);
		}
	}*/
    @AfterClass
    public void test05() {
        System.out.println("AfterClass--->test05");
    }
}

