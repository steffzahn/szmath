package sz.math.intf;
import sz.math.abstr.Element;

public interface IField extends IUnitaryRing
{
    Element inverse(Element a);
}