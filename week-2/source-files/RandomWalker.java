public class RandomWalker
{
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);

        int coordinateX = 0;
        int coordinateY = 0;

        System.out.println("(0, 0)"); // origin
        int steps = 0;

        while(Math.abs(coordinateX - 0) + Math.abs(coordinateY - 0) < r)
        {
            int direction = (int)(Math.random() * 4.0);

            if(direction == 0)
            {
                // step up
                coordinateY++;
            }
            else if(direction == 1)
            {
                // step right
                coordinateX++;
            }
            else if(direction == 2)
            {
                // step down
                coordinateY--;
            }
            else
            {
                // step left
                coordinateX--;
            }

            steps++;

            System.out.println("("+coordinateX+", "+coordinateY+")");
        }

        System.out.println("steps = "+steps);

    }
}