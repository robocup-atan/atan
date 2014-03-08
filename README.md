Atan [![Build Status](https://travis-ci.org/robocup-atan/atan.png?branch=master)](https://travis-ci.org/robocup-atan/atan) [![Coverage Status](https://coveralls.io/repos/robocup-atan/atan/badge.png?branch=master)](https://coveralls.io/r/robocup-atan/atan?branch=master)
===============
Atan is an interface to the 2D Soccer Server of Robocup's simulation league. It should allow you to concentrate on the job of controlling your clients without worrying about all the behind the scenes stuff between SServer and the clients.

More details can be found at http://robocup-atan.github.com/atan

Usage
-----
Atan is designed to be included in your project as an external library. To use Atan, just add the following to your pom.xml file.
```
    <dependencies>
        <dependency>
            <groupId>com.github.robocup-atan</groupId>
            <artifactId>atan</artifactId>
            <version>0.4.4</version>
            <type>jar</type>
        </dependency>
    </dependencies>
```

Building Atan
------------
To build Atan for yourself, you'll need:
* Git
* Maven
* JDK 1.6

Then just run the following commands. Maven will download any dependencies (such as [JavaCC](http://javacc.java.net)) and compile Atan for you.

<pre>
git clone git://github.com/robocup-atan/atan.git
cd atan
mvn clean install
</pre>

The generated .jar file can be found in your Maven repository, usually $HOME/.m2/repository/com/github/robocup-atan/atan/...

Example
-------
An example project using Atan can be found at https://github.com/robocup-atan/example-team

License
-------
Atan is free software released under the MIT License.
