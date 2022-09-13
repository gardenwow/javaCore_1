public class Main {
    public static void main(String[] args) {
        Griffendor GarryPotter = new Griffendor("GarryPotter",10,8,5,6,7);
        Griffendor GermionaGrend = new Griffendor("GermionaGrend",3,2,3,5,1);
        Griffendor RonYizly = new Griffendor( "RonYizly",1,2,3,4,5);
        Slizerin DrakoMalfoi = new Slizerin( "DrakoMalfoi",2,5,6,7,8,7,8);
        Slizerin GrehemMoneteg = new Slizerin("GrehemMoneteg",2,3,4,5,1,6,7);
        Slizerin GregoryGoil = new Slizerin("GregoryGoil",7,6,8,3,7,7,8);
        Peffendyi ZahariaSmit = new Peffendyi("ZahariaSmit",4,5,7,8,9);
        Peffendyi SedrikDiggori = new Peffendyi("SedrikDiggori",4,5,7,2,2);
        Peffendyi DjastinFinchAletcher = new Peffendyi("DjastinFinchAletcher",4,5,5,7,1);
        Kogtevran CHang = new Kogtevran("CHang",2,4,5,6,7,8);
        Kogtevran PadmaPatil = new Kogtevran("PadmaPatil",5,6,7,8,2,5);
        Kogtevran MarkysBelbi = new Kogtevran("MarkysBelbi",4,6,7,8,2,2);
        Hogwarts[] hogwarts = new Hogwarts[]{GarryPotter,
                GermionaGrend,
                RonYizly,
                DrakoMalfoi,
                GrehemMoneteg,
                GregoryGoil,
                ZahariaSmit,
                SedrikDiggori,
                DjastinFinchAletcher,
                CHang,
                PadmaPatil,
                MarkysBelbi};
       /* тут я пытался через зубчатый массив попробовать решить но у меня не получилось,
       может вы накинете идей как это лучше сделать.
       Griffendor[] griffendors = new Griffendor[]{GarryPotter, GermionaGrend, RonYizly};
        Slizerin[] slizerins = new Slizerin[]{DrakoMalfoi, GrehemMoneteg,GregoryGoil};
        Peffendyi[] peffendyis = new Peffendyi[]{ZahariaSmit, SedrikDiggori, DjastinFinchAletcher};
        Kogtevran[] kogtevrans = new Kogtevran[]{CHang, PadmaPatil, MarkysBelbi};
        Hogwarts[][] hogwarts1 = new Hogwarts[4][];
        hogwarts1[0] = new Griffendor[]{GarryPotter, GermionaGrend, RonYizly};
        hogwarts1[1] = new Slizerin[]{DrakoMalfoi, GrehemMoneteg, GregoryGoil};
        hogwarts1[2] = new Peffendyi[]{ZahariaSmit,
                SedrikDiggori,
                DjastinFinchAletcher};
        hogwarts1[3] = new Kogtevran[]{CHang,
                PadmaPatil,
                MarkysBelbi};
        PrintMaxPower printMaxPower = new PrintMaxPower();*/
        //printMaxPower.printall(hogwarts1);
        PrintMaxPowerNormalin printMaxPowerNormalin = new PrintMaxPowerNormalin();
        printMaxPowerNormalin.print(GarryPotter, GermionaGrend);
        printMaxPowerNormalin.print(DrakoMalfoi, GrehemMoneteg);
        printMaxPowerNormalin.print(ZahariaSmit, SedrikDiggori);
        printMaxPowerNormalin.print(CHang, MarkysBelbi);
        printMaxPowerNormalin.printAllPower(DrakoMalfoi, GarryPotter);
        printMaxPowerNormalin.PrintFFs(hogwarts);

    }



    }


