package Modul01;

/**
 * Created by &[User] and &[Date].
 */
public class Application {

    public static void main(String[] args) {


        Circle circle = new Circle();
        circle.draw();

        //SPOSÓB nr 1
        Shape shape=new Diamond();
        ShapeDrawer shapeDrawer=new ShapeDrawer(shape);

        //SPOSÓB nr 2
        shapeDrawer.process();

        ShapeDrawer shapeDrawer1 = new ShapeDrawer(new Rectangle());
        shapeDrawer1.process();


        circle.someDefaultMethod();
        shapeDrawer1.getShape().someDefaultMethod();
        System.out.println(Shape.getSomeRodoInformation());

        ATMimplementation atMimplementation=new ATMimplementation();

        atMimplementation.wplata();
        atMimplementation.wyplata();
        atMimplementation.polaczenieZBankiem();
        ATM2.informacjaOZakonczeniuPolaczenia();

        System.out.println("___________________________________________________");

        AnimalRecognizer animalRecognizer = new AnimalRecognizer(new Cat("GARFIELD"));
        animalRecognizer.recognizeTheAnimal();


        System.out.println("___________________________________________________");

        Knight knight = new Knight( new DeadIslandQuest());
        knight.wakeUpTheKnight();

        System.out.println("___________________________________________________");

        SalaryPayoutProcessor salaryPayoutProcessor = new SalaryPayoutProcessor(new FixedIncomeWorker(2454, "LK585"));
        salaryPayoutProcessor.payout();
        salaryPayoutProcessor.process();
    }




}
