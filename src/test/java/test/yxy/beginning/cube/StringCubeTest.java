package test.yxy.beginning.cube;

import me.yxy.beginning.cube.StringCube;

import org.junit.Assert;
import org.junit.Test;

public class StringCubeTest {

	@Test
	public void isEmptyTest(){
		Assert.assertTrue(StringCube.isEmpty(""));
		Assert.assertTrue(StringCube.isEmpty(null));
		Assert.assertFalse(StringCube.isEmpty(" "));
		Assert.assertFalse(StringCube.isEmpty("aab "));
	}
	
	
	@Test
	public void isNoContentTest(){
		Assert.assertTrue(StringCube.isNoContent(""));
		Assert.assertTrue(StringCube.isNoContent(null));
		Assert.assertTrue(StringCube.isNoContent(" "));
		Assert.assertFalse(StringCube.isNoContent("aab "));
	}
}
