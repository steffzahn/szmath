package sz.math.intf;
import sz.math.abstr.Element;

public interface IUnitaryRing extends IRing
{
    Element one();

    @SuppressWarnings({"unused", "RedundantSuppression"})
    boolean isOne(Element e);
}