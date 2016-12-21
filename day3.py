sum = 0
def triangle(xval,yval,zval):
    return xval < yval + zval and yval < xval + zval and zval < xval + yval

with open ("d3_input.txt", "r") as inputfile:
    for line in inputfile.read().splitlines():
            (xval,yval,zval) = [int(s) for s in line.split()]
            if triangle(xval,yval,zval) == True:
                sum += 1
    print sum
