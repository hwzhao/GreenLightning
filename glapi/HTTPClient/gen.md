# What you will need before you start:
-[Java 8](https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html) 

-[Maven](https://maven.apache.org/install.html), which downloads and manages the libraries and APIs needed to get the Grove device working.

-[Git](https://git-scm.com/), which clones a template Maven project with the necessary dependencies already set up.

# Starting your Maven project: 
[Starting a mvn project](https://github.com/oci-pronghorn/FogLighter/blob/master/README.md)

# Example project:
 
Demo code:
.include "./src/main/java/com/ociweb/oe/greenlightning/api/HTTPClient.java"
Behavior class:
.include "./src/main/java/com/ociweb/oe/greenlightning/api/HTTPGetBehaviorChained.java"
.include "./src/main/java/com/ociweb/oe/greenlightning/api/HTTPGetBehaviorSingle.java"
.include "./src/main/java/com/ociweb/oe/greenlightning/api/HTTPResponse.java"
 
This class is a simple demonstration of an HTTP Client. HTTP Client will send a request out to an HTTP Server. In this case, the client is sending a request to go to "www.objectcomputing.com".