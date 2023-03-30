import sys

# parse parameters
if len(sys.argv) != 3:
    print(f'Usage: {sys.argv[0]} <a> <b>\n')
    sys.exit(1)
a = float(sys.argv[1])
b = float(sys.argv[2])

f = open("out.csv", "w")

# rendering loop
x = -10.0
while x < 10.0:

    y = a*x + b

    f.write(f'{x},{y}\n')
    x += 0.1

f.close()
