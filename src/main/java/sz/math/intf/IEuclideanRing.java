package sz.math.intf;
import sz.math.abstr.Element;

public interface IEuclideanRing extends IUnitaryRing
{
    long norm(Element e);
    
    interface Result
    {
        Element quotient();

        Element remainder();
    }
    
    Result divideWithRemainder(Element a, Element b);
}