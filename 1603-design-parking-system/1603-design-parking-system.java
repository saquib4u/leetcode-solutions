class ParkingSystem {
    
    int[] slot=new int[4];
    
    public ParkingSystem(int big, int medium, int small) {
        slot[1]=big;
        slot[2]=medium;
        slot[3]=small;
    }
    
    public boolean addCar(int carType) {
        
        if(slot[carType]==0){
            return false;
        }
        
        slot[carType]--;
        return true;
        
    }
}


/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */