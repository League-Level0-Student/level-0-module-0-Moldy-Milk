
void setup() {
  
// 1. Set the size of the sketch. Make it 600 pixels square. 
  size(600,600);

}

void draw() {
  ellipse(300,300,150,150);
  
// 2. Draw an ellipse
// Run the program to make sure it works before moving on.


// 3. Change the color of the ellipse when the mouse is pressed.
//    Use the following code, but put your colors where indicated
//    Remember to use the   fill()  command to set colors.

if (mousePressed) {
 fill(#C64040);
   //  put one color here 
  
} else if(mouseButton==CENTER){
background(#1CFA00);
}
else {
  fill(#4074C6);
   // put a different color here
  
}  
  
  
  
}
