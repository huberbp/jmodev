import sys

# parse parameters
if len(sys.argv) != 5:
    print(f'Usage: {sys.argv[0]} <a> <b> <c> <d>\n')
    sys.exit(1)
a = float(sys.argv[1])
b = float(sys.argv[2])
c = float(sys.argv[3])
d = float(sys.argv[4])

f = open("out.csv", "w")

# rendering loop
x = -10.0
while x < 10.0:

    y = a*(x**3) + b*(x**2) + c*x + d

    f.write(f'{x},{y}\n')
    x += 0.1

f.close()
