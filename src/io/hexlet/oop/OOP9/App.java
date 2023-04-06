package io.hexlet.oop.OOP9;

import io.hexlet.oop.OOP9.geomethy.Quadrate;

class App {
    public static Quadrate enlargeQuadrate(Quadrate figure) {
        var side = figure.getSide();
        var enlargedSide = side * 2;
        return new Quadrate(enlargedSide);
    }
}
// END