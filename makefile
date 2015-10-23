# This makefile works for a main class that belongs to the default package.
# Both the makefile and the main class should be in the root directory and other classes should be organized according to package.
# Consider this example directory structure within the archive file:
#	hbd140030.zip
#	--- makefile
#	--- Interface.java
#	--- TechServ.java
#	---Hardware.java
#	---ImgFrame.java
#	---Screenshot_1.jpg
#	---Screenshot_2.jpg
#	---Screenshot_3.jpg
#	---Screenshot_4.jpg
#	---Screenshot_5.jpg

# TODO: replace all instances of "MyMain" with the name of your main class.

all: Interface.class
	java Interface

Interface.class:
	javac *.java 
