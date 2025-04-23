package com.xworkz.practiceJava.external;

import com.sun.org.apache.bcel.internal.generic.LAND;
import com.xworkz.practiceJava.internal.*;
import javafx.scene.control.Skin;

public class BenchRunner {

    public static void main(String[] args) {
        Bench bench = new ImplementBench();

        BenchUser benchUser = new BenchUser(bench);
        benchUser.excute();

        Shoe shoe = new ShoeImpl();
        Adidas adidas = new Adidas(shoe);
        adidas.execute();

        Bike bike = new bikeImpl();
        Duke duke = new Duke(bike);
        duke.execute();

        Wood wood = new woodImpl();
        Carrom carrom = new Carrom(wood);
        carrom.execute();

        Computer computer = new ComputerImp ();
        Hp hp = new Hp(computer);
        hp.execute();

        Software software = new SoftwareImpl();
        NotePad notepad = new NotePad(software);
        notepad.execute();

        Model model = new ModelImpl();
        AntiVirus antiVirus = new AntiVirus(model);
        antiVirus.execute();

        Mobile mobile = new MobileImpl();
        Pepole pepole = new Pepole(mobile);
        pepole.execute();

        Leather leather = new LeatherIImpl();
        Watch watch = new Watch(leather);
        watch.execute();

        Glass glass = new GlassImpl();
        Screen screen = new Screen(glass);
        screen.execute();

        Engine engine = new EngineImpl();
        Scooter scooter = new Scooter(engine);
        scooter.execute();

       Structure structure = new StructureImpl();
       File file = new File(structure);
       file.execute();

       Connection connection = new ConnectionImpl();
       Wifi wifi= new Wifi(connection);
       wifi.execute();

       Football football = new FootballImpl();
       Argentenia argentenia = new Argentenia(football);
       argentenia.execute();

       Git git = new GitImpl();
       GitHub gitHub = new GitHub(git);
       gitHub.execute();

       Rule rule = new RuleImpl();
       Sports sports = new Sports(rule);
       sports.execute();

       Copper copper = new CopperImpl();
       Wire wire = new Wire(copper);
       wire.execute();

       Plastick plastick = new PlastickImpl();
       Desk desk = new Desk(plastick);

       Connector connector = new ConnectorImpl();
       Socket socket = new Socket(connector);
       socket.execute();

       Boys boys = new BoyImpl();
       Girl girl = new Girl(boys);
       girl.execute();

       Electricity electricity = new ElectricityImpl();
       Projector projector = new Projector(electricity);
       projector.execute();

       Let let = new LetImp();
       JavaScript javaScript = new JavaScript(let);
       javaScript.execute();

       Sugar sugar = new SugarImpl();
       Mango mango = new Mango(sugar);
       mango.execute();

       Bag bag = new BagImpl();
       Schbooby schbooby =new Schbooby(bag);
       schbooby.execute();

       Water water = new WaterImpl();
       Bottel bottel = new Bottel(water);
       bottel.execute();

       Pillow pillow = new PillowImpl();
       Bed bed = new Bed(pillow);
       bed.execute();

       Press press = new PressImp();
       Enter enter = new Enter(press);
       enter.execute();

       Function function = new FunctionImpl();
       Action action = new Action(function);
       action.execute();

       Cream cream = new CreamImpl();
       Cake cake = new Cake(cream);
       cake.execute();

       KojicAcid kojicAcid = new KojicAcidImpl();
        SkinCare skinCare = new SkinCare(kojicAcid);
        skinCare.execute();

        Milk milk = new MilkImpl();
        IceCream iceCream = new IceCream(milk);
        iceCream.execute();

        Land land  = new LandImpl();
        Rice rice = new Rice(land);
        rice.execute();

        Tyre tyre = new TyreImpl();
        Vechicle vechicle = new Vechicle(tyre);
        tyre.brand();

        Web web = new WebImpl();
        Amazon amazon = new Amazon(web);
        amazon.execute();

        Graphite graphite = new GraphiteImpl();
        Pencil pencil = new Pencil(graphite);
        pencil.execute();

        Money money = new MoneyRunner();
        RickShaw rickShaw = new RickShaw(money);
        rickShaw.execute();

        PaymentGateway paymentGateway = new paymentGatewayImpl();
        Gpay gpay = new Gpay(paymentGateway);
        gpay.execute();

        Architecture architecture = new ArchitectureImpl();
        Building building = new Building(architecture);
        building.execute();

        Tail tail = new TailRunner();
        Leviten leviten = new Leviten(tail);
        leviten.execute();

        Password password = new PasswordImpl();
        Phone phone = new Phone(password);
        phone.execute();

        Transistor transistor = new TransistorImpl();
        Adapter adapter = new Adapter(transistor);
        adapter.execute();

        Gas gas = new GasImpl();
        Cylinder cylinder = new Cylinder(gas);
        gas.fill();

        Link link = new LinkImpl();
        Pen pen = new Pen(link);
        pen.execute();

        Bamboo bamboo = new BambooImpl();
        Paper paper = new Paper(bamboo);
        paper.execute();

        Car car = new CarImpl();
        Man man = new Man(car);
        man.execute();


    }

}
