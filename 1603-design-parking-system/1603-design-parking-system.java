class ParkingSystem {
    int parkings[] = {0, 0, 0};

public ParkingSystem(int big, int medium, int small) {
    this.parkings[0] = big;
    this.parkings[1] = medium;
    this.parkings[2] = small;
}

public boolean addCar(int carType) {
    return this.parkings[--carType]-- > 0;
}
    
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */