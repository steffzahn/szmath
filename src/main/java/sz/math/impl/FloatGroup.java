package sz.math.impl;
import org.jetbrains.annotations.NotNull;
import sz.math.abstr.Element;
import sz.math.abstr.Group;
import sz.math.intf.IGroup;

public class FloatGroup extends Group implements IGroup
{
    public FloatGroup()
    {}

    protected Element parse_(@NotNull String s)
    {
        return new FloatElement( this, Double.parseDouble(s) );
    }
    
    protected Element negative_(@NotNull Element a)
    {
        FloatElement af = (FloatElement)a;
        return new FloatElement( this, - af._value );
    }
    
    public @NotNull Element zero_()
    {
        return new FloatElement( this, 0.0 );
    }

    public boolean isZero_(@NotNull Element e)
    {
        FloatElement ef = (FloatElement)e;
        return ef._value== 0.0;
    }

    protected Element add_(@NotNull Element a, @NotNull Element b )
    {
        FloatElement af = (FloatElement)a;
        FloatElement bf = (FloatElement)b;
        return new FloatElement( this, af._value + bf._value );
    }
}