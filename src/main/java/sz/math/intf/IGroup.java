package sz.math.intf;
import sz.math.abstr.Element;

public interface IGroup
{
    Element zero();
    
    Element parse(String s);

    Element add(Element a, Element b);

    boolean isZero(Element e);
    
    Element negative(Element a);
}