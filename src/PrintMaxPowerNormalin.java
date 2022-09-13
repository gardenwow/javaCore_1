public class PrintMaxPowerNormalin {
    public void print(Griffendor first, Griffendor second){
        int maxFirst = first.getBravery() + first.getHonor() + first.getNobility();
        int maxSecond = second.getBravery() + second.getHonor() + second.getNobility();
        if (maxFirst > maxSecond){
            System.out.println(first.getName() + " best of Grieffendors, worse than " + second.getName());
        } else System.out.println(second.getName() + " best of Grieffendors, worse than " + first.getName());
        }
    public void print(Slizerin first, Slizerin second) {
        int maxFirst = first.getAmbition() + first.getCunning() + first.getDetermination() + first.getResourcefulness() + first.getLustForPower();
        int maxSecond = second.getAmbition() + second.getCunning() + second.getDetermination() + second.getResourcefulness() + second.getLustForPower();
        if (maxFirst > maxSecond){
            System.out.println(first.getName() + " best of Slizerin, worse than " + second.getName());
        } else System.out.println(second.getName() + " best of Slizerin, worse than " + first.getName());
    }
    public void print(Peffendyi first, Peffendyi second) {
        int maxFirst = first.getHonest() + first.getHardWorking() + first.getLoyal();
        int maxSecond = second.getHonest() + second.getHardWorking() + second.getLoyal();
        if (maxFirst > maxSecond){
            System.out.println(first.getName() + " best of Pyffendyi, worse than " + second.getName());
        } else System.out.println(second.getName() + " best of Pyffendyi, worse than " + first.getName());
    }
    public void print(Kogtevran first, Kogtevran second) {
        int maxFirst = first.getCreativy() + first.getSmart() + first.getWise() + first.getWitty();
        int maxSecond = second.getCreativy() + second.getSmart() + second.getWise() + second.getWitty();
        if (maxFirst > maxSecond){
            System.out.println(first.getName() + " best of Kogtevran, worse than " + second.getName());
        } else System.out.println(second.getName() + " best of Kogtevran, worse than " + first.getName());
    }
    public void printAllPower(Hogwarts first, Hogwarts second){
        int maxFirst = first.getPowerMagic() + first.getRangeTrancgressiv();
        int maxSecond = second.getPowerMagic() + second.getRangeTrancgressiv();
        if (maxFirst > maxSecond){
            System.out.println(first.getName() + " has more magic power than " + second.getName());
        } else {
            System.out.println(second.getName() + " has more magic power than " + first.getName());
        }
        }
        public void PrintFFs(Hogwarts[] hogwarts){
            for (int i = 0; i < hogwarts.length; i++) {
                System.out.println(hogwarts[i]);

            }
        }
    }



