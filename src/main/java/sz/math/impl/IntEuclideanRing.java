package sz.math.impl;
import org.jetbrains.annotations.NotNull;
import sz.math.abstr.Element;
import sz.math.abstr.EuclideanRing;
import sz.math.intf.IEuclideanRing;

public class IntEuclideanRing extends EuclideanRing implements IEuclideanRing
{
    public IntEuclideanRing()
    {}

    public long norm_(@NotNull Element a)
    {
        IntElement af = (IntElement)a;
        return (af._value < 0L) ? ( - af._value ) : af._value;
    }

    public IEuclideanRing.Result divideWithRemainder_(@NotNull Element a, @NotNull Element b )
    {
        IntElement af = (IntElement)a;
        IntElement bf = (IntElement)b;
        long rr = af._value % bf._value;
        if( (rr<0) && (bf._value>0) || (rr>0) && (bf._value<0) )
        {
            rr += bf._value;
        } 
        final long r = rr;
        final long q = (af._value - r) / bf._value;
        return new IEuclideanRing.Result() {
            public Element quotient()
            {
                return new IntElement( IntEuclideanRing.this, q );
            }

            public Element remainder()
            {
                return new IntElement( IntEuclideanRing.this, r );
            }
        };
    }

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