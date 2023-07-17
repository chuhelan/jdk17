import test.modulea.Test;

open module module.a {
    exports test.modulea to module.b;

    requires transitive java.logging;

    uses Test;
}