package com.xworkz.interfacePractice.Runner;

import com.xworkz.interfacePractice.external.*;
import com.xworkz.interfacePractice.internal.*;
import com.xworkz.interfacePractice.internal.Air;

public class MainRunner {
    public static void main(String[] args) {
        AcMachanic acMachanic = new AcMachanicRunner();
        acMachanic.goToWork();
        acMachanic.repair();
        acMachanic.salary();

        Air air = new com.xworkz.interfacePractice.external.Air();
        air.airQuality();
        air.airSpeed();
        air.coldOrHotAir();

        Aluminium aluminium = new AluminiuRunner();
        aluminium.price();
        aluminium.quallty();
        aluminium.strength();

        AntiVirus antiVirus = new AntiVirusRunner();
        antiVirus.killVirus();
        antiVirus.name();
        antiVirus.virusDetected();


        Aries aries = new AriesRunner();
        aries.benifits();
        aries.dateOfBirth();
        aries.signNature();

        Asus asus = new AsusRunner();
        asus.ram();
        asus.processor();
        asus.price();

        Bag bag = new BagRunner();
        bag.capacity();
        bag.size();
        bag.quality();

        Bed bed = new BedRunner();
        bed.meterial();
        bed.size();
        bed.price();

        Belt belt = new BeltRunner();
        belt.meterial();
        belt.size();
        belt.price();

        Bench bench = new BenchRunner();
        bench.lifeSpan();
        bench.price();
        bench.meterial();

        Bike bike = new BikeRunner();
        bike.cc();
        bike.engine();
        bike.price();

        Book book =new BookRunner();
        book.author();
        book.publisher();
        book.name();

        Bottel bottel = new BottelRunner();
        bottel.liter();
        bottel.price();
        bottel.name();

        Building building = new BuildingRunner();
        building.capacity();
        building.locatedIn();
        building.name();

        Calculator calculator = new CalculatorRunner();
        calculator.name();
        calculator.type();
        calculator.price();

        Cancer cancer = new CancerRunner();
        cancer.benifits();
        cancer.personality();
        cancer.benifits();

        Cappricon cappricon = new CappriconRunner();
        cappricon.benifits();
        cappricon.personality();
        cappricon.sign();

        Car car = new CarRunner();
        car.engine();
        car.capacity();
        car.price();

        Carper carper = new CarpetRunner();
        carper.name();
        carper.style();
        carper.price();

        Cave cave = new CaveRunner();
        cave.enterCave();
        cave.exitCave();
        cave.locatedIn();

        Charger charger = new ChargerRunner();
        charger.capacity();
        charger.plugIn();
        charger.plugOut();

        Copper copper = new CopperRunner();
        copper.price();
        copper.quantity();
        copper.usage();

        Dance dance = new DanceRunner();
        dance.setDance();
        dance.practice();
        dance.perform();

        DataAnalytics dataAnalytics = new DataAnalyticsRunner();
        dataAnalytics.jobDescription();
        dataAnalytics.Responsibility();
        dataAnalytics.salary();

        Dell dell = new DellRunner();
        dell.name();
        dell.price();
        dell.processor();

        Doctor doctor = new DoctorRunner();
        doctor.charge();
        doctor.checkPatient();
        doctor.ram();

        Kishan kishan = new KishanRunner();
        kishan.doTask();
        kishan.study();
        kishan.walkHome();

        LanCabel lanCabel = new LanCabelRunner();
        lanCabel.cabelLength();
        lanCabel.putLan();
        lanCabel.price();

        Lenovo lenovo = new LenovaRunner();
        lenovo.putCharge();
        lenovo.price();
        lenovo.processor();

        Leo leo = new LeoRunner();
        leo.luckyColor();
        leo.luckyNumber();
        leo.todaysHoroScope();

        Libra libra = new LibraRunner();
        libra.luckyColor();
        libra.luckyNumber();
        libra.todaysHoroScope();

        Linkdein linkdein = new LinkdeinRunner();
        linkdein.name();
        linkdein.team();
        linkdein.networth();

        Mac mac = new MacRunner();
        mac.price();
        mac.processor();
        mac.putCharge();

        Malware malware = new MalwareRunner();
        malware.moreDetails();
        malware.type();
        malware.name();

        Pepole pepoleRunner = new PepoleRunner();
        pepoleRunner.character();
        pepoleRunner.personality();
        pepoleRunner.name();

        Poco poco = new PocoRunner();
        poco.price();
        poco.ram();
        poco.processor();

        Raksha raksha = new RakshaRunner();
        raksha.character();
        raksha.personality();
        raksha.name();

        Redmi redmi = new RedmiRunner();
        redmi.price();
        redmi.ram();
        redmi.processor();


        Rishi rishiRunner = new RishiRunner();
        rishiRunner.character();
        rishiRunner.name();
        rishiRunner.personality();

        RoshanRunner roshanRunner = new RoshanRunner();
        roshanRunner.character();
        roshanRunner.personality();
        roshanRunner.name();

        SamSung samSung = new SamsungRunner();
        samSung.price();
        samSung.ram();
        samSung.processor();

        Schooty schooty = new SchootyRunner();
        schooty.milege();
        schooty.name();
        schooty.price();

        Sheet sheet = new SheetRunner();
        sheet.name();
        sheet.price();
        sheet.quality();


        ShopKeeper shopKeeper = new ShopKeeperRunner();


        Poco poco = new PocoRunner();


        Poco poco = new PocoRunner();


        Poco poco = new PocoRunner();



        Poco poco = new PocoRunner();



        Poco poco = new PocoRunner();


        Poco poco = new PocoRunner();



        Cappricon cappricon = new CappriconRunner();









    }
}