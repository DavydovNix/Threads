package threads1;

public class Ex1 {
    //Потоки-это фрагмент кода,который выполняется параллельно другой части программы(танки,одновременно
    // солдаты бегут-это 2 потока.Солдата убили-поток закончился.Чаще исп.в игровых программах.)
    //в джаве есть 2 пути создания потока:1)наследование класса Срэд,но если у класса уже есть предок,то
    // наследуемся от Интерфейса Ранэйбл
    //раньше все у меня было в одном потоке
     public static Ex2_other_thread createOtherThread(){
         return  new Ex2_other_thread(); //метод выделения памяти
     }
    public static void main(String[] args) throws InterruptedException {
        //главнфй поток-метод мэйн запускается автоматом.Создадим переменную нашего потока,
        // чтобы ссылаться на методы создагнного класса,но без
        //Ex2_other_thread ex2_other_thread=new Ex2_other_thread(); //ручное выделение памяти
        Ex2_other_thread ex2_other_thread=createOtherThread();
        //Ex2_other_thread ex2_other_thread; так нельзя,т.к. это не базовый объект,под него нужно выделить память
        //если есть метод делающий это за нас,например в компайле уже есть ретурн,который выделяет память в базовом классе.
        System.out.println("начало главного потока");
        //стартуем поток
        ex2_other_thread.start();
        Thread.sleep(2000);
        System.out.println("конец главного потока");
    }

}
