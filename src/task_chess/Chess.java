package task_chess;

public class Chess
{
    private int height;
    private int width;

    public Chess() {

    }

    public Chess(int h, int w) {
        height = h;
        width = w;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void draw() {
        for(int i=0;i < height;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j < width;j++)
                {
                    if(j%2==0)
                    {
                        System.out.print("+");
                    }
                    else
                    {
                        System.out.print("-");
                    }

                }
            }
            else
            {
                for(int j=0;j < width;j++)
                {
                    if(j%2==0)
                    {
                        System.out.print("-");
                    }
                    else
                    {
                        System.out.print("+");
                    }

                }
            }

            System.out.print("\n");

        }
    }


}
