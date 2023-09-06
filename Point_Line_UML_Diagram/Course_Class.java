package javaapplication23;

 class Line {
    private Point start;
    private Point end;
    
    public Line(Point start, Point end){
        this.start=start;
        this.end=end;
    }
    
    public Line(int x1, int y1, int x2, int y2){
        Point s = new Point(x1,y1);
        Point e = new Point(x2,y2);
        this.start=s;
        this.end=e;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public void setEnd(Point end) {
        this.end = end;
    }
    
    public double getLength(){
        return Math.sqrt(Math.pow((this.start.getX()-this.end.getX()),2)+Math.pow((this.start.getY()-this.end.getY()),2));
    }
    
    
}


 class Point {
    private int x;
    private int y;
    
    public Point(){}
    
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public void setX(int x){
        this.x=x;
    }
    
    public void setY(int y){
        this.y=y;
    }
    
    @Override
    public String toString(){
        return "This is a line with coordinates (x, y) = ("+this.x+", "+this.y+").";
    }
}
