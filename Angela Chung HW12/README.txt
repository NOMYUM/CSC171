Name: Angela Chung 
NetID: 30612068
Assignment Number: 12
Lab section day/time: MW 2:00-3:15PM

Question 1:
I created an application with a GUI containing a JButton which I saved in an instance
variable. I then implemented the java.awt.event.ActionListener interface and register itself
as an ActionListener for the button. ActionPerformedhandler simply prints the event for now.

Question 2:
I added JLabel to my GUI to keep track of the number of times the button has been
pressed in my application class and update the label to show the count on each
button press. 

Question 3:
I added another JButton with text label “Off” to my GUI and register the application
class as an ActionListener. I modified the code for the event handler so that when
the second button is clicked it changes the text of the button itself “Off” to “On” or viceversa

Question 4:
I added a JTextField to my GUI. TextField also uses the ActionListener interface to notify listener,
so after the user types in a letters they can hit enter the to letters the user typed in would be 
printed.
 
Question 5:
I added a JSlider to my GUI. JSlider uses the ChangeListener interface for its
listeners.I implemented ChangeListener and use the value of the slider to set the label text.

Question 6:
I added two JCheckBox controls to my GUI. JCheckBox uses the ItemListener
interface for its listeners. I implemented ItemListener and have
the itemStateChanged method print which checkbox was changed and what its current value is.
