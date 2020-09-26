package sz.math.abstr;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public abstract class Element
{
    private @NotNull Object _parent;
    
    public Object getTheClass()
    {
        return _parent;
    }
    
    protected Element(Object p)
    {
        _parent = Objects.requireNonNull(p);
    }
}