package sz.math.intf;
import sz.math.abstr.Element;

public interface IRing extends IGroup
{
    Element multiply(Element a, Element b);
}