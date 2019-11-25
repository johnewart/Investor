# Investor

This project provides an easy to use functionality to implement and evaluate automatic stock trading strategies. It is implemented in java and therefore can be used in any environment which builds on the JVM.

It provides the following functionality:

- Simple access to stock data
- Declarative formulation of trading strategies
- Evaluation of trading strategies
- Optimization of trading strategies
- Support of portfolio of multiple stocks / trading strategies
- At the end it should be possible to easily formulate and evaluate stock strategy and to evaluate the impact of changes on assumptions.

## Maven

You can add this library with the help of Maven to your project:

	<repositories>
	   <repository>
	     <id>github</id>
	     <name>GitHub pschatzmann Apache Maven Packages</name>
	     <url>https://maven.pkg.github.com/pschatzmann/Investor</url>
	   </repository>
   	</repositories>

	<dependency>
		<groupId>ch.pschatzmann</groupId>
		<artifactId>investor</artifactId>
		<version>1.1.0</version>
	</dependency>

## Documentation

- Jupyter Tutorial: https://github.com/pschatzmann/Investor-Blogs
- Javahelp: https://pschatzmann.ch/investor/index.html

## Change History

1.1.0
- Publish Maven Artifacts via GITHUB
- new API to access IEX data
- Removed private API keys from default values
- Use latest releases for 
  - Jackson (2.10.1)
  - ta4j (0.13)
