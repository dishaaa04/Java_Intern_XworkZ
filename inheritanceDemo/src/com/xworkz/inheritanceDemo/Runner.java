package com.xworkz.inheritanceDemo;

import com.xworkz.inheritanceDemo.*;

public class Runner {

    public static void main(String[] args) {


        Address address = new PinCode();

        address.displayAddress();
        address.updateAddress();
        address.validateAddress();
        address.getRegion();
        address.locationInfo();

        PinCode pinCode = new PinCode();

        pinCode.getAreaCode();
        pinCode.checkDeliveryAvailability();
        pinCode.displayPincode();
        pinCode.validatePincode();
        pinCode.updateAddress();

        Alien alien = new Martian();
        alien.communicate();
        alien.abductHumans();
        alien.controlSpaceship();
        alien.regenerate();
        alien.eatRocks();

        Martian martian = new Martian();
        martian.growTentacles();
        martian.camouflage();
        martian.terraformPlanet();
        martian.summonUFO();
        martian.danceToEarthMusic();

        Animal animal = new Bird();
        animal.eat();
        animal.sleep();
        animal.breathe();
        animal.move();
        animal.grow();

        System.out.println("*****");

        Bird bird = new Bird();
        bird.fly();
        bird.sing();
        bird.layEggs();
        bird.buildNest();
        bird.migrate();

        Appliance appliance = new VacuumCleanerMachine();
        appliance.turnOn();
        appliance.turnOff();
        appliance.consumePower();
        appliance.warranty();
        appliance.maintenance();

        VacuumCleanerMachine vacuum = new VacuumCleanerMachine();
        vacuum.startCleaning();
        vacuum.stopCleaning();
        vacuum.emptyDustBag();
        vacuum.adjustSuctionPower();
        vacuum.changeCleaningMode();

        Bank bank = new SavingsAccount();
        bank.openAccount();
        bank.depositMoney();
        bank.withdrawMoney();
        bank.provideLoan();
        bank.generateStatement();

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.earnInterest();
        savingsAccount.maintainMinimumBalance();
        savingsAccount.withdrawLimit();
        savingsAccount.onlineBanking();
        savingsAccount.issueDebitCard();


        Book book = new Novel();
        book.read();
        book.open();
        book.close();
        book.bookmark();
        book.turnPage();

        Novel novel = new Novel();
        novel.genre();
        novel.author();
        novel.storyline();
        novel.characters();
        novel.chapters();

        Cat cat = new Kitten();
        cat.meow();
        cat.sleep();
        cat.eat();
        cat.play();
        cat.scratchFurniture();

        Kitten kitten = new Kitten();
        kitten.hackWiFi();
        kitten.stealPasswords();
        kitten.writeCode();
        kitten.bypassFirewall();
        kitten.deleteInternet();

        Company company = new Experience();
        company.benefits();
        company.meeting();
        company.projects();
        company.salary();
        company.work();

        Experience experience = new Experience();
        experience.challenges();
        experience.learning();
        experience.promotions();
        experience.networking();
        experience.teamwork();

        Computer computer = new Device();
        computer.boot();
        computer.shutdown();
        computer.process();
        computer.connectToInternet();
        computer.storeData();

        Device device = new Device();
        device.batteryBackup();
        device.portability();
        device.webcam();
        device.touchpad();
        device.keyboardLight();

        Country country = new PrimeMinister();
        country.independenceYear();
        country.name();
        country.currency();
        country.population();
        country.nationalAnthem();

        PrimeMinister primeMinister = new PrimeMinister();
        primeMinister.leaderName();
        primeMinister.policies();
        primeMinister.termYears();
        primeMinister.work();
        primeMinister.responsibilities();

        Dessert dessert = new IceCream();
        dessert.enjoy();
        dessert.ingredients();
        dessert.serve();
        dessert.store();
        dessert.taste();

        IceCream iceCream = new IceCream();
        iceCream.coneOrCup();
        iceCream.flavor();
        iceCream.scoop();
        iceCream.temperature();
        iceCream.topping();


        Doctor doctor = new Patient();
        doctor.prescription();
        doctor.surgery();
        doctor.check();
        doctor.diagnose();
        doctor.medicine();

        Patient patient = new Patient();
        patient.disease();
        patient.rest();
        patient.takeMedicine();
        patient.treatment();
        patient.visitHospital();

        Electricity electricity = new ElectricTrain();
        electricity.generate();
        electricity.transmit();
        electricity.store();
        electricity.shock();
        electricity.powerDevices();

        ElectricTrain electricTrain = new ElectricTrain();
        electricTrain.startJourney();
        electricTrain.increaseSpeed();
        electricTrain.honk();
        electricTrain.stop();
        electricTrain.transportPeople();


        Family family = new Persons();
        family.bonding();
        family.support();
        family.surname();
        family.traditions();
        family.values();

        Persons persons = new Persons();
        persons.education();
        persons.hobbies();
        persons.profession();
        persons.responsibility();
        persons.socialLife();

        Festival festival = new Joy();

        festival.clothes();
        festival.food();
        festival.happy();
        festival.share();
        festival.sweets();

        Joy joy = new Joy();

        joy.children();
        joy.decorate();
        joy.enjoy();
        joy.games();
        joy.smile();

        Fruit fruit = new Fruit();
        fruit.color();
        fruit.grow();
        fruit.seasonal();
        fruit.taste();
        fruit.vitamins();

        Mango mango = new Mango();
        mango.pickle();
        mango.sour();
        mango.sweet();
        mango.types();
        mango.yellowColor();

        Game game = new VideoGame();
        game.start();
        game.stop();
        game.scorePoints();
        game.setDifficulty();
        game.reset();

        System.out.println("--------");

        VideoGame videoGame = new VideoGame();
        videoGame.loadGraphics();
        videoGame.multiplayerMode();
        videoGame.saveProgress();
        videoGame.unlockLevels();
        videoGame.playWithController();


        Ghost ghost = new Priest();
        ghost.haunt();
        ghost.disappear();
        ghost.makeWeirdNoises();
        ghost.possessObjects();
        ghost.floatAround();

        System.out.println("--------");

        Priest priest = new Priest();
        priest.throwObjects();
        priest.screamLoudly();
        priest.messWithElectronics();
        priest.openDoorsRandomly();
        priest.terrorizePeople();


        Glass glass = new Specs();
        glass.fragile();
        glass.heatResistance();
        glass.reflect();
        glass.material();
        glass.transparency();

        Specs specs = new Specs();
        specs.antiGlare();
        specs.frameMaterial();
        specs.lensType();
        specs.stylish();
        specs.uvProtection();

        Hospital hospital = new Dentist();
        hospital.admitPatient();
        hospital.provideTreatment();
        hospital.performSurgery();
        hospital.generateBill();
        hospital.dischargePatient();


        Dentist dentist = new Dentist();
        dentist.cleanTeeth();
        dentist.fillCavities();
        dentist.extractTooth();
        dentist.provideBraces();
        dentist.performRootCanal();


        Instrument instrument = new Piano();
        instrument.play();
        instrument.tune();
        instrument.repair();
        instrument.store();
        instrument.amplify();

        System.out.println("--------");

        Piano piano = new Piano();
        piano.strum();
        piano.adjustStrings();
        piano.changeTones();
        piano.plugIn();
        piano.fingerpicking();

        Job job = new Engineer();
        job.work();
        job.attendMeetings();
        job.receiveSalary();
        job.getPromotion();
        job.takeLeave();


        Engineer engineer = new Engineer();
        engineer.writeCode();
        engineer.debug();
        engineer.testSoftware();
        engineer.deployApplication();
        engineer.collaborateWithTeam();


        Lock lock = new Key();
        lock.secure();
        lock.open();
        lock.close();
        lock.rust();
        lock.breakLock();


        Key key = new Key();
        key.insert();
        key.rotate();
        key.duplicate();
        key.lost();
        key.matchLock();

        Magic magic = new SpellBook();
        magic.castSpell();
        magic.createIllusion();
        magic.summonCreature();
        magic.controlElements();
        magic.disappear();



        SpellBook spellBook = new SpellBook();
        spellBook.readSpell();
        spellBook.storeMagic();
        spellBook.unlockSecret();
        spellBook.createPotion();
        spellBook.enhancePower();

        Medicine medicine = new PainKiller();
        medicine.cureIllness();
        medicine.dosage();
        medicine.sideEffects();
        medicine.expiryDate();
        medicine.storageConditions();


        PainKiller painkiller = new PainKiller();
        painkiller.relievePain();
        painkiller.quickAction();
        painkiller.overTheCounter();
        painkiller.differentStrengths();
        painkiller.suitableForHeadache();

        Music music = new Guitar();
        music.instrument();
        music.pause();
        music.play();
        music.stop();
        music.volume();



        Guitar guitar = new Guitar();
        guitar.chord();
        guitar.sound();
        guitar.pluck();
        guitar.strum();
        guitar.strings();

        Human human = new Student();
        human.eat();
        human.sleep();
        human.walk();
        human.talk();
        human.think();


        Student student = new Student();
        student.study();
        student.attendClasses();
        student.doHomework();
        student.giveExams();
        student.participateInActivities();

        Photo photo = new Camera();
        photo.gallery();
        photo.click();
        photo.memories();
        photo.phone();
        photo.safe();


        Camera camera = new Camera();
        camera.capture();
        camera.delete();
        camera.focus();
        camera.light();
        camera.store();

        Plant plant = new Tree();
        plant.grow();
        plant.absorbWater();
        plant.photosynthesis();
        plant.oxygenRelease();
        plant.provideShade();

        System.out.println("-----------");

        Tree tree = new Tree();
        tree.produceFruits();
        tree.strongRoots();
        tree.provideWood();
        tree.habitatForAnimals();
        tree.seasonalChanges();


        Plate plate = new Spoon();

        plate.shape();
        plate.clean();
        plate.hold();
        plate.size();
        plate.material();

        System.out.println("-----------");

        Spoon spoon = new Spoon();

        spoon.eat();
        spoon.design();
        spoon.measure();
        spoon.stir();
        spoon.scoop();

        Port port = new Wire();

        port.checkStatus();
        port.connect();
        port.disconnect();
        port.powerSupply();
        port.transferData();

        System.out.println("-----------");

        Wire wire = new Wire();

        wire.ensureDurability();
        wire.flexibleUsage();
        wire.secureConnection();
        wire.shieldNoise();
        wire.transmitSignal();

        Potato potato = new Veggies();
        potato.grow();
        potato.beBoiled();
        potato.beFried();
        potato.beMashed();
        potato.beEaten();


        Veggies smartPotato = new Veggies();
        smartPotato.speak();
        smartPotato.runAway();
        smartPotato.startRebellion();
        smartPotato.becomeKing();
        smartPotato.takeOverTheWorld();

        Projector projector = new Pannel();
        projector.adjustFocus();
        projector.changeBrightness();
        projector.powerOff();
        projector.changeBrightness();
        projector.powerOn();

        Pannel pannel = new Pannel();
        pannel.adjustVolume();
        pannel.changeSource();
        pannel.displayMenu();
        pannel.enableSmartMode();
        pannel.touchInput();


        Resort resort = new Vacation();
        resort.bookRoom();
        resort.checkIn();
        resort.checkOut();
        resort.enjoyFacilities();
        resort.bookRoom();


        Vacation vacation = new Vacation();
        vacation.activities();
        vacation.holiday();
        vacation.relax();
        vacation.trip();
        vacation.tourists();

        Restaurant restaurant = new FastFoodRestaurant();
        restaurant.serveFood();
        restaurant.takeOrder();
        restaurant.acceptPayment();
        restaurant.cleanTables();
        restaurant.provideMenu();


        FastFoodRestaurant fastFood = new FastFoodRestaurant();
        fastFood.prepareBurger();
        fastFood.serveSoftDrinks();
        fastFood.offerTakeaway();
        fastFood.provideDriveThru();
        fastFood.giveDiscounts();

        Robot robot = new Machine();
        robot.move();
        robot.scanArea();
        robot.pickObjects();
        robot.recharge();
        robot.stop();


        Machine machine = new Machine();
        machine.recognizeSpeech();
        machine.processData();
        machine.makeDecisions();
        machine.performFacialRecognition();
        machine.automateTasks();

        Shape shape = new Circle();
        shape.draw();
        shape.area();
        shape.perimeter();
        shape.resize();
        shape.displayColor();


        Circle circle = new Circle();
        circle.calculateDiameter();
        circle.calculateCircumference();
        circle.drawSmoothEdges();
        circle.rotate();
        circle.fillColor();

        SmartDevice device1 = new SmartWatch();
        device1.powerOn();
        device1.connectToWiFi();
        device1.updateSoftware();
        device1.showBatteryStatus();
        device1.powerOff();



        SmartWatch watch = new SmartWatch();
        watch.trackSteps();
        watch.measureHeartRate();
        watch.displayNotifications();
        watch.setAlarm();
        watch.trackSleep();

        Spy spy = new Hacker();
        spy.gatherIntel();
        spy.disguise();
        spy.useGadgets();
        spy.escape();
        spy.decodeMessage();


        Hacker hacker = new Hacker();
        hacker.hackSecurity();
        hacker.stealData();
        hacker.writeVirus();
        hacker.eraseEvidence();
        hacker.takeControl();

        Stationery stationery = new Items();
        stationery.write();
        stationery.draw();
        stationery.store();
        stationery.organize();
        stationery.use();


        Items items = new Items();
        items.listItems();
        items.sharpen();
        items.erase();
        items.measure();
        items.staple();

        Superhero superhero = new IronMan();
        superhero.fly();
        superhero.fightVillains();
        superhero.useSuperStrength();
        superhero.savePeople();
        superhero.disguiseIdentity();


        IronMan ironMan = new IronMan();
        ironMan.activateSuit();
        ironMan.launchMissiles();
        ironMan.useArcReactor();
        ironMan.scanForThreats();
        ironMan.buildNewTechnology();

        Teacher teacher = new MathTeacher();
        teacher.teach();
        teacher.giveAssignment();
        teacher.takeAttendance();
        teacher.evaluatePapers();
        teacher.provideFeedback();


        MathTeacher mathTeacher = new MathTeacher();
        mathTeacher.solveEquations();
        mathTeacher.teachAlgebra();
        mathTeacher.conductMathQuiz();
        mathTeacher.explainGeometry();
        mathTeacher.checkHomework();

        Time timeMachine = new Watch();
        timeMachine.travelToPast();
        timeMachine.travelToFuture();
        timeMachine.createTimeParadox();
        timeMachine.meetHistoricalFigures();
        timeMachine.breakLawsOfPhysics();



        Watch watch1 = new Watch();
        watch1.seeTheEndOfTheUniverse();
        watch1.glitchInTime();
        watch1.duplicateYourself();
        watch1.fixBrokenTimeline();
        watch1.talkToYourFutureSelf();


        Traffic traffic = new Rules();

        traffic.red();
        traffic.green();
        traffic.signals();
        traffic.yellow();
        traffic.zebra();

        Rules rules = new Rules();

        rules.fine();
        rules.follow();
        rules.police();
        rules.right();
        rules.wrong();


        Train train = new Ticket();

        train.announce();
        train.slowDown();
        train.speedUp();
        train.stop();
        train.start();

        Ticket ticket = new Ticket();

        ticket.bookTicket();
        ticket.cancelTicket();
        ticket.checkAvailability();
        ticket.getFareDetails();
        ticket.printTicket();


        Transport transport = new Bus();

        transport.move();
        transport.stop();
        transport.fuel();
        transport.capacity();
        transport.route();


        Bus bus = new Bus();

        bus.collectFare();
        bus.fixedStops();
        bus.driverAndConductor();
        bus.publicTransport();
        bus.luggageSpace();


        TwoWheeler twoWheeler = new Bike();

        twoWheeler.start();
        twoWheeler.stop();
        twoWheeler.fuel();
        twoWheeler.horn();
        twoWheeler.accelerate();


        Bike bike = new Bike();

        bike.twoWheels();
        bike.handlebar();
        bike.kickStart();
        bike.fuelEfficiency();
        bike.lightweight();

        Vegetable vegetable = new Shop();

        vegetable.cook();
        vegetable.grow();
        vegetable.harvest();
        vegetable.nutrients();
        vegetable.sell();


        Shop shop = new Shop();

        shop.bill();
        shop.customerService();
        shop.display();
        shop.priceTag();
        shop.weigh();

        Vehicle vehicle = new Car();
        vehicle.start();
        vehicle.stop();
        vehicle.fuel();
        vehicle.moves();
        vehicle.carry();



        Car car = new Car();
        car.accelerate();
        car.brake();
        car.airConditioning();
        car.musicSystem();
        car.sunroof();
        Resistor resistor = new Capacitor();
        resistor.resistCurrent();
        resistor.generateHeat();
        resistor.reduceVoltage();
        resistor.limitCurrent();
        resistor.ohmsLaw();

        System.out.println("------------");

        Capacitor capacitor = new Capacitor();
        capacitor.storeCharge();
        capacitor.releaseCharge();
        capacitor.blockDC();
        capacitor.passAC();
        capacitor.smoothVoltage();


        Router router = new Modem();
        router.connectDevices();
        router.assignIP();
        router.routeTraffic();
        router.manageNetwork();
        router.firewallProtection();

        System.out.println("------------");

        Modem modem = new Modem();
        modem.connectToISP();
        modem.convertSignal();
        modem.checkDSL();
        modem.authenticateConnection();
        modem.resetConnection();


        BluetoothModule bluetoothModule = new IoTSensor();
        bluetoothModule.connectDevice();
        bluetoothModule.transferData();
        bluetoothModule.pairDevices();
        bluetoothModule.disconnectDevice();

        IoTSensor ioTSensor = new IoTSensor();
        ioTSensor.measureTemperature();
        ioTSensor.measureHumidity();
        ioTSensor.measureLightIntensity();
        ioTSensor.sendAlert();


        Inductor inductor = new Transformer();
        inductor.storeEnergy();
        inductor.opposeCurrentChange();
        inductor.generateMagneticField();
        inductor.coilTurns();
        inductor.reactToAC();

        System.out.println("------------");

        Transformer transformer = new Transformer();
        transformer.stepUpVoltage();
        transformer.stepDownVoltage();
        transformer.isolateCircuits();
        transformer.transferPower();
        transformer.maintainEfficiency();

        Diode diode = new Transistor();
        diode.allowCurrentOneWay();
        diode.blockReverseCurrent();
        diode.conduct();
        diode.protectCircuit();
        diode.rectification();

        System.out.println("------------");

        Transistor transistor = new Transistor();
        transistor.amplifySignal();
        transistor.switchCircuit();
        transistor.baseControl();
        transistor.currentGain();
        transistor.operateInModes();

        LED led = new SmartLED();
        led.emitLight();
        led.saveEnergy();
        led.longLasting();
        led.ecoFriendly();
        led.noHeat();

        System.out.println("------------");

        SmartLED smartLED = new SmartLED();
        smartLED.connectToWiFi();
        smartLED.controlWithApp();
        smartLED.changeColors();
        smartLED.scheduleLighting();
        smartLED.voiceControl();

        PCB pcb = new Relay();
        pcb.connectComponents();
        pcb.provideSupport();
        pcb.routeSignals();
        pcb.holdCircuits();
        pcb.ensureInsulation();

        System.out.println("------------");

        Relay relay = new Relay();
        relay.switchCircuit();
        relay.useElectromagnet();
        relay.handleHighCurrent();
        relay.autoControl();
        relay.protectCircuit();

        Computing computing = new Microprocessor();
        computing.processData();
        computing.storeData();
        computing.performCalculation();
        computing.displayOutput();
        computing.receiveInput();

        System.out.println("------------");

        Microprocessor micro = new Microprocessor();
        micro.controlDevices();
        micro.fetchInstruction();
        micro.decodeInstruction();
        micro.executeInstruction();
        micro.manageClockCycle();

        Microcontroller micro1 = new RAM();
        micro1.controlDevices();
        micro1.executeProgram();
        micro1.communicate();
        micro1.managePower();
        micro1.interactWithSensors();

        System.out.println("------------");

        RAM ram = new RAM();
        ram.readData();
        ram.writeData();
        ram.clearMemory();
        ram.provideBuffer();
        ram.increasePerformance();

        ROM rom = new GPU();
        rom.storeData();
        rom.readData();
        rom.bootSystem();
        rom.nonVolatile();
        rom.fixedContent();

        System.out.println("------------");

        GPU gpu = new GPU();
        gpu.renderGraphics();
        gpu.process3DModels();
        gpu.supportGaming();
        gpu.handleParallelTasks();
        gpu.enhancePerformance();

        CPU cpu = new HardDiskDrive();
        cpu.processInstructions();
        cpu.executeProgram();
        cpu.controlOperations();
        cpu.fetchData();
        cpu.decodeInstructions();

        System.out.println("------------");

        HardDiskDrive hdd = new HardDiskDrive();
        hdd.storeFiles();
        hdd.readDisk();
        hdd.writeDisk();
        hdd.spinPlatters();
        hdd.managePartitions();

        MotherBoard board = new SolidStateDrive();
        board.connectComponents();
        board.providePower();
        board.supportCPU();
        board.manageBIOS();
        board.controlDataFlow();

        System.out.println("------------");

        SolidStateDrive ssd = new SolidStateDrive();
        ssd.storeData();
        ssd.readFast();
        ssd.writeFast();
        ssd.noMovingParts();
        ssd.silentOperation();

        Network network = new PowerSupplyUnit();
        network.connectDevices();
        network.transmitData();
        network.assignIP();
        network.maintainStability();
        network.enableCommunication();

        System.out.println("------------");

        PowerSupplyUnit psu = new PowerSupplyUnit();
        psu.convertACtoDC();
        psu.controlVoltage();
        psu.powerOnSystem();
        psu.coolingFan();
        psu.efficiencyRating();


        NetworkInterfaceCard nic = new Switch();
        nic.connectToNetwork();
        nic.sendData();
        nic.receiveData();
        nic.macAddress();
        nic.manageSpeed();

        System.out.println("------------");

        Switch networkSwitch = new Switch();
        networkSwitch.increasePorts();
        networkSwitch.reduceCollisions();
        networkSwitch.manageBandwidth();
        networkSwitch.filterTraffic();
        networkSwitch.layerTwoDevice();

        Antenna antenna = new OpticalFiberCable();
        antenna.transmitSignal();
        antenna.receiveSignal();
        antenna.range();
        antenna.orientation();
        antenna.frequencyBand();

        System.out.println("------------");

        OpticalFiberCable fiber = new OpticalFiberCable();
        fiber.highBandwidth();
        fiber.lowLatency();
        fiber.immuneToEMI();
        fiber.flexible();
        fiber.secureTransmission();

        SatelliteDish dish = new RFIDTag();
        dish.receiveSignal();
        dish.transmitSignal();
        dish.adjustAngle();
        dish.detectChannel();
        dish.provideConnection();

        System.out.println("------------");

        RFIDTag tag = new RFIDTag();
        tag.storeData();
        tag.passiveOperation();
        tag.activateOnScan();
        tag.shortRange();
        tag.tagObject();

        IoTSensor iotSensor = new IoTSensor();
        iotSensor.measureTemperature();
        iotSensor.measureHumidity();
        iotSensor.measureLightIntensity();
        iotSensor.sendAlert();

        Bluetooth bluetooth = new Bluetooth();
        bluetooth.pair();
        bluetooth.connect();
        bluetooth.disconnect();
        bluetooth.scanDevices();
        bluetooth.sendData();

        ServoMotor servo = new StepperMotor();
        servo.rotate();
        servo.controlSpeed();
        servo.positionControl();
        servo.connectPower();
        servo.stop();

        StepperMotor stepper = new StepperMotor();
        stepper.stepMove();
        stepper.setStepAngle();
        stepper.increasePrecision();
        stepper.microStepping();
        stepper.fullRotation();

        Gearbox gearbox = new HydraulicPump();
        gearbox.changeGear();
        gearbox.transferPower();
        gearbox.reduceSpeed();
        gearbox.increaseTorque();
        gearbox.engageClutch();

        HydraulicPump pump = new HydraulicPump();
        pump.generatePressure();
        pump.circulateFluid();
        pump.controlFlow();
        pump.liftLoad();
        pump.operateActuator();

        PneumaticCylinder cylinder = new BallBearing();
        cylinder.extend();
        cylinder.retract();
        cylinder.convertAirToMotion();
        cylinder.controlSpeed();
        cylinder.operateValve();

        BallBearing bearing = new BallBearing();
        bearing.reduceFriction();
        bearing.supportRotatingParts();
        bearing.increaseEfficiency();
        bearing.withstandLoad();
        bearing.rotateSmoothly();


        Turbine turbine = new DronePropeller();
        turbine.rotate();
        turbine.generatePower();
        turbine.convertEnergy();
        turbine.spinBlades();
        turbine.maintainBalance();

        DronePropeller propeller = new DronePropeller();
        propeller.liftDrone();
        propeller.controlDirection();
        propeller.hover();
        propeller.adjustSpeed();
        propeller.stabilizeFlight();

        Multimeter multimeter = new Actuator();
        multimeter.measureVoltage();
        multimeter.measureCurrent();
        multimeter.measureResistance();
        multimeter.checkContinuity();
        multimeter.displayReading();

        Actuator actuator = new Actuator();
        actuator.convertSignal();
        actuator.push();
        actuator.pull();
        actuator.controlMovement();
        actuator.applyForce();

        SpectrumAnalyzer spectrumAnalyzer = new FunctionGenerator();
        spectrumAnalyzer.analyzeFrequency();
        spectrumAnalyzer.measureAmplitude();
        spectrumAnalyzer.displaySpectralData();
        spectrumAnalyzer.detectHarmonics();
        spectrumAnalyzer.setThreshold();

        FunctionGenerator functionGenerator = new FunctionGenerator();
        functionGenerator.generateWaveform();
        functionGenerator.controlFrequency();
        functionGenerator.adjustAmplitude();
        functionGenerator.modulateSignal();




        TemperatureSensor temperatureSensor = new PressureSensor();
        temperatureSensor.measureTemperature();
        temperatureSensor.calibrateSensor();
        temperatureSensor.displayTemperature();

        PressureSensor pressureSensor = new PressureSensor();
        pressureSensor.measurePressure();
        pressureSensor.calibratePressure();
        pressureSensor.displayPressure();

        StrainGauge strainGauge = new LoadCell();
        strainGauge.measureStrain();
        strainGauge.calibrateGauge();
        strainGauge.displayStrain();

        LoadCell loadCell = new LoadCell();
        loadCell.measureLoad();
        loadCell.calibrateLoadCell();
        loadCell.displayLoad();

        UltrasonicSensor ultrasonicSensor = new PHMeter();
        ultrasonicSensor.measureDistance();
        ultrasonicSensor.detectObjects();
        ultrasonicSensor.calibrateSensor();
        ultrasonicSensor.displayReading();

        PHMeter phMeter = new PHMeter();
        phMeter.measurePH();
        phMeter.calibratePHMeter();
        phMeter.displayPH();

        LidarSensor lidarSensor = new Kitchen();
        lidarSensor.measureDistance();
        lidarSensor.detectObjects();
        lidarSensor.scanArea();
        lidarSensor.calibrateSensor();
        lidarSensor.displayReading();

        Kitchen kitchen = new Kitchen();
        kitchen.controlAppliance();
        kitchen.detectCookingStatus();
        kitchen.monitorIngredients();

        ThreeDPrinter printer = new SmartLightBulb();
        printer.initializePrinter();
        printer.loadMaterial();
        printer.startPrinting();
        printer.stopPrinting();
        printer.displayProgress();

        SmartLightBulb lightBulb = new SmartLightBulb();
        lightBulb.changeColor();
        lightBulb.adjustBrightness();
        lightBulb.setTimer();
        lightBulb.controlViaApp();

        Drone drone = new VRHeadset();
        drone.startEngine();
        drone.fly();
        drone.capturePhotos();
        drone.streamVideo();
        drone.land();

        VRHeadset vr = new VRHeadset();
        vr.trackHeadMovement();
        vr.adjustLenses();
        vr.connectToPC();
        vr.launchVRApp();

        RaspberryPiCamera cam = new Smartwatchwaterproof();
        cam.initializeCamera();
        cam.captureImage();
        cam.recordVideo();
        cam.adjustFocus();
        cam.streamFeed();

        Smartwatchwaterproof wpwatch = new Smartwatchwaterproof();
        wpwatch.trackHeartRate();
        wpwatch.showNotifications();
        wpwatch.countSteps();
        wpwatch.setAlarm();

        Arduino arduino = new ESP32();
        arduino.powerOn();
        arduino.uploadCode();
        arduino.executeProgram();
        arduino.readSensorData();
        arduino.controlActuators();

        ESP32 esp = new ESP32();
        esp.connectWiFi();
        esp.enableBluetooth();
        esp.performOTAUpdate();
        esp.sleepMode();

        Stove stove = new Microwave();
        stove.ignite();
        stove.adjustFlame();
        stove.turnOff();
        stove.heatUtensil();
        stove.cookFood();

        Microwave microwave = new Microwave();
        microwave.setTimer();
        microwave.defrostFood();
        microwave.rotateTray();
        microwave.beepOnComplete();

        Refrigerator fridge = new Blender();
        fridge.powerOn();
        fridge.coolItems();
        fridge.defrost();
        fridge.adjustTemperature();
        fridge.storeFood();

        Blender blender = new Blender();
        blender.blendIngredients();
        blender.chop();
        blender.grind();
        blender.cleanAutomatically();

        Toaster toaster = new Kettle();
        toaster.powerOn();
        toaster.insertBread();
        toaster.heatElements();
        toaster.popUp();
        toaster.powerOff();

        Kettle kettle = new Kettle();
        kettle.boilWater();
        kettle.keepWarm();
        kettle.pourWater();
        kettle.measureLevel();

        Oven oven = new Dishwasher();
        oven.powerOn();
        oven.setTemperature();
        oven.cookFood();
        oven.turnOff();
        oven.openDoor();

        Dishwasher dishwasher = new Dishwasher();
        dishwasher.loadDishes();
        dishwasher.addDetergent();
        dishwasher.rinse();
        dishwasher.dryDishes();

        PressureCooker cooker = new FryingPan();
        cooker.addIngredients();
        cooker.closeLid();
        cooker.buildPressure();
        cooker.cookFood();
        cooker.releasePressure();

        FryingPan pan = new FryingPan();
        pan.fry();
        pan.flipFood();
        pan.sauté();
        pan.cleanPan();

        Saucepan pan1 = new CuttingBoard();
        pan1.addIngredients();
        pan1.heatContents();
        pan1.stirContents();
        pan1.pourOut();
        pan1.washPan();

        CuttingBoard board1 = new CuttingBoard();
        board1.chopVegetables();
        board1.sliceFruits();
        board1.diceIngredients();
        board1.sanitizeBoard();

        KnifeSet knife = new Spatula();
        knife.selectKnife();
        knife.cutVegetables();
        knife.sliceMeat();
        knife.sharpenKnife();
        knife.cleanKnife();

        Spatula spatula = new Spatula();
        spatula.flipFood();
        spatula.stirIngredients();
        spatula.serveFood();
        spatula.scrapePan();

        MeasuringCup cup = new MixingBowl();
        cup.measureFlour();
        cup.measureLiquid();
        cup.readScale();
        cup.pourIngredient();
        cup.cleanCup();

        MixingBowl bowl = new MixingBowl();
        bowl.mixIngredients();
        bowl.kneadDough();
        bowl.holdBatter();
        bowl.useWhisk();

        RollingPin pin = new Tongs();
        pin.prepareDough();
        pin.applyPressure();
        pin.rotateDough();
        pin.cleanPin();
        pin.storePin();

        Tongs tongs = new Tongs();
        tongs.gripFood();
        tongs.turnItems();
        tongs.serveFood();
        tongs.handleHotPans();

        Mathematics math = new Physics();
        math.studyAlgebra();
        math.solveEquations();
        math.learnGeometry();
        math.practiceCalculus();
        math.exploreStatistics();

        Physics physics = new Physics();
        physics.studyMechanics();
        physics.exploreThermodynamics();
        physics.learnElectromagnetism();
        physics.understandQuantumPhysics();


        ComputerScience cs = new History();
        cs.learnProgramming();
        cs.studyDataStructures();
        cs.exploreAlgorithms();
        cs.understandDatabases();
        cs.practiceProblemSolving();

        History history = new History();
        history.learnAncientCivilizations();
        history.exploreWorldWars();
        history.studyHistoricalFigures();
        history.analyzeCulturalChanges();

        Economics economics = new Psychology();
        economics.studySupplyDemand();
        economics.learnMicroeconomics();
        economics.exploreMacroeconomics();
        economics.analyzeMarkets();
        economics.understandPolicies();

        Psychology psychology = new Psychology();
        psychology.studyCognition();
        psychology.exploreBehavior();
        psychology.understandEmotions();
        psychology.researchMentalHealth();

        Geography geography = new PoliticalScience();
        geography.studyContinents();
        geography.learnClimates();
        geography.exploreLandforms();
        geography.understandMaps();
        geography.analyzeNaturalResources();

        PoliticalScience ps = new PoliticalScience();
        ps.studyGovernments();
        ps.explorePoliticalIdeologies();
        ps.understandInternationalRelations();
        ps.examineConstitutions();

        English english = new Sociology();
        english.studyGrammar();
        english.readLiterature();
        english.practiceWriting();
        english.improveVocabulary();
        english.enhanceCommunication();

        Sociology sociology = new Sociology();
        sociology.studySocialInstitutions();
        sociology.exploreCulture();
        sociology.understandSocialChange();
        sociology.examineSocialIssues();

        BusinessStudies business = new EnvironmentalScience();
        business.learnManagement();
        business.studyMarketing();
        business.understandFinance();
        business.exploreEntrepreneurship();
        business.analyzeBusinessLaws();

        EnvironmentalScience env = new EnvironmentalScience();
        env.studyEcosystems();
        env.explorePollution();
        env.understandClimateChange();
        env.promoteSustainability();

        Art art = new Song();
        art.studyColors();
        art.learnDrawing();
        art.explorePainting();
        art.understandDesign();
        art.analyzeArtHistory();

        Song song = new Song();
        song.learnInstruments();
        song.practiceSinging();
        song.studyMusicTheory();
        song.exploreGenres();


        FineArts fineArts = new Musics();
        fineArts.learnSketching();
        fineArts.studyPainting();
        fineArts.exploreSculpture();
        fineArts.understandVisualComposition();
        fineArts.analyzeArtMovements();

        Musics music1 = new Musics();
        music1.practiceInstruments();
        music1.developVocalSkills();
        music1.composeMusic();
        music1.studyMusicHistory();


        WashingMachine machine1 = new Iron();
        machine1.loadClothes();
        machine1.addDetergent();
        machine1.startWashCycle();
        machine1.rinseClothes();
        machine1.spinDry();

        Iron iron = new Iron();
        iron.pressClothes();
        iron.adjustTemperature();
        iron.useSteamFunction();
        iron.switchOff();

        VacuumCleaner vacuumClean = new AlarmClock();
        vacuumClean.powerOn();
        vacuumClean.startCleaning();
        vacuumClean.adjustSuctionPower();
        vacuumClean.emptyDustBin();
        vacuumClean.powerOff();

        AlarmClock alarm = new AlarmClock();
        alarm.setAlarm();
        alarm.ringAlarm();
        alarm.snoozeAlarm();
        alarm.displayTime();

        WallCalendar calendar = new TableLamp();
        calendar.showDate();
        calendar.markHolidays();
        calendar.flipPage();
        calendar.hangOnWall();
        calendar.checkDay();

        TableLamp lamp = new TableLamp();
        lamp.turnOn();
        lamp.adjustBrightness();
        lamp.rotateHead();
        lamp.turnOff();

        Sofa sofa = new Wardrobe();
        sofa.provideSeating();
        sofa.addCushions();
        sofa.recline();
        sofa.foldOutBed();
        sofa.cleanFabric();

        Wardrobe wardrobe = new Wardrobe();
        wardrobe.storeClothes();
        wardrobe.organizeShelves();
        wardrobe.lockWardrobe();
        wardrobe.openDoors();

        Mirror mirror = new Fan();
        mirror.reflectImage();
        mirror.mountOnWall();
        mirror.cleanSurface();
        mirror.adjustAngle();
        mirror.decorateRoom();

        Fan fan = new Fan();
        fan.switchOn();
        fan.adjustSpeed();
        fan.rotateBlades();
        fan.switchOff();

        AirConditioner ac = new Mattress();
        ac.powerOn();
        ac.setTemperature();
        ac.startCooling();
        ac.swingFlaps();
        ac.powerOff();

        Mattress mattress = new Mattress();
        mattress.provideComfort();
        mattress.adjustFirmness();
        mattress.supportSpine();
        mattress.changeCovers();

        Pillows pillow = new Curtains();
        pillow.provideSupport();
        pillow.adjustShape();
        pillow.changeCovers();
        pillow.fluff();
        pillow.placeOnBed();

        Curtains curtain = new Curtains();
        curtain.blockLight();
        curtain.enhanceDecor();
        curtain.slideOpen();
        curtain.slideClose();

        Bookshelf shelf = new Desk();
        shelf.storeBooks();
        shelf.organizeShelves();
        shelf.supportWeight();
        shelf.cleanDust();
        shelf.displayItems();

        Desk desk = new Desk();
        desk.writeOnSurface();
        desk.openDrawers();
        desk.plugDevices();
        desk.useLaptop();

        Chair chair = new Carpet();
        chair.provideSeating();
        chair.adjustHeight();
        chair.supportBack();
        chair.movePosition();
        chair.rotate();

        Carpet carpet = new Carpet();
        carpet.enhanceDecor();
        carpet.provideWarmth();
        carpet.reduceNoise();
        carpet.cushionFootsteps();

        MirrorStand stand = new Comb();
        stand.holdMirror();
        stand.rotateMirror();
        stand.adjustHeight();
        stand.supportStability();
        stand.enhanceVanitySetup();

        Comb comb = new Comb();
        comb.detangleHair();
        comb.styleHair();
        comb.cleanHair();
        comb.maintainScalp();

        Bread bread = new Jam();
        bread.slice();
        bread.toast();
        bread.pack();
        bread.checkFreshness();
        bread.serve();

        Jam jam = new Jam();
        jam.spread();
        jam.addFlavor();
        jam.preserve();
        jam.refrigerate();



    }
}
