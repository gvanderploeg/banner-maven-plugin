package com.geertvanderploeg.maven;

import java.io.File;

/**
 * Goal which displays a banner
 *
 * @goal show
 *
 * @phase process-sources
 */
public class BannerMojo {

  /**
   * Location of the banner..
   *
   * @parameter expression="${project.resource.directory}/banner.txt"
   * @required
   */
  private File bannerFile;
}
