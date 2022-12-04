# Getting Started with jmodev Development

This will be a short and quick guide to getting involved with jmodev development.  For more detailed information, please look in the documentation folder for a PDF and word document copy of a more formal documentation of the code.

## What's Going On?

When developing jmodev, I used a combination of VSCode and Apache Maven.  I strongly encourage future developers to do the same.  An overview of both is below.

This project uses Apache maven to handle package dependencies and building.  If you are unfamiliar with Maven, I strongly encourage you to read through their overview on their [website](https://maven.apache.org/guides/getting-started/ "Maven - Getting Started") (it will take around 35 minutes to complete if you are ensuring that you're reading and understanding everything).  I cannot explain how to use Maven better than they can, and it is an invaluable tool to developers everywhere, so learning about it is worth your time.

Visual Studio code is a great lightweight IDE that can be customized up to heavyweight by the use of its modular extensions feature.  Everyone uses their own set of extensions when working with projects, and some people even go further and disable some of them for certain projects.  Generally for VSCode, I'd recommend just searching the language you will be working with (in this case, Java), and selecting the most reputable extension or extension bundle.

## Building

When building with Maven, I had to do some magic to ensure that the dependencies got bundled into the .jar file with everything else (you can look to the .pom file for whats going on there).  The following command is the command you will use to build the file.  The file you will be looking for is the one with "`jar-with-dependencies`" in its name.  You run the command from the base level of the repository.  After reading the Maven guide that I've linked, the only thing in this line you should be confused by is the `assembly:single`, which takes all the dependencies and puts them into a .jar file with source code.

```
mvn clean compile assembly:single
```

## Testing

If you're looking at this repository, you've undoubtedly have had interaction with Professor Mike Lam at JMU.  I strongly encourage you talk to him about getting access to a repository with test .cfg files.  The testing package is largely empty because this is largely a GUI or I/O based program, and automating GUI or I/O based testing is often more trouble than its worth on projects like these (but if you would like to automate it, go ahead).  You will be running your "`jar-with-dependencies`" file in a repository with .cfg file and the program used to generate the data.

## Understanding the code

You can read the code comments for explanations as to what these files perform, but I'd only recommend that after reading the formal documentation in the documentation folder.  They will give you an overview of how the whole application works together, and what you might look towards changing.  In other words, the comments will give you an explanation of how the specifc section of code works, but the formal documentation will give a coherent overview on how each package and file works in the overall Java application.
