# State Pattern

keeps the code simple by avoiding multiple conditions for an operation
Take an example of a music player
you have a center button that works both for play and pause
how a simple condition looks like
if(button.isPressed){
if(mediaPlayer.isPlaying){
mediaPlayer.isPlaying = false;
....

so many condition for just a button press
instead create states that will handle this work, all we need to do is pass the object
and the interface will handle the operation