package open_closed.bad;

import java.util.List;

public class MoveObjects
{
    private List<Object> objects;
    public MoveObjects(List<Object> objects)
    {
        this.objects=objects;
    }
    public void moveAll()
    {
        for(Object object: objects)
        {
            if(object instanceof Person)
                ((Person)object).walk();
            else if(object instanceof Car)
                ((Car)object).go();
        }
    }
}