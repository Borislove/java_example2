package ru.progwards.java1.lessons.classes;

  class  ComplexNum {
    int a;
    int b;

    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String toString(){
        return  a + "+" + b + "i";
    }

// сложение комплексных чисел по формуле:
// (a + bi) + (c + di) = (a + c) + (b + d)i
    public ComplexNum add(ComplexNum num)
    { return  new ComplexNum(a + num.a, b + num.b);
    }

// вычитание комплексных чисел по формуле:
// (a + bi) - (c + di) = (a - c) + (b - d)i
    public ComplexNum sub(ComplexNum num){
        return new ComplexNum(a - num.a, b - num.b );}

// умножение комплексных чисел по формуле:
// (a + bi) * (c + di) = (a*c - b*d) + (b*c + a*d)i
//return new ComplexNum((a * num.a) - (b * num.b), (b * num.a) + (a * num.b));
    public ComplexNum mul(ComplexNum num) {
      int vb = (a * num.a) - (b * num.b);
      int cvb = (b * num.a) + (a * num.b);
        ComplexNum sdd =  new ComplexNum(vb, cvb);
      return sdd;
    }


//      Тест "Метод mul(ComplexNum num1, ComplexNum num2)"
//      не пройден. Метод mul(ComplexNum num) возвращает экземпляр
//      класса с неверным значением toString(). Переданы параметры:
//      num1 = new ComplexNum(1, 1), num2 = new ComplexNum(99, 99).
//      Возвращено: 0 + 0i. Ожидалось: 0+198i



//деление комплексных чисел по формуле:
//real imag /num.real num.imag
// (a + bi) / (c + di) = (a*c + b*d)/(c*c+d*d) + ((b*c - a*d)/(c*c+d*d))i
    public ComplexNum div(ComplexNum num){

        int vb = ((a * num.a) + (b * num.b)) / ((num.a * num.a) + (num.b * num.b));
        int cvb = ((b * num.a) - (a * num.b)) / ((num.a * num.a) + (num.b * num.b));
        ComplexNum sdd =  new ComplexNum(vb, cvb);
        return sdd;
    }

//    public static void main(String[] args) {
//
//
//        ComplexNum n1 = new ComplexNum(15, 4);
//        ComplexNum n2 = new ComplexNum(45, 54);
//        ComplexNum fg =   mul(n1,n2);
//
//    }
}

