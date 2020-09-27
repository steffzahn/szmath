package sz.math.abstr;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public abstract class Element
{
    private final @NotNull Object _parent;
    
    public @NotNull Object getTheClass()
    {
        return _parent;
    }
    
    protected Element(Object p)
    {
        _parent = Objects.requireNonNull(p);
    }
}