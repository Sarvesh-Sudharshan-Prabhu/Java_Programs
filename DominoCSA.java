public class Domino
{
    private int top, bottom;
    private boolean revealed;

    /**
     * Constructs an unrevealed Domino from x and y.
     *      The minimum of x and y is top number.
     *      The maximum of x and y is the bottom number.
     * @param x
     * @param y
     */
    public Domino(int x, int y)
    {
        this.bottom = Math.max(x,y);
        this.top = Math.min (x,y);
    }

    /**
     * @return top
     */
    public int getTop()
    {
        return top;
    }

    /**
     * @return bottom
     */
    public int getBottom()
    {
        return bottom;
    }

    /**
     * @return revealed
     */
    public boolean isRevealed()
    {
        return revealed;
    }

    /**
     * Sets revealed to the specified value
     * @param revealed
     */
    public void setRevealed(boolean revealed)
    {
        this.revealed = revealed;
    }

    /**
     * Returns true if this Domino has the same top and bottom as other
     * @param other
     * @return
     */
    public boolean equals(Domino other)
    {
        if (this.top == other.top && this.bottom == other.bottom)
        {
            return true;
        }
        return false;
    }
}