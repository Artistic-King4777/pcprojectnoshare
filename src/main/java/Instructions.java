public class Instructions {
    /*

    Here is the User Story : We need to write code that mimics building a PC.
HINTS:
A PC comprises of at least these things:  Motherboard, Monitor and Case.
A case HAS A  dimension
A monitor HAS A resolution


UML is Required!!!
ALL Instance Variables should be PRIVATE!!!

• Create a PC class that has three Instance Variables of these Types
   Motherboard
   Monitor
   Case

A Constructor,  a toString Method and just getters
it should also have two methods
drawLogo()  - which is a private method and it should call the showLogo()
powerUp() - must call the pressPowerButton() method and the drawLogo() method

==========================================================

• Motherboard should have the following instance variables
     model;
     manufacturer;
     ramSlots;
     cardSlots;
     bios;

A Constructor,  a toString Method and just getters

It should also have a method named loadProgram method that takes a String parameter called programName and the method should return void but print out "____(programName goes here)___" is now running
==========================================================

• Monitor should compose of the following
    model;
    manufacturer;
    size;
    resolution;

A Constructor,  a toString Method and just getters

It should also have a method named showLogo method that takes three parameters called the first two are ints and the third should be a string.
 The method should return void but print out something like -  "showing logo at __ by ___ in color ___"
==========================================================
•  Case should compose of the following
     model;
     manufacturer;
     powerSupply;
     dimensions;

A Constructor,  a toString Method and just getters
It should also have a pressPowerButton() that prints out "Power button pressed"

==========================================================
• Dimensions should have the following
    width;
    height;
    depth;
A Constructor and just getters
============================================
• Main
Create a PC object and print it out
CALL THE METHODS BELOW!!!
loadProgram()
pressPowerButton()
showLogo()
==========================================
EXPECTED OUTPUT !!!


PC{motherboard=Motherboard{model='BJ-2000', manufacturer='Asus', ramSlots=4, cardSlots=6, bios='v2.44'}, monitor=Monitor{model='Macintosh', manufacturer='Apple', size=27, resolution=Resolution{width=2500, height=1500}}, theCase=Case{model='zzx10', manufacturer='Dell', powerSupply='110V', dimensions=Dimensions{width=20, height=20, depth=5}}}
========================================================================
OXS El Capitan is now running
Power button pressed
showing logo at 1200 by 500 in color red
========================================================================
Power button pressed
showing logo at 1200 by 50 in color silver

Process finished with exit code 0

========================================================================
OXS El Capitan is now running
Power button pressed
showing logo at 1200 by 500 in color red
========================================================================
Power button pressed
showing logo at 1200 by 50 in color silver





    NOTES============================
    If you do not send me a DM with the Uml.png file you did not do
    it..meaning you get an Infraction. This is due by start 1pm tomorrow!!!

    DO NOT PUSH THE CODE TO GITHUB

    DO THIS ON YOUR OWN - I'M ON THE LOOK OUT FOR THOSE SHARING CODE.
    BOTH PARTIES WILL GET AN INFRACTION







     */



}
