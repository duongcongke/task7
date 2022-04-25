public class testLine import java.util.Arrays;

public class TestLine {
    public static void main(String[] args) {
        Line line=new Line(3,6,3,8);
        System.out.println(line);
        Line line1=new Line(6,3,6,8);
        System.out.println(line1);
        line.setBegin(new Point(5,5));
        line.setEnd(new Point(9,9));
        System.out.println(line);
        System.out.println("Begin is: "+line.getBegin());
        System.out.println("End is: "+line.getEnd());
        line.setBeginX(99);
        line.setBeginY(88);
        line.setEndX(66);
        line.setEndY(33);
        System.out.println(line);
        System.out.println("Begin X is: "+line.getBeginX());
        System.out.println("End X is: "+line.getEndX());
        System.out.println("Begin Y is: "+line.getBeginY());
        System.out.println("End Y is: "+line.getEndY());
        line.setBeginXY(63,68);
        line.setEndXY(36,38);
        System.out.println(line);
        System.out.println("New Begin is: "+ Arrays.toString(line.getBeginXY()));
        System.out.println("New End is: "+ Arrays.toString(line.getEndXY()));
        System.out.println("New length from begin to (0,0) is: "+ line.getLength());
        System.out.println("New length from begin to (x,y): "+line.getLength(6,8));
        System.out.println("New Length from begin to Point: "+line.getLength(new Point(5,6)));
    }
}{
}
