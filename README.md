## CSCI 370 - Team TBA - Project CollegeHub

## Table of Contents

* [About the Project](#about-the-project)
  * [Built With](#built-with)
* [Getting Started](#getting-started)
  * [Prerequisites](#prerequisites)
  * [Installation](#installation)
* [Usage](#usage)
* [Zip File Description](#zip-file-description)
* [The Team](#the-team)
* [Honor Statements](#honor-statements)

## About The Project

CollegeHub was created as final project submission for CSCI 370 class with professor Bon Sy at Queens College. More about the team [here](#the-team)

CollegeHub aims to tackle the problem statement by making the college experience a little less overwhelming. CollegeHub aggregates course resources under one roof where students can get up-to-date information about their specific classes that include details about the professor, office hours, exam/homework/assignment schedule, grading policy, discord invite, etc. 

Our dreams were big with this project, however due to time, skill, and resource constraints (with the added bonus of the current pandemic situation) we were unable to implement everything we had envisioned.

Here's what we were able to get done:
* Basic Homepage that display a Course card
* A course page that displays Professor and Course details (incl. schedule)
* Decent UI
* Proper Firebase and Cloud Firestore integration
* A working app

Here's what we were unable to get done:
* User authentication
* Colleges
* Adding or updating fields
* Displaying multiple courses

We were unable to get a lot done mainly due to lack of familiarity with the technology but factors like pressure from other classes, not being able to meet in person, lackluster availability of everyone, personal issues and most importantly time played a major role too. However, we tried to the best of our abilities to build a minimal viable product as a concept.

### Built With

CollegeHub was built using

* [Android Studio](https://developer.android.com/studio)
* [Firebase](https://firebase.google.com/)
* [Cloud Firestore](https://firebase.google.com/docs/firestore)
* [GitHub](https://github.com/th3pi/CS370-Team-TBA)
* [Java](https://en.wikipedia.org/wiki/Java_(programming_language))

## Getting Started

Here's what you need to do get our project running locally on your machine.

### Prerequisites

First make sure to have the following application(s) installed or file(s) downloaded: 

* [Android Studio](https://developer.android.com/studio) is required to compile and run the application
* [TeamTBA-CollegeHub.zip](https://github.com/th3pi/CS370-Team-TBA/archive/master.zip) - The project files

### Installation

1. Download the project files and extract the project files zip
2. Install Android Studio
3. Open Android Studio then on the landing page select "Open an Existing Project"

![scr1](https://i.imgur.com/iLE0KWh.png)

4. Navigate to where the project files were extracted. You should see the android logo which instead of a regular folder icon on the Project folder. Select and Open.

![scr2](https://i.imgur.com/UAE1h3K.png)

5. Give it a few seconds for Android Studio to index all the files and build gradle dependencies. Once done, click Run to run the app on your emulator or device (depends on your setup)

![scr3](https://i.imgur.com/KSd7qW8.png)

6. After Android Studio is done building the project you should be greeted with our very minimal and barebones homepage.

![scr4](https://i.imgur.com/3nj8322.png)

## Usage

Brief description of all the components in the app

* Homepage: A list of courses subscribed to by the user are displayed on this screen

![scr5](https://i.imgur.com/3nj8322.png)

* Course Page: Detailed information about a specific course including schedule and professor details

![scr6](https://i.imgur.com/NC4Vnep.png)


## Zip File Description

Description of all the different directories and files in our zip submission

```bash
├───.gradle // Gradle Build files
├───.idea // Android Studio IDE settings directory - this directory is what indicates that this is an Android App Project
├───app
│   ├───build // Contains build files for Android Studio - Not entirely relevant
│   ├───release // Contains the release APK of CollegeHub
│   └───src
│       └───main // Main directory of the project
│           ├───java
│           │   ├───com
│           │   │   └───compsci
│           │   │       └───collegehub
│           │   │           └───activities // Android activities - Basically each page of the app
│           │   ├───models // Plain Old Java Objects for entities
│           │   └───utils // Util classes to perform functions using the entities mainly used to interact with Firebase
│           └───res // Resource files, like layout, colors, strings, themes, icons etc.
└───gradle // gradle build files
│   └───wrapper
│
│
└───UML Diagrams // Contains project UML diagrams
│
│
└───Readme.md // This file. Contains everything you need to know about the project
```

## The Team

Details about the team members and how work was divided is described below:

1. Tanjimul H. Bhuiyan
 - Project Documentation
 - Homepage
 - Course page
 - Firebase Integration
 - Project structuring and management
2. Matthew Rodriguez
 - Project ideation
 - Course page
 - Design
3. Carlos Aucacama
 - Course page
 - Course data
 - Testing
 - Research
4. Joseph Cabrera
 - Testing
 - Course page
 - Project ideation
 - Design
 
## Honor Statements

1. Tanjimul H. Bhuiyan 
 > I, Tanjimul H. Bhuiyan, certify that my teammates have been a great resource to this project. They tried to contribute whenever necessary and in whatever ways possible. Their input, feedback and willingness to work on this project has made this entire experience a delight although I wish we could work on this project in-person because effective communication had become a major obstacle at one point. In any case, I would like to commend my teammates for their hardwork.

  - [x] Signed Tanjimul H. Bhuiyan 12/20/2020
2. Matthew Rodriguez
> Honor statement here

- [ ] Not yet signed
3. Carlos Aucacama
> Honor statement here

- [ ] Not yet signed
4. Joseph Cabrera
> Honor statement here

- [ ] Not yet signed

