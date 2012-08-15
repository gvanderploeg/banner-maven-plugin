Banner Maven Plugin
===================
A Maven plugin that displays an ASCII banner when running a build.

## About
For this plugin I got inspired by Dropwizard. 
Dropwizard has this feature that displays a banner file upon startup, if included in src/main/resources/banner.txt.

When doing a hybrid project (not yet knowing whether we would produce a Dropwizard-jar or a servlet-webapp) I wanted to keep things as portable as possible (not creating too much Dropwizard-specific parts)
So, as this banner file quite Dropwizard-agnostic, I included it in our source.
But of course I also wondered whether there would be a way to display it with Maven-builds as well.

Not having found an existing plugin, banner-maven-plugin was born.

    Mental note to self: display the banner upon webapp-startup as well (with a contextListener?)

## Usage

TODO
