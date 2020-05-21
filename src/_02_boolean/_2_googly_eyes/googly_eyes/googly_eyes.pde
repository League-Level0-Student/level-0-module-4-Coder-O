PImage face;

float pupilX = 400;
float pupilY = 300;

void setup() {
  face = loadImage("eye-of-truth_399984.jpg");
  size(800,600);
  face.resize(width,height);
  background(face);
}

void draw() {
  
  background(face);
  if(mousePressed){
    print(mouseX+","+mouseY+" ");
  }
  fill(250,250,250);
  ellipse(400,300,210,150);
  fill(0,0,0);
// mouseX - 400 = as if orgin is in center.
// mouseY - 300 ='                         '
  /*if(mouseX<330){
    pupilX = 330 + abs(mouseY-300)/2;
  } else if(mouseX>465){
    pupilX = 465 - abs(mouseY-300)/5.92592592593;
  } else {
    pupilX = mouseX;
  }
  
  if(mouseY<254){
    pupilY = 254 + abs(mouseX-400)/3;
  } else if(mouseY>349){
    pupilY = 349 - abs(mouseX-400)/3;
  } else {
    pupilY = mouseY;
  }*/
  float mouseXFromCenter = mouseX - 400;
  float mouseYFromCenter = mouseY - 300;
  
  float pupilDistanceFromCenter = dist(400, 300, mouseX, mouseY)/10;
  
  float theta = atan(mouseXFromCenter/mouseYFromCenter);
  if (mouseYFromCenter<0) {
    theta += PI;
  }
  
  pupilX = 400 + pupilDistanceFromCenter * sin(theta);
  pupilY = 300 + pupilDistanceFromCenter * cos(theta);
  ellipse(pupilX,pupilY,63,45);
}
