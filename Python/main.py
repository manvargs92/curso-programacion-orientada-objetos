from car import Car

if __name__ == "__main__":
    car = Car()

    car.license = "AMS569"
    car.driver = "Antonio Banderas"

    print(vars(car))

    car2 = Car()

    car2.license = "ZML874"
    car2.driver = "Tonia López"

    print(vars(car2))

