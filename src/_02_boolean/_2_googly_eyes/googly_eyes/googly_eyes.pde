PImage face;

int pupilX = 0;
int pupilY = 300;
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
  if(mouseX<320){
    pupilX = 330 + if(){abs(mouseY-300);}else{};
  }
  ellipse(pupilX,pupilY,63,45);
}
