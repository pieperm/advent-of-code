import math

file = open('input.txt', 'r')
total_fuel1 = 0
total_fuel2 = 0

def get_fuel(initial_fuel):
    fuel = math.floor(initial_fuel / 3) - 2
    if fuel <= 0:
        return initial_fuel
    else:
        return initial_fuel + get_fuel(fuel)

for line in file:
    mass = int(line)
    fuel = math.floor(mass / 3) - 2
    total_fuel1 += fuel
    total_fuel2 += get_fuel(fuel)

print('Part 1 Fuel:', total_fuel1)
print('Part 2 Fuel:', total_fuel2)