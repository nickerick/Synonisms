# Synonisms
## Web application to spice up your words!

This web app is an active project designed to be a gag. User types in a phrase or sentence and computer will return a modified version. Sometimes it's funny, sometimes it's serious, sometimes its out control - it truly depends on the words you give it. 


## How it works
The web application is built on a Tomcat 9 server. User goes to the website, or in the demo's case localhost:8080. User types in text and hits the synomize button. The button makes a POST request to a java servlet. The java servlet sends the data to the processesing app which splits the string into individual words. Each word is sent to the [WordsAPI](https://www.wordsapi.com/). WordsAPI sends back a 'words similarTo' list and from there the program chooses the longest one. After the word goes through the processesing it's added to a new string. Once all words are processessed the string gets sent back to the servlet which then updates the jsp (similar to html) and displays to the user.
