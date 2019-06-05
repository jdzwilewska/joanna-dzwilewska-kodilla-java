package com.kodilla.testing.shape;


import java.util.ArrayList;


class ShapeCollector {
        private ArrayList<Shape> figures = new ArrayList<Shape>();
        public void addFigure (Shape figure)
        {
            figures.add(figure);

        }
        public boolean removeFigure (Shape figure){
            return figures.remove(figure);
        }
        public Shape getFigure ( int n)
        {
            return figures.get(n);
        }
        public boolean showFigures () {
            boolean result = false;
            if (!figures.isEmpty()) {
                for (Shape fig : figures) {
                    System.out.println(fig);
                    result = true;
                }
            }
            return result;
        }

}
