package com.geertvanderploeg.maven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

/**
 * Goal which displays a banner
 *
 * @goal banner
 * @phase clean
 */
public class BannerMojo extends AbstractMojo {

  /**
   * Location of the banner..
   *
   * @parameter expression="${project.resource.directory}/banner.txt"
   * @required
   */
  private File bannerFile;

  public void execute() throws MojoExecutionException {
    String bannerText;
    try {
      bannerText = new Scanner(bannerFile).useDelimiter("\\A").next();
      getLog().info(bannerText);
    } catch (FileNotFoundException e) {
      getLog().info("No banner file found at " + bannerFile + ". banner-maven-plugin cannot display banner.");
    }
  }
}
