public class Oven
{
    private int maxTemp;
    private int currentTemp;

    public int getMaxTemp()
    {
        if (maxTemp > 500 || maxTemp < 0)
        {
            maxTemp = 500;
        }
        return maxTemp;
    }
    public int getCurrentTemp()
    {
        if (currentTemp > maxTemp)
        {
            currentTemp = maxTemp;
        }
        else if (currentTemp < 0)
        {
            currentTemp = 0;
        }
        else
        {
            currentTemp = currentTemp;
        }
        return currentTemp;
    }

    public Oven(int max, int current)
    {
        maxTemp = max;
        currentTemp = current;
    }

    public void turnOff()
    {
        if (currentTemp > 0)
        {
            currentTemp = 0;
        }
    }
    public boolean isOn()
    {
        if (currentTemp > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void preheat(int temp)
    {
        if (temp > maxTemp)
        {
            currentTemp = maxTemp;
        }
        else if (temp <= 0)
        {
            currentTemp = currentTemp;
        }
        else
        {
            currentTemp = temp;
        }
        
    }

    public String toString()
    {
        return "New oven with a max temperature of " + maxTemp + " and a starting temperature of " + currentTemp;
    }
}
