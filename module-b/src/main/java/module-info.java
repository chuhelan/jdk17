import test.modulea.Test;
import test.moduleb.TestImpl;

module module.b {
    requires module.a;

    provides Test with TestImpl;
}