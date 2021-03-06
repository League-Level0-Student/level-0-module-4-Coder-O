
import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;

boolean notMouseIsPressed = true;
void setup() {
  
  //Find a Where's Waldo picture and drop it into this sketch.     
  PImage waldo = loadImage("7680596942c09c41d4f4be7436f49f2b.jpg"); // Change this to match your file name.
  size(940, 436); // Change this to match the size of your waldo picture
  image(waldo, 0, 0);

  
    doh = minim.loadSample("homer-doh.wav"); 
    woohoo = minim.loadSample("homer-woohoo.wav"); 
  
}

void draw() {
      
  // Use this print statement to find out the coordinates of Waldo when you press the mouse
      // println("X: " + mouseX + " Y: " + mouseY); 
      if(mousePressed && notMouseIsPressed) {
        println("X: " + mouseX + " Y: " + mouseY);
        notMouseIsPressed = false;
        if (479<=mouseX && mouseX<=529 && 303<=mouseY && mouseY<=351) {
          println("Waldo Found!");
          playWoohoo();
        }
        else {
          playDoh();
        }
      }
      else if(!mousePressed) {
         notMouseIsPressed = true;
      }
      // If the mouse is on Waldo, print “Waldo found!”

/**********  Now to add the sounds. You will need to uncomment all the code and import the Minim library ********/

      // If Waldo is found, also use a method below to play “Woohoo”
      // Change the name of the sound file if you need to 
      
      // If the mouse is pressed and they’re not on Waldo, play “Doh”
      // Change the name of the sound file if you need to 
      
}
/*********************  Use the methods below, DON'T CHANGE THE CODE *********************/


void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}
