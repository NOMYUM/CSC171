Name: Angela Chung 
NetID: 30612068
Assignment Number: 11
Lab section day/time: MW 2:00-3:15PM

QUESTION 1 - 3
Canvas and Test class is part of questions 1 through 3. 
	question1: You use mouseListener to run this program. When you press your mouse anywhere, it tells you the coordinates 
			   where the mouse is entered, pressed, released, and exited 
	question2: You use mouseClicked event, at the location of the event: use MouseEvent.getX() and MouseEvent.getY()
			   (the code is extended from question 1) 
			   When you press the mouse, a black circle is drawn
	question3: You use java.awt.event.MouseMotionListener interface and add itself as its own MouseMotionListener
			   (the code is extended from question 2) 
			   When you press and hold down the mouse, small filled circles as the mouse is dragged
			   
QUESTION 4
(the code is extended from question 3) 
When the mouse is first pressed, it draws a small circle as above. As the mouse is dragged, it draws a line connecting the 
original point to the current position of the mouse. It creates a new one every time the mouse is released

QUESTION 5
You implement java.awt.event.KeyListener interface, add itself as its own KeyListener, and call setFocusable(true) 
When a key is typed, the program draws the corresponding character (see KeyEvent.getKeyChar()) on the canvas at the location 
of the event. If another key is typed without the mouse being clicked, then draw the next character to the right of the 
previous one as if you were typing in a text field.
(the program kind of runs slow on the computer and may take a while for the letters to show up... at least on my computer)

QUESTION 6
Same thing as question5 except you can change the text color by using KeyEvent.getKeyLocation() and KeyEvent.KEY LOCATION NUMPAD,
as well as the VK NUMPAD constants.
(the program kind of runs slow on the computer and may take a while for the letters to show up... at least on my computer)
