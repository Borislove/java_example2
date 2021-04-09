//
//    Класс Point2D - точка с 2-мя координатами, содержит
//
//    приватные переменные int x; int y;
//    конструктор с параметрами int x, int y, устанавливающий соответствующие переменные
//    переопределение функции toString(), которая должна возвращать результат в формате х,у, например 23,12
public class Point2D {
 int x;
 int y;


public Point2D(int x, int y)
{
    this.x = x;
    this.y = y;
}


public String toString() {
    return x + "," + y;
    }

}
