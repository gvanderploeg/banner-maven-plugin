package com.geertvanderploeg.maven;

import java.io.File;

import org.apache.maven.plugin.testing.AbstractMojoTestCase;

public class BannerMojoTest extends AbstractMojoTestCase {

  public void testSomething()
      throws Exception {
    File pom = getTestFile("src/test/resources/unit/test-project/pom.xml");
    File boo = new File("");
    System.out.println(pom.getAbsolutePath());
    assertTrue(pom.exists());

    BannerMojo bannerMojo = (BannerMojo) lookupMojo("banner", pom);
    assertNotNull(bannerMojo);
    bannerMojo.execute();
    // hard to test that banner has actually been put to console...

    /*
     FIXME: right now this tests actually outputs the banner from the plugin project itself. Apparently the above code
      does not really create an atonomous project ('test-project').. ${basedir} still refers to the plugin's basedir.
      */

  }
}
