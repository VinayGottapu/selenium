package Test_NG;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listenerclass_demo implements ITestListener{

	@Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed: " + result.getName());
        System.out.println("failed");
        try {
			login_fail_listener.screenshort();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}
