# Blood Bank #
Blood Bank is an Android app that uses Firebase Realtime Database to collect and organize information of blood donors with fast and efficent search.

(A google-services.json file has to be generated for your application using Firebase Console)

## Prerequisites ##
* Android Studio 1.2+ 
* google-services.json file generated for your application.
* Android SDK (This version is written for SDK 25 as target.)

NB: A stable internet connection is required for first build. 

## Build Instructions ##

You first need to generate the local.properties (replace YOUR_SDK_DIR with your actual android SDK directory) file and create the gradle.properties file:

    $ echo "sdk.dir=YOUR_SDK_DIR" > local.properties
    $ cp ./gradle.properties-example ./gradle.properties

NB: This is the default ./gradle.properties file.
Incase of any build error, please make sure you are connected to a stable Internet. First build time will depend upon your machine and Internet speed.

## Apps built using this Project ##
Midipp - [Google Play](https://play.google.com/store/apps/details?id=com.reonsaji.midipp)
         [GitHub](https://github.com/Webloud/Midipp)
