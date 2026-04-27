package pgm1;
import org.testng.Assert;
import org.testng.annotations.Test;

public class resultTest {
	@Test
	public void testpass() {
		Assert.assertEquals(Result.display(6),"pass");
	}
	
	@Test
	public void testfail() {
		Assert.assertEquals(Result.display(4), "fail");
	}
	
	@Test
	public void testinvalid() {
		Assert.assertEquals(Result.display(-4),"invalid");
	}
	
}
