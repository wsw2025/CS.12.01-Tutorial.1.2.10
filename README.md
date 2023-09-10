# CS.12.01-Tutorial.1.2.10

The LightBoard class models a two-dimensional display of lights, where each light is either on or off, as represented by a Boolean value. You will implement a constructor to initialize the display and a method to evaluate a light. 

public class LightBoard
{

	private boolean[][] lights;

	public LightBoard(int numRows, int numCols)
	{

		// To be implemented.

	}

	public boolean evaluateLight(int row, int col) 
	{



	}

}

a) Write the constructor for the LightBoard class, which initialises lights so that each light is set to on with a 40% probability. The notation lights[r][c] represents the array element at row r and column c.

b) Write the method evaluateLight, which computes and returns the status of a light at a given row and column based on the following rules.

If the light is on, return false if the number of lights in its column that are on is even, including the current light.
If the light is off, return true if the number of lights in its column that are on is divisible by three. 
Otherwise, return the light’s current status.

For example, suppose that LightBoard sim = new LightBoard(7, 5) creates a light board with the initial state shown below, where true represents a light that is on and false represents a light that is off. Lights that are off are shaded.

<img width="730" alt="image" src="https://github.com/techarenz/CS.12.01-Tutorial.1.2.10/assets/57818506/863c4d27-7798-4d05-b2a5-3675491bcaff">


Sample calls to evaluateLight are shown below

<img width="731" alt="image" src="https://github.com/techarenz/CS.12.01-Tutorial.1.2.10/assets/57818506/89be3539-140c-43d4-a7f0-fe954abda253">

