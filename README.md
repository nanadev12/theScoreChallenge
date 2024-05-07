TheScore App Test Automation

Appium Setup Guide for (Android Device Testing)


Prerequisites

1.JDK Installation:
-

Install Java Development Kit (JDK) from the official Oracle website.

2.NodeJS and NPM:
-
Install NodeJS and NPM from the official Node.js website.

3.Appium Installation:
-
Install Appium globally using NPM
npm install -g appium@latest

4.Android Driver Installation:
-
Install the UIAutomator2 driver for Android
using the command following i.e
appium driver install uiautomator2


Testing Setup

5.Connect Device:
-
Connect your mobile device to your Mac using a charger cable.

6.Start Appium server 
-
Start the Appium server by running the following command  in the terminal i.e appium

7.SetUp device details
-
Go to android.properties available in root folder then update the platform version of your android phone

8.Run test case
-
Go to root folder of the project then run the following command i,e mvn clean install

Pre-requisites: 
-
-Incase if you are running on real android phone ,make sure theScore app is installed

-Enable developer tools by tapping on build number 5 times available in about phone 

-Enable USB debugging


Incase of emulator - Just install the theScoreApk



