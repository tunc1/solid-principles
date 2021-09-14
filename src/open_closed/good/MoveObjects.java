package open_closed.good;

import java.util.List;

public class MoveObjects
{
    private List<Movable> objects;
    public MoveObjects(List<Movable> objects)
    {
        this.objects=objects;
    }
    public void moveAll()
    {
        for(Movable object:objects)
            object.move();
    }
}