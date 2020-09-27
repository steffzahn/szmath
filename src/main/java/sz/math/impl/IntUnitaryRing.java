package sz.math.impl;
import org.jetbrains.annotations.NotNull;
import sz.math.abstr.Element;
import sz.math.abstr.UnitaryRing;
import sz.math.intf.IUnitaryRing;

public class IntUnitaryRing extends UnitaryRing implements IUnitaryRing
{
    public IntUnitaryRing()
    {}

    public IntElement one_()
    {
        return new IntElement( this, 1L );
    }

    protected Element multiply_(@NotNull Element a, @NotNull Element b )
    {
        IntElement af = (IntElement)a;
        IntElement bf = (IntElement)b;
        return new IntElement( this, af._value * bf._value );
    }
    
    protected Element parse_(@NotNull String s)
    {
        return new IntElement( this, Long.parseLong(s) );
    }
    
    protected Element negative_(@NotNull Element a)
    {
        IntElement af = (IntElement)a;
        return new IntElement( this, - af._value );
    }
    
    public @NotNull Element zero_()
    {
        return new IntElement( this, 0L );
    }

    public boolean isZero_(@NotNull Element e)
    {
        IntElement ef = (IntElement)e;
        return ef._value== 0L;
    }

    public boolean isOne_(Element e)
    {
        IntElement ef = (IntElement)e;
        return ef._value== 1L;
    }

    protected Element add_(@NotNull Element a, @NotNull Element b )
    {
        IntElement af = (IntElement)a;
        IntElement bf = (IntElement)b;
        return new IntElement( this, af._value + bf._value );
    }
}