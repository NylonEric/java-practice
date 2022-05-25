# Java Practice

> A collection of source code examples and design patterns for work in java.

- Information on JIT compiling and binaries:
https://javapapers.com/core-java/java-binary/#:~:text=Java%20source%20file%20is%20compiled,are%20interpreted%20using%20JVM%20directly

## Installation

OS X:
https://mkyong.com/java/how-to-install-java-on-mac-osx/#manual-install-java-early-access-builds-on-macos

1. Download tar.gz

```sh
sudo tar xvzf ~/Downloads/OpenJDK11U-jdk_x64_mac_hotspot_11.0.15_10.tar.gz -C /Library/Java/JavaVirtualMachines
```

- Check for downloaded directory:
```sh
ls -lsa /Library/Java/JavaVirtualMachines

```

2. Update Path:
```sh
echo 'export PATH="/Library/Java/JavaVirtualMachines/jdk-11.0.15+10/Contents/Home/bin:$PATH"' >> ~/.zshrc

```
3. Test version and path:
```sh
source ~/.zshrc
java --version
```

## Usage example

- To compile a .java file:
```sh
javac HelloWorld.java
```
- To run resulting .class file:

```sh
java HelloWorld
```

## Development setup

## Release History

## Meta

## Contributing