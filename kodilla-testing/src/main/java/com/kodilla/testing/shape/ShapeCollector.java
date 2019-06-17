package com.kodilla.testing.shape;


import java.util.ArrayList;


class ShapeCollector {
        private ArrayList<Shape> figures = new ArrayList<Shape>();

        public int getShapesSize() {
            return figures.size();
        }
        public void addFigure (Shape figure)
        {
            figures.add(figure);

        }
        public boolean removeFigure (Shape figure){
            return figures.remove(figure);
        }
        public Shape getFigure ( int n) {

            Shape figure1 = new Circle(9.54);
            figures.add(figure1);
            return figures.get(0);
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
