package tryThis;

public class Sound {
	
	public static void main(String[] args) {
		
//		In this project, you will create a program that computes how far away, in feet, a listener
//		is from a lightning strike. Sound travels approximately 1,100 feet per second through
//		air. Thus, knowing the interval between the time you see a lightning bolt and the time
//		the sound reaches you enables you to compute the distance to the lightning. For this
//		project, assume that the time interval is 7.2 seconds.
//		
//		1. Create a new file called Sound.java.
		
//		2. To compute the distance, you will need to use floating­point values. Why? Because
//		the time interval, 7.2, has a fractional component. Although it would be permissible to
//		use a value of type float, we will use double in the example.
		
//		3. To compute the distance, you will multiply 7.2 by 1,100. You will then assign this
//		value to a variable.
		
//		4. Finally, you will display the result.
		
		
		double soundSpeed = 1100;
		double interval = 7.2;
		
		double distance = soundSpeed * interval;
		
		System.out.println("Distance from listener and a lightning strike is " + distance + " feet.");
		
		
//		 Extra challenge: You can compute the distance to a large object, such as a rock wall,
//		 by timing the echo. For example, if you clap your hands and time how long it takes for
//		 you to hear the echo, then you know the total round­trip time. Dividing this value by
//		 two yields the time it takes the sound to go one way. You can then use this value to
//		 compute the distance to the object. Modify the preceding program so that it computes
//		 the distance, assuming that the time interval is that of an echo.
		
		double distanceFromWall = (soundSpeed * interval) / 2;
		
		System.out.println("Distance from listener and a wall is " + distanceFromWall + " feet.");
		
	}

}
