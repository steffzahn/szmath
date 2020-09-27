package sz.math.abstr;

import sz.math.intf.IUnitaryRing;

public abstract class UnitaryRing extends Ring implements IUnitaryRing
{
    protected abstract Element one_();
    public Element one()
    {
        Element result = one_();
        if( result==null )
        {
            throw new NullPointerException("one operation delivered null result");
        }
        if( result.getTheClass()!=this )
        {
            throw new RuntimeException("one operation delivers element outside of unitary ring");
        }
        return result;
    }

    protected abstract boolean isOne_(Element e);
    public boolean isOne(Element e)
    {
        if( e==null )
        {
            throw new RuntimeException("isOne operation missing mandatory parameters");
        }
        if( this!=e.getTheClass()  )
        {
            throw new RuntimeException("isOne operation does not accept parameters from a different unitary ring");
        }
        return isOne_(e);
    }

    // convenience methods
    public Element product( Iterable<Element> iterable )
    {
        if( iterable==null )
        {
            throw new RuntimeException("product operation missing mandatory parameters");
        }
        Element result = one();
        for (Element element : iterable) {
            result = this.multiply(result, element);
        }
        return result;
    }
}